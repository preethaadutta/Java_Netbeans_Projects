/*
Creating Stack using Array from scratch and then Inserting elements into it 
and then deleting element from that
*/
package stackdatastructure;
import java.util.Scanner;
public class Delete_From_Stack 
{
    private int array[]; //store elements of stack
    private int top; //represent top of stack
    private int capacity; //total capacity of the stack
    //creating a stack
    Delete_From_Stack(int size) //constructor
    {
        //initialize the stack variables
        array=new int[size]; //initialize the array
        capacity=size;
        top=-1;
    }
    //push elements to the top of stack
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
    //pop elements from top of stack
    public void pop() 
    {
        //if stack is empty
        //no element to pop
        if(isEmpty()==true) 
        {
            System.out.println("Stack Underflow"); //this will terminate the program or //System.exit(1);
        }
        else
        {
            //pop element from top of stack
            top=top-1; //top--;
            System.out.println("Element deleted from stack");
        }
    }
    public int getSize() //return size of the stack
    {
        return top+1;
    }
    //isEmpty() method to check if the stack is already empty
    public Boolean isEmpty() 
    {
        if(top==-1)
        {
            return true;
        }
        else
        {
            return false;
        }
        //return top==-1;
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
        Delete_From_Stack stack=new Delete_From_Stack(number);
        int element=0;
        stack.push(element);
        stack.push(element);
        System.out.print("Stack is: ");
        stack.display();
        stack.pop(); //remove element from stack
        //stack.pop();
        System.out.print("After popping out Stack is: ");
        stack.display();
    }
}
