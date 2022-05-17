<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: Planck

--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Demo 3 - week11</title>
</head>
<body>
<%
    //Array
    String[] firstName = {"Bill","Scott","Larry"};
    //List
    ArrayList<String> lastName = new ArrayList<>();
    lastName.add("Ellison");
    lastName.add("Gates");
    lastName.add("McNealy");
    //Map
    HashMap<String,String> companyName = new HashMap<>();
    companyName.put("Ellison","Sun");
    companyName.put("Gates","Oracle");
    companyName.put("McNealy","Micosoft");
    request.setAttribute("fname",firstName);
    request.setAttribute("lname",lastName);
    request.setAttribute("company",companyName);
%>

<h2> get data from Array --> List --> Map - using EL code</h2>
<ul>
    <li>${fname["0"]}-->${lname["0"]}-->${company["Ellison"]}</li>
    <li>${fname["1"]}-->${lname["1"]}-->${company[lname["1"]]}</li>
    <li>${fname["2"]}-->${lname["2"]}-->${company[lname["2"]]}</li>
</ul>
</body>
</html>
