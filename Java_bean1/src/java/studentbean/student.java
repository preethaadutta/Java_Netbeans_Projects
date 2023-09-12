/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentbean;
import java.io.Serializable;

/**
 *
 * @author User
 */
public class student implements Serializable 
{
    private int id;
    private String name;
    public student()
    {
        
    }

    public int getId() 
    {
        return id;
    }

    public String getName() 
    {
        return name;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public void setName(String name) 
    {
        this.name = name;
    }
       public void details()
       {
           System.out.println("Student details:");
           System.out.println("id:"+id+"name:"+name);
       }
}
