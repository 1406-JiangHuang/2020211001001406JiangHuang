<%@include file="header.jsp"%>
<h1>Login</h1>
<form action="/configtest/login" method="post">
    username:<input type="text" name="username"/><br>
    password:<input type="password" name="userpwd"/><br>
    <input type="submit" value="Login"/>
</form>

<%@include file="footer.jsp"%>