package com.JiangHuang.week3.demo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LifeCycleServlet extends HttpServlet {
    public LifeCycleServlet() {
        System.out.println("i am in constructor --> LifeCycleServlet()");
    }
    public void init(){
        System.out.println("i am in init()");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("i am in service() --> doGet()");
    }

    @Override
    public void destroy() {
        System.out.println("i am in destroy()");
    }
}
