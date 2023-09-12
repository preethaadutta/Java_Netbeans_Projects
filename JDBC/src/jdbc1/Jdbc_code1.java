package jdbc1;
import  java.sql.*;
public class Jdbc_code1 
{
    private static final String URL="jdbc:mysql://localhost:3306/test";
    private static final  String USERNAME="root";
    private static final  String PASSWORD="Preethaa@20";
    public static void main(String[] args) 
    {
       Connection conn = null;
       try
       {
           conn = DriverManager.getConnection(URL,USERNAME,PASSWORD);
           System.out.println("connected");
           Statement stmt = (Statement) conn.createStatement();
           String  name,sub;
           //String insert1 = "INSERT INTO 'test'.'teacher' ('name','sub') VALUES ('" + name + "' , '" +sub+ "')";
           String insert="INSERT INTO teacher VALUES (5,'Madhu', 'Arith')";
           stmt.executeUpdate(insert);
           System.out.println("Data inserted successfully");
           stmt.close();
           System.out.println("record of teacher :");
           Statement stmt1 = (Statement) conn.createStatement();
           ResultSet rs;
           String select1="select * from teacher";
           rs=stmt1.executeQuery(select1);
           int id;
           while(rs.next())
           {
               id=rs.getInt("teacher_id");
               name=rs.getString("name");
               sub=rs.getString("sub");
               System.out.println("ID : " + id
                                   + " Name : " + name + "  sub:" +sub);
           }
           rs.close();
           stmt1.close();
           conn.close();
           
       }
       catch(SQLException e)                                        
       {
           e.printStackTrace() ; 
       }     
    }
}
