<%@include file="header.jsp"%>
<h2> Welcome to my online shop home page. </h2>
<form method="get" action="/configtest/search" target="_blank">
    <input type="text" name="txt" size="30"/>
    <select name="search">
        <option value="baidu">Baidu</option>
        <option value="bing"> Bing</option>
        <option value="google">Goole</option>
    </select>
    <input type="submit" value="Search"/>
</form>
<%@include file="footer.jsp"%>