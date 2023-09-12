/*JDBC program to fetch values from a table means select queries*/
/*
Note: in this type of program we can't run one program more than one time because after inserting
one value in a table if we again run same program 2nd time then as we've created id column as Primary
key so if we run same program more than one so it'll give error 2nd time as that value is already inserted
in that table
*/
package jdbc7;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Jdbc_code7 
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
            
            //step-3
            //to fetch values from studentInfo table 
            PreparedStatement ps=conn.prepareStatement("select * from studentInfo"); //to show whole table means all values in the table
            
            //step-4
            ResultSet rs=ps.executeQuery(); //as we've done fetch operation on database which is select query
            System.out.println("Data fetched successfully");
            
            /*
            boolean f=rs.next(); //it'll check that the database is empty or not so returntype will be boolean
            System.out.println(f); //if the database is not empty then it'll return true
            */
            while(rs.next()) //rs.next() it'll return true if database is not empty
            {
                System.out.println("Id="+rs.getInt(1)+" Name="+rs.getString(2)+" Address="+rs.getString(3)); //customise printing
            }
            
            //step-5
            //to close the connection object
            conn.close();
            
            
            
            
            /*//code for checking
            Class.forName("com.mysql.jdbc.Driver");
            String dbURL = "jdbc:mysql://localhost:3306/student";
            String username ="root";
            String password = "Preethaa@20";
            Connection dbCon = DriverManager.getConnection(dbURL, username, password);
            //Statement stmt = null;
            ResultSet rs = null;
            //String query ="select * from user1 where username=? and pwd=?";
            String query="select * from student_table where Roll=1";
            PreparedStatement ps=dbCon.prepareStatement(query);
            //ps.setInt(1,b.getRoll());
            //ps.setString(2,b.getName());
            rs=ps.executeQuery();
            //status=rs.next();
            while(rs.next())
            {
                System.out.append(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "
            +rs.getString(5)+" "+rs.getString(6));
            }
            */
	}
	catch(Exception e)
	{
	    e.printStackTrace();
	}
    }
}
