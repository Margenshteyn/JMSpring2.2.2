<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div align="center">
<table border="1" cellpadding="3">
<c:choose>
    <c:when test="${param.locale.equals('ru')}">
        <h1> МАШИНЫ </h1>
        <tr>
            <td><strong>Идентификатор</strong></td>
            <td><strong>Наименование</strong></td>
            <td><strong>Серия</strong></td>
        </tr>
    </c:when>
    <c:otherwise>
        <h1> CARS </h1>
        <tr>
            <td><strong>Id</strong></td>
            <td><strong>Name</strong></td>
            <td><strong>Series</strong></td>
        </tr>
    </c:otherwise>
</c:choose>
   <%-- <c:if test="${param.locale.equals('en')}">
        <h1> CARS </h1>
        <tr>
            <td><strong>Id</strong></td>
            <td><strong>Name</strong></td>
            <td><strong>Series</strong></td>
        </tr>
    </c:if>
    <c:if test="${param.locale.equals('ru')}">
        <h1> МАШИНЫ </h1>
        <tr>
            <td><strong>Идентификатор</strong></td>
            <td><strong>Наименование</strong></td>
            <td><strong>Серия</strong></td>
        </tr>
    </c:if>--%>

    <tbody>
    <c:forEach var="car" items="${cars}">
        <tr>
            <td><c:out value="${car.id}"/></td>
            <td>${car.name}</td>
            <td>${car.series}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</div>
</body>
</html>
