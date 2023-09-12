<%-- 
    Document   : uservisit
    Created on : 30-Oct-2022, 9:40:38 pm
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import = "java.io.*,java.util.*,java.sql.*"%>
<%@ page import = "javax.servlet.http.*,javax.servlet.*" %>


    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix = "sql"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" url = "jdbc:mysql://localhost:3306/jdb1"
         user = "root"  password = "" />
        
        <c:set var="uname" value="${param.n1}"/>
        <c:set var="pwd" value="${param.n2}" />
        
        <sql:query dataSource = "${db}" var = "result">
         SELECT * from user1 where username=? and pwd=?;
         <sql:param value="${uname}" />
         <sql:param value="${pwd}" />
         
      </sql:query>
      <table border = "1" width = "100%">
         <tr>
            <th>user name</th>
            
            <th>visit</th>
                 </tr>
         
         <c:forEach var = "row" items = "${result.rows}">
            <tr>
               <td><c:out value = "${row.username}"/></td>
            
               <c:set var="v" value="${row.visit}" />
              <td><c:out value = "${v+1}"/></td>
            </tr>
         </c:forEach>
         <sql:update dataSource = "${db}" var = "up">
             UPDATE user1 SET visit='${v+1}' where username=? ;
         <sql:param value="${uname}" /> 
         </sql:update>
      </table>  
        
    </body>
</html>
