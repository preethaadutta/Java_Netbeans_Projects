
package jdbc8_dynamic;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Jdbc_code8_dynamic 
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
            
            //user input
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Id=");
            int id=sc.nextInt();
            System.out.println("Enter Name=");
            String name=sc.next();
            System.out.println("Enter Address=");
            String address=sc.next();
            
            //step-3
            /*
            //to insert dynamic user inputed values into table
            PreparedStatement ps=conn.prepareStatement("insert into studentInfo values(?,?,?)");
            ps.setInt(1,id); //as dynamic value user will give so id
            ps.setString(2,name);
            ps.setString(3,address);
            */
            //to update dynamic user inputed values into table
            PreparedStatement ps=conn.prepareStatement("update studentInfo set name=? , address=? where id=?");
            ps.setInt(1,id); //as dynamic value user will give so id
            ps.setString(2,name);
            ps.setString(3,address);
            
            //step-4
            //to excecute the query
            int i=ps.executeUpdate(); //as we've done insert operation on database which is non-select query
            System.out.println("Data inserted successfully");
            
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
