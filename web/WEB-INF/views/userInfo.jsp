<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="header.jsp"%>
<h1> User Info </h1>
<%
    /*
    Cookie [] allcookies = request.getCookies();
    for(Cookie c : allcookies){
        out.println("<br/>"+c.getName()+" --- " + c.getValue());
    }*/
%>
<%
    User u=(User) session.getAttribute("user");
%>
<table>
    <tr>
        <td>Username:</td><td><%=u.getUsername()%></td>
    </tr><tr>
    <td>Password:</td><td><%=u.getPassword()%></td>
</tr><tr>
    <td>Email:</td><td><%=u.getEmail()%></td>
</tr><tr>
    <td>Gender:</td><td><%=u.getGender()%></td>
</tr><tr>
    <td>Birth Date:</td><td><%=u.getBirthDate()%></td>
</tr><tr>
    <a href="updateUser">Update User</a>
</tr>
</table>

<%@include file="footer.jsp"%>