/*
Creating Stack using Array from scratch and then Inserting elements into that
*/
package stackdatastructure;
import java.util.Scanner;
public class Insert_In_Stack 
{
    private int array[]; //store elements of stack
    private int top; //represent top of stack
    private int capacity; //total capacity of the stack
    //creating a stack
    Insert_In_Stack(int size) //constructor
    {
        //initialize the stack variables
        array=new int[size]; //initialize the array
        capacity=size;
        top=-1;
    }
    //push() method to insert element to the top of stack
    public void push(int element) 
    {
        if(isFull()==true) 
        {
            System.out.println("Stack OverFlow");//this will terminate the program or //System.exit(1);
        }
        else
        {   
            //insert element on top of stack
            System.out.print("Enter element in stack: ");
            Scanner sc1=new Scanner(System.in);
            element=sc1.nextInt();
            top=top+1;
            array[top]=element;
            //array[++top]=element;
            System.out.println("Element inserted in stack");
        }
    }
    //getSize() method to get size of the stack means how many elements are there
    public int getSize() 
    {
        return top+1;
    }
    //isFull() method to check if the stack is already full
    public Boolean isFull() 
    {
        if(top==capacity-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //display() method to display all elements of Stack
    public void display() 
    {
        for (int i=0;i<=top;i++) 
        {
            System.out.print(array[i]+",");
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of elements in stack: ");
        int number=sc.nextInt();
        Insert_In_Stack stack=new Insert_In_Stack(number);
        int element=0;
        stack.push(element);
        stack.push(element);
        stack.push(element);
        stack.push(element);
        stack.push(element);
        System.out.print("Stack: ");
        stack.display();
        stack.push(element);
        // remove element from stack
        //stack.pop();
        //System.out.println("\nAfter popping out");
        //stack.display();
    }
}
