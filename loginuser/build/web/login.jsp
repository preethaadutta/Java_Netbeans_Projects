<%-- 
    Document   : login
    Created on : 02-Dec-2022, 9:51:58 am
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>login Page</title>
    </head>
    <body>
           <div><form action="<%=request.getContextPath()%>/login" method="get">
                name:<input type="text" name="n1" />
                pwd:<input type="password" name="p1" />
                <input type="submit" value="enter"  >    
            </form></div>
    </body>
</html>
