/*JDBC program to check connection is established properly or not*/
package jdbc3;

import java.sql.Connection;
import java.sql.DriverManager;

public class Jdbc_code3 
{
    public static void main(String args[])
    {
        try
	{
            //step-1
	    Class.forName("com.mysql.cj.jdbc.Driver"); //registering the Mysql driver class
            
            //step-2
            //creating connection:-
            //Connection conn=DriverManager.getConnection(Mysql url,username,password);
	    Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","Preethaa@20");
	    System.out.println("Connection is successful");
	}
	catch(Exception e)
	{
	    e.printStackTrace();
	}
    }
}
