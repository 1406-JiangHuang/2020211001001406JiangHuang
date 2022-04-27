package com.JiangHuang.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.util.logging.Filter;
import java.util.logging.LogRecord;

@WebFilter(filterName = "LoginFilter",
        urlPatterns = {"/hello"}
)
public class LoginFilter implements Filter {

    public void init(FilterConfig config) throws ServletException {
    }

    public void destroy() {
    }
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
            throws ServletException, IOException {
        System.out.println("i am in LoginFilter --> doFilter()- before servlet(request come here )");
        chain.doFilter(request, response);
        System.out.println("i am in LoginFilter --> doFilter()- after servlet(request come here )");
    }

    @Override
    public boolean isLoggable(LogRecord record) {
        return false;
    }
}
