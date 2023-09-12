<!--It is the 2nd page-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
<% 
int firstnumber=Integer.parseInt(request.getParameter("fnumber"));
int secondnumber=Integer.parseInt(request.getParameter("snumber"));
if(firstnumber!=0 && secondnumber!=0)
{
int result=firstnumber+secondnumber;
session.setAttribute("res",result);
response.sendRedirect("session3.jsp");
}
else
{
out.println("Please enter the number");
}
%>
