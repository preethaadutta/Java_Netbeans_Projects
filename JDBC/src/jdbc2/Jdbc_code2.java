
package jdbc2;
import  java.sql.*;
public class Jdbc_code2 
{
    private static final String URL="jdbc:mysql://localhost:3306/test";
    private static final  String USERNAME="root";
    private static final  String PASSWORD="";
    public static void main(String[] args) 
    {
        Connection conn = null;
        try
        {
            conn=DriverManager.getConnection(URL,USERNAME,PASSWORD);
            System.out.println("Connected");
            Statement stmt1= (Statement) conn.createStatement();
            String insert="insert into student(name,age,course,birthday) values('sima',22,'BCA','1993-06-15')";
            stmt1.executeUpdate(insert);
            System.out.println("data inserted successflly");
            stmt1.close();
            Statement stmt2=(Statement) conn.createStatement();
            String upd="Update student set math=76,physics=82,computer=92 where name ='sima'";
            stmt2.executeUpdate(upd);
            stmt2.close();
            ResultSet rs;
            Statement stmt3=(Statement) conn.createStatement();
            String disp="Select * from student where name ='sima' ";
            rs=stmt3.executeQuery(disp);
            while(rs.next())
            {
                int r=rs.getInt("roll");
                String n=rs.getString("name");
                int a=rs.getInt("age");
                String c=rs.getString("course");
                int m=rs.getInt("math");
                int p=rs.getInt("physics");
                int co=rs.getInt("computer");
                String dob=rs.getString("birthday");
                System.out.print("Roll: " + r);
                System.out.print(", Name: " + n);
                System.out.print(", Age: " + a);
                System.out.println(", Course: " + c);
                System.out.print("Math: " + m);
                System.out.print(", Physics: " + p);
                System.out.print(", Computer: " + co);
                System.out.println(",DOB: " + dob);
            }
            rs.close();
            stmt3.close();
            conn.close();
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
    }
}
