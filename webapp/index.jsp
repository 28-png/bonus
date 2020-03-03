<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<jsp:useBean id="items" scope="request" type="java.util.List"/>
<c:forEach var="item" items="${items}">
    <div class="item">
        <h2>${item.name}</h2>
        <p>Description: ${item.priceInCents}</p>
    </div>
</c:forEach>

</body>
</html>
