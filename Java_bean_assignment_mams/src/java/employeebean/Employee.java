/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeebean;
import java.io.Serializable;
/**
 *
 * @author HP
 */
public class Employee implements Serializable 
{
    private int id;
    private String name;
    private int salary;
    public Employee()
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
    public int getSalary() 
    {
        return salary;
    }
    public void setId(int id) 
    {
        this.id = id;
    }
    public void setName(String name) 
    {
        this.name = name;
    }
    public void setSalary(int salary) 
    {
        this.salary = salary;
    }
    public void showbonas()
    {
        float bonas=salary/10;
        System.out.println("Employee details:");
        System.out.println("id:"+id+"name:"+name+"salary:"+salary+"bonas:"+bonas);
    }
}
