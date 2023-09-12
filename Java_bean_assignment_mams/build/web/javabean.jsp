<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Enter the details</h1>
        <jsp:useBean id="Employee" class="employeebean.Employee" >
            <jsp:setProperty name="Employee" property="id" value="1"></jsp:setProperty>
            <jsp:setProperty name="Employee" property="name" value="madhu"></jsp:setProperty>
            <jsp:setProperty name="Employee" property="salary" value="1000"></jsp:setProperty>
        </jsp:useBean>
        <h3>Employee id: </h3><jsp:getProperty name="Employee" property="id"></jsp:getProperty>
        <h3>Employee name:</h3><jsp:getProperty name="Employee" property="name"></jsp:getProperty>
        <h3>Employee salary:</h3><jsp:getProperty name="Employee" property="salary"></jsp:getProperty>
        <!--<form method="post" action="session2.jsp">
            Employee ID<input type="number" name="id"><br>
            Employee Name<input type="text" name="name"><br>
            Salary<input type="number" name="salary"><br>
            <input type="submit" name="submit" value="submit">
        </form>-->
    </body>
</html>
