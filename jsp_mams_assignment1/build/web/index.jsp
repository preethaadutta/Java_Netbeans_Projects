<!--
Question:-
Create a webpage, where in the 1st page user will give two numbers. When user will click on submit button, 
in the 2nd page the calculation will be done and in the 3rd page the result will be shown to user.
1st page= index.jsp page
2nd page= session2.jsp page
3rd page= session3.jsp page
-->
<!--It is the 1st page-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method="post" action="session2.jsp">
            Number1<input type="number" name="fnumber"><br>
            Number2<input type="number" name="snumber"><br>
            <input type="submit" name="submit" value="submit">
        </form>
    </body>
</html>
