<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2022-05-23
  Time: 8:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>UsingServlets</title>
</head>
<body>
<h2> I Am in MyJsp.jsp</h2>
<form method="post" action=<%=request.getContextPath()%>/Lab1/MyDearJsp.jsp>
    Name :<input type="text" name="name"> <br/>
    Class :<input type="text" name="cls"><br/>
    Id :<input type="text" name="id"><br/>
    <input type="submit" name = "submit" value="Send data to server">
</form>
</body>
</html>
