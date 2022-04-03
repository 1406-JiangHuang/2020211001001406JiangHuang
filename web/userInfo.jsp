<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022-04-03
  Time: 20:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<h1>user info</h1>
<table>
    <tr>
        <td>Username:</td><td><%=request.getAttribute("username")%></td>
    <tr></tr>
        <td>Password:</td><td><%=request.getAttribute("password")%></td>
    <tr></tr>
        <td>Email:</td><td><%=request.getAttribute("email")%></td>
    <tr></tr>
        <td>Gender:</td><td><%=request.getAttribute("gender")%></td>
    <tr></tr>
        <td>Birth date:</td><td><%=request.getAttribute("birthDate")%></td>
    <tr></tr>
    </tr>
</table>
<%@include file="footer.jsp"%>