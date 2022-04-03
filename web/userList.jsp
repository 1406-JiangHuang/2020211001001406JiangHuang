<%@ page import="java.sql.ResultSet" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022-04-03
  Time: 19:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>

<h1>user list</h1>
<table border="1">
    <tr>
        <td>Id</td>Username<td>password</td><td>Email</td>Gender<td>Birthday</td>
    </tr>
    <tr>
        <td>no data!!!</td>
    </tr>
    <%
      ResultSet rs = (ResultSet) request.getAttribute("name");
      if (rs ==null){

      }
    %>
    <%else{
        PrintWriter writer = response.getWriter();
        writer.println("<br>username:"+rs.getString("username"));
        writer.println("<br>password:"+rs.getString("password"));
        writer.println("<br>email:"+rs.getString("email"));
        writer.println("<br>gender:"+rs.getString("gender"));
        writer.println("<br>birthDate"+rs.getString("birthDate"));
        writer.close();
        }

    %>
</table>
<%@include file="footer.jsp"%>