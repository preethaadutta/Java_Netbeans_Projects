<%-- 
    Document   : sessioncheck
    Created on : 30-Oct-2022, 8:53:24 pm
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>


    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<html>
    <head>
        <title>uservisit</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url = "jdbc:mysql://localhost:3306/jdb1"
         user = "root"  password = "" />
        <div>
            <sql:query dataSource = "${db}" var = "result">
         SELECT * from user1;
      </sql:query>
         
 
      <table border = "1" width = "100%">
         <tr>
            <th>user name</th>
            <th>pwd</th>
            <th>visit</th>
                 </tr>
         
         <c:forEach var = "row" items = "${result.rows}">
            <tr>
               <td><c:out value = "${row.username}"/></td>
               <td><c:out value = "${row.pwd}"/></td>
              <td><c:out value = "${row.visit}"/></td>
            </tr>
         </c:forEach>
      </table>
            </body>
</html>

