<%-- 
    Document   : index
    Created on : Sep 18, 2022, 11:24:01 AM
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
        <h1>Hello World!</h1>
        <table border="1">
            <%! int s=0; %>
            <% for ( int g = 1; g <= 10; g++ ) {s+=g;} %>
            <tr>
            <td>Sum from 0 to 10=</td>
            <td><%=s %></td>
            </tr>
        </table>
    </body>
</html>
