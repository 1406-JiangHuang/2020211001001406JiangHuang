package com.JiangHuang.week2.demo;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        PrintWriter writer = response.getWriter();
        writer.println("Name:JiangHuang\n ID: 2020211001001406\n Date and Time : 3/6");
    }
    public void doPoat(HttpServletRequest request,HttpServletResponse response){

    }
}
