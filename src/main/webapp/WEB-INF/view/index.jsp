<%@ page contentType="text/html;charset=UTF-8"
         language="java" isELIgnored="false" %>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>index</title>
</head>
<body>
<h1>
    This is index.jsp page
</h1>

<c:forEach var="name" items="${names}">
    <h3>${name}</h3>
</c:forEach>

<p>${message}</p>
<p>${myName}</p>

</body>
</html>


