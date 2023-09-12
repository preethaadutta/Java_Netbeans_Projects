<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% 
    String uname=request.getParameter("uname");
    if(uname.isEmpty())
    {
%>
        <h1>Username is not set </h1>
<%
    }
    else 
    {
        if(uname.equals("saheli"))  
        {
            session.setAttribute("username",uname);
            response.sendRedirect("session3.jsp");
        }
        else
        {
%>
            <h3> Wrong user name</h3>
<%
        }
    }
%>
