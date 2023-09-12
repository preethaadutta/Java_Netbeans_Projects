<%-- 
    Document   : show
    Created on : 18-Nov-2022, 9:59:34 am
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%=request.getParameter("p1") %>
        <%@page import="java.sql.*,java.util.*" %>
<% Class.forName("com.mysql.jdbc.Driver"); %>
<% String dbURL = "jdbc:mysql://localhost:3306/jdb1";
        String username ="root";
        String password = "";
       
        Connection dbCon = null;
        ResultSet rs=null;
        

dbCon = DriverManager.getConnection(dbURL, username, password);
String query ="select * from student1";
Statement st= dbCon.prepareStatement(query);
rs=st.executeQuery(query);
 while(rs.next())  
 {
 out.println(rs.getInt(1));
 out.println(rs.getString(2));
 out.println(rs.getString(3));  

}
%>

                
    </body>
</html>
