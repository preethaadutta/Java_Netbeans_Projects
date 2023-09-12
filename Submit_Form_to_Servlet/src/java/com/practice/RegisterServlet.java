package com.practice;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.*;
import javax.servlet.http.*;        

public class RegisterServlet extends HttpServlet
{
    /*when we submit the form the doPost method will be called*/
    /*request object helps to fetch data and response object generates dynamic response. Client or user will request and 
    server will send response to the client or user*/
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        response.setContentType("text/html");/*output will be of html form*/
        PrintWriter out=response.getWriter();/*out object helps to print output*/
        out.println("<h2>Welcome to Register Servlet</h2>");
        /*to fetch data from server*/
        String user_firstname=request.getParameter("first_name");/*first_name data will be stored in firstname variable*/
        String user_lastname=request.getParameter("last_name");/*last_name data will be stored in lastname variable*/
        String user_email=request.getParameter("email");/*email data will be stored in email variable*/
        String user_password=request.getParameter("password");/*password data will be stored in password variable*/
        String user_gender=request.getParameter("gender");/*gender data will be stored in gender variable*/
        String user_country=request.getParameter("country");/*country data will be stored in country variable*/
        
        String condition=request.getParameter("condition");/*condition data will be stored in condition variable*/
        if(condition!=null)
        {
            if(condition.equals("checked"))
            {
                //to print all the data
                out.println("<h2>Firstname: "+user_firstname+"<h2>");
                out.println("<h2>Lastname: "+user_lastname+"<h2>");
                out.println("<h2>Email: "+user_email+"<h2>");
                out.println("<h2>Password: "+user_password+"<h2>");
                out.println("<h2>Gender: "+user_gender+"<h2>");
                out.println("<h2>Country: "+user_country+"<h2>");
                //to store all the data in JDBC
                //have to follow all the steps required in JDBC
            }
            else
            {
                out.println("<h2>Please accept terms and conditions.</h2>");
            }
        }
        else
        {
            out.println("<h2>Please accept terms and conditions.</h2>");
            
            //tutorial video 9 of code with Durgesh
            //if we want to show or include the index.html page here again then for that this code is written
            RequestDispatcher rd=request.getRequestDispatcher("index.html");
            //if we want to print output of another servlet then we've topass url pattern of servlet
            
            //then we've to call include method
            rd.include(request, response);
        }
    }
}

/*we've to do mapping of RegisterServlet class in web.xml file*/