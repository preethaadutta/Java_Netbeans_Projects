/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginbean.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.util.*;
import loginbean.model.loginB;
import loginbean.web.loginservlet;
/**
 *
 * @author User
 */
public class loginDAO {

    /**
     *
     * @param lb
     * @return
     */
    public static boolean validate(loginB lb)
   {
       boolean status=false;
       try{
           Class.forName("com.mysql.jdbc.Driver");
       String dbURL = "jdbc:mysql://localhost:3306/jdb1";
        String username ="root";
        String password = "";
       
        Connection dbCon = DriverManager.getConnection(dbURL, username, password);
        //Statement stmt = null;
        ResultSet rs = null;
       //String query ="select * from user1 where username=? and pwd=?";
       PreparedStatement ps=dbCon.prepareStatement("select * from user1 where username=? and pwd=?");
       
       ps.setString(1,lb.getName());
       ps.setString(2,lb.getPwd());
       rs=ps.executeQuery();
       status=rs.next();
       
   }catch(Exception e){}
       return status;
   }
        
}
