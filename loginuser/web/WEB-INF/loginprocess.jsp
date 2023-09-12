<%-- 
    Document   : loginprocess
    Created on : 25-Nov-2022, 11:26:08 am
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="loginbean.LoginDao" %>  
<jsp:useBean id="loginB" class="loginbean.loginB" 
      
    <jsp:setProperty property="*" name="obj"/>  </jsp:useBean>
      
    <%
    boolean status=LoginDao.validate(obj);  
    if(status){  
    out.println("You r successfully logged in");  
    session.setAttribute("session","TRUE");  
    }  
    else  
    {  
    out.print("Sorry, name or password error");  
    %>  
    <jsp:include page="index.jsp"></jsp:include>  
    <%  
    }  
    %>  