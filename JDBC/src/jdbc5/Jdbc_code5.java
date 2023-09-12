/*JDBC program to insert and update values into a table*/
/*
Note: in this type of program we can't run one program more than one time because after inserting
one value in a table if we again run same program 2nd time then as we've created id column as Primary
key so if we run same program more than one so it'll give error 2nd time as that value is already inserted
in that table
*/
package jdbc5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Jdbc_code5 
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
            
            //to insert values into studentInfo table
            PreparedStatement ps=conn.prepareStatement("insert into studentInfo values(?,?,?)");
            //as datatype of id column is int type so setInt() //syntax: ps.setInt(column_number,id_of_student);
            ps.setInt(1,4);
            //as datatype of name column is String type so setString() //syntax: ps.setString(column_number,name_of_student);
            ps.setString(2,"Sajal");
            //as datatype of address column is String type so setString() //syntax: ps.setString(column_number,address_of_student);
            ps.setString(3,"ADEF Road");
            
            //to update values into (I've to check this code again I've to see YouTube video again and do accordingly)
            PreparedStatement ps1=conn.prepareStatement("update studentInfo set name=? , address=? where id=?");
            //as datatype of id column is int type so setInt() //syntax: ps.setInt(column_number,id_of_student);
            ps1.setInt(1,4);
            //as datatype of name column is String type so setString() //syntax: ps.setString(column_number,name_of_student);
            ps1.setString(2,"Bijoy");
            //as datatype of address column is String type so setString() //syntax: ps.setString(column_number,address_of_student);
            ps1.setString(3,"CDA Road");
            
            //step-4
            //to excecute the query
            int i=ps.executeUpdate(); //as we've done insert operation on database which is non-select query
            System.out.println("Data inserted successfully");
            
            int i1=ps1.executeUpdate(); //as we've done update operation on database which is non-select query
            System.out.println("Data updated successfully");
            
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
