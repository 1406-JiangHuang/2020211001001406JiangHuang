package com.JiangHuang.week4;

import javax.servlet.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class ConfigDemoServlet extends GenericServlet {

    @Override
    public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        ServletConfig config = this.getServletConfig();
        Enumeration<String> initParameterNames = config.getInitParameterNames();

        while (initParameterNames.hasMoreElements()){
            String parameterName = initParameterNames.nextElement();
            String paremeterValue = config.getInitParameter(parameterName);
            out.print(parameterName+"="+paremeterValue);
            out.print("<br>");
        }
    }
}
