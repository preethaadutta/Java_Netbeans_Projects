<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create tags </title>
    </head>
    <body>
        <c:set var="name" value="jsp is awesome">
        </c:set>
        <c:out value="${name}">
        </c:out>
        <c:if test="${3>2}">
            <h2> this is true</h2>
        </c:if>
    </body>
</html>