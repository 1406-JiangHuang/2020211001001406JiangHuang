package com.JiangHuang.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter("/*")
public class FrontEndAuthenticationFilter implements Filter {
    private HttpServletRequest httpRequest=null;
    public static final String[] loginRequiredURLs={"/updateUser","/logout","/cart",
            "/accountDetails","/order"};
        @Override
        public void init(FilterConfig filterConfig) throws ServletException {

        }

        @Override
        public void doFilter(ServletRequest request, ServletResponse response, FilterChain Chain)
            throws IOException, ServletException {

            httpRequest = (HttpServletRequest)request;//change ServletRequest to HttpServletRequest
            //get path
            String path = httpRequest.getRequestURI().substring(httpRequest.getContextPath().length());
            if (path.startsWith("/admin/")){
                Chain.doFilter(request,response);//go to next filter -AdminAuthenticationFilter
                return;
            }

            //get session
            HttpSession session = httpRequest.getSession(false);
            boolean isLoggedIn = (session!=null && session.getAttribute("user")!=null);
            String loginURI = httpRequest.getContextPath()+"/login";//for public user  - not admin
            boolean isLoginRequest = httpRequest.getRequestURI().equals(loginURI);
            boolean isLoginPage = httpRequest.getRequestURI().endsWith("login");

            if (isLoggedIn && (isLoginRequest || isLoginPage)){

                httpRequest.getRequestDispatcher("/").forward(request,response);//go to home -public user

            }else if (!isLoggedIn && isLoginRequired()){//check in loginRequiredURLs array

                request.getRequestDispatcher("/login").forward(request,response);
            }else {

                Chain.doFilter(request,response);
            }

        }

        private boolean isLoginRequired() {
            //update 1 url not uri
        String requestURI = httpRequest.getRequestURI().toString();//get url

        for (String loginRequiredURL : loginRequiredURLs){//get one by one from array
            //check
            if (requestURI.contains(loginRequiredURL)){
                return true;
            }
        }
        return false;
    }

    @Override
    public void destroy() {

    }
}
