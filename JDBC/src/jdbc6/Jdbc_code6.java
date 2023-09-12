/*JDBC program to delete values into a table*/
/*
Note: in this type of program we can't run one program more than one time because after inserting
one value in a table if we again run same program 2nd time then as we've created id column as Primary
key so if we run same program more than one so it'll give error 2nd time as that value is already inserted
in that table
*/
package jdbc6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Jdbc_code6 
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
            //to delete values from studentInfo table 
            PreparedStatement ps=conn.prepareStatement("delete from studentInfo where id=?");
            //as datatype of id column is int type so setInt() //syntax: ps.setInt(column_number,id_of_student);
            ps.setInt(1,4); //whose id=4 it'll delete values from that row
            
            //step-4
            int i=ps.executeUpdate(); //as we've done delete operation on database which is non-select query
            System.out.println("Data deleted successfully");
            
            //step-5
            //to close the connection object
            conn.close();
	}
	catch(Exception e)
	{
	    e.printStackTrace();
	}
    }
}
