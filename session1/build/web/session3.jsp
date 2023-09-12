<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to this page</title>
    </head>
    <body>
        <h1>Welcome</h1>
        <%=session.getAttribute("username") %>
        <% out.println("session creation time:"+session.getCreationTime()); %>
    </body>
</html>
