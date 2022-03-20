package com.JiangHuang.week4;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet(name = "RegisterServlet",urlPatterns = {"/register"})
public class RegisterServlet extends HttpServlet {
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    @Override
    public void init () throws ServletException {
        ServletContext context = this.getServletContext();
        String driver = context.getInitParameter("driver");
        String url = context.getInitParameter("url");
        String username = context.getInitParameter("username");
        String password = context.getInitParameter("password");

        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url,username,password);
            //System.out.println("connection-->"+con);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        String sql = "select * from [usertable]";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            out.print("<html>");
            out.print("<body>");
            out.print("<table border=\"1\">");
            out.print("<tr>");
                out.print("<td>ID</td>");
                out.print("<td>userName</td>");
                out.print("<td>passWord</td>");
                out.print("<td>Email</td>");
                out.print("<td>Gender</td>");
                out.print("<td>Birthday</td>");
            out.print("<tr>");
            out.print("<tr>");
            while (rs.next()){
                String id = rs.getString("ID");
                String username = rs.getString("userName");
                String passWord = rs.getString("passWord");
                String email = rs.getString("Email");
                String gender= rs.getString("Gender");
                String birthday = rs.getString("Birthday");
                out.print("<td>id</td>");
                out.print("<td>username</td>");
                out.print("<td>passWord</td>");
                out.print("<td>email</td>");
                out.print("<td>gender</td>");
                out.print("<td>birthday</td>");
            }
            out.print("</tr>");
            out.print("</html>");
            out.print("</body>");

        } catch (SQLException e) {
            e.printStackTrace();
        }




    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

