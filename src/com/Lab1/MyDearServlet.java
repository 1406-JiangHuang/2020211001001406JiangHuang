package com.Lab1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "MyDearServlet", value = "/MyDearServlet")
public class MyDearServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("Lab1/MyJsp.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String cla = request.getParameter("cls");
        String id = request.getParameter("id");
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<HEAD><TITLE>UsingServlets</TITLE></HEAD>");
        out.println("<BODY>");
        out.println("name: " + name +"<br/>" );
        out.println("submit: " + "Send data to server"+"<br/>" );
        out.println("class: " + cla +"<br/>");
        out.println("id: " + id +"<br/>");
        out.println("</BODY>");
    }
}