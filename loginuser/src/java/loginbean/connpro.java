/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loginbean;
import java.sql.*;
/**
 *
 * @author User
 */
public class connpro {
    static Connection dbCon = null;
    static{
        try{
            Class.forName("com.mysql.jdbc.Driver"); 
            String dbURL = "jdbc:mysql://localhost:3306/jdb1";
        String username ="root";
        String password = "";
       
        
        

dbCon = DriverManager.getConnection(dbURL, username, password);
        }
        catch(Exception e){ System.out.println(e);}  
        
    }
       
public static Connection getcon()
{
    return dbCon;
}
}
