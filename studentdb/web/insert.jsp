<%-- 
    Document   : insert
    Created on : 15-Nov-2022, 10:41:04 am
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*,java.util.*" %>
<% Class.forName("com.mysql.jdbc.Driver"); %>
<% String dbURL = "jdbc:mysql://localhost:3306/jdb1";
        String username ="root";
        String password = "";
       
        Connection dbCon = null;
        

dbCon = DriverManager.getConnection(dbURL, username, password);
String nm=request.getParameter("n1");
String ag=request.getParameter("n2");
Statement st= dbCon.createStatement();
int i=st.executeUpdate("insert into student1(name,age) values ('"+nm+"','"+ag+"' )");
out.println("record inserted");
%>
view student details<jsp:forward page="show.jsp">
            <jsp:param name="p1" value="student details"/>
            </jsp:forward>