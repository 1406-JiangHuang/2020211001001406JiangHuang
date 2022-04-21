<%@include file="header.jsp"%>
<h1>Login</h1>
<%
    if (!(request.getAttribute("message")==null)) {
        out.print("<h3>" + request.getAttribute("message") + "</h3>");
    }
%>
<form action="login" method="post">
    username:<input type="text" name="username"/><br>
    password:<input type="password" name="password"/><br>
    <input type="submit" value="Login"/>
</form>

<%@include file="footer.jsp"%>