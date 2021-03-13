<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>main-page</title>
</head>
<body>

<h1>Hello Spring MVC!</h1>

<%--<form action="/form" method="get">--%>
<%--    <input type="text" name="first_name">--%>
<%--    <input type="text" name="last_name">--%>
<%--    <input type="submit" value="submit">--%>
<%--</form>--%>
<a href="/form?parameter_one=1000">click here</a><br>
<a href="/form/500/Hassan">click here to test path variable</a><br>
<a href="/second?message=test_forwarding">click here to test forwarding</a><br>
<a href="/testSessionAtt">test session att</a>

<p>${sessionScope.get("myModel")}</p>
<p>${sessionScope.get("myNumber")}</p>

</body>
</html>


