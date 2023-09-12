<%@page contentType="text/html" pageEncoding="UTF-8"%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome to our website!</h1>
    </body>
</html>
<%
Integer count=(Integer)session.getAttribute("res");
if(count==null || count==0)
{
count=1;
}
else
{
count++;
}
out.println("The number of visitors visited this website is "+count);
session.setAttribute("res",count);
%>