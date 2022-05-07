<%@ page import="com.JiangHuang.week10.demo.StringBean" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Demo-2-week 10</title>
</head>
<body>
<h1>Use java code to access String bean</h1>
<jsp:useBean id="bean" class="com.JiangHuang.week10.demo.StringBean"/>
<%

%>
<jsp:setProperty name="bean" property="message" value='<%=request.getParameter("message")%>'/>
Message (using java code): <%=bean.getMessage()%>

<h2>Use usebean to access Stringbean class in jsp</h2>
message (using getProperty) : <jsp:getProperty name="bean" property="message"/>

</body>
</html>
