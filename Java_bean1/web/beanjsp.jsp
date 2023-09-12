<%-- 
    Document   : beanjsp
    Created on : Dec 10, 2022, 9:53:50 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Access bean from JSP</h1>
        <jsp:useBean id="student" class="studentbean.student" >
            
            <jsp:setProperty name="student" property="id" value="20"></jsp:setProperty>
            <jsp:setProperty name="student" property="name" value="madhu"></jsp:setProperty>
        </jsp:useBean>
        <h2>Bean Data </h2> 
        <h3>Student id: </h3><jsp:getProperty name="student" property="id"></jsp:getProperty>
        <h3> student name:</h3><jsp:getProperty name="student" property="name"></jsp:getProperty>
    </body>
</html>
