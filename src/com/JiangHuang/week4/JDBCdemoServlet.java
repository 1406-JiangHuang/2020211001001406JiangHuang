package com.JiangHuang.week4;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "JDBCdemoServlet",urlPatterns = {"/jdbc"},
        initParams = {
        @WebInitParam(name = "driver",value = "com.microsoft.sqlserver.jdbc.SQLServerDriver"),
                @WebInitParam(name = "url",value = "jdbc:sqlserver://localhost:51397;DatabaseName=Test"),
                @WebInitParam(name = "username",value = "sa"),
                @WebInitParam(name = "password",value = "147258")
        },
        loadOnStartup = 1
)
public class JDBCdemoServlet extends HttpServlet {
    @Override
    public void init(ServletConfig config) throws ServletException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    public void destroy() {

    }
}
