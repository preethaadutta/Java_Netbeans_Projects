/*
Creating Stack using Collection framework from scratch and then Inserting elements into it 
and then deleting element from that
*/
/*
The stack which is made using collection framework that stack can't be full because it is resizable 
dynamic stack so this kind of Stack can't Overflow
*/
package stackdatastructure;
import java.util.Stack;
public class Stack_Using_Collection 
{
    public static void main(String args[])
    {
//Syntax:Stack<Generic> stack_name=new Stack<>();
        Stack<Integer> stack=new Stack<>();
        //push() method to insert element in stack
//Syntax:stack_name.push(element);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Elements of stack are:"+stack);
        //pop() method to delete element from stack and will return that deleted element
        //Syntax:stack_name.pop();
        int element1=stack.pop();
        System.out.println("Element which is removed from stack is:"+element1);
        System.out.println("Now Elements of stack are:"+stack);
    //peek() method to check the top element without deleting it from stack and will return that element
        //Syntax:stack_name.peek();
        int element2=stack.peek();
        System.out.println("Top Element of stack is:"+element2);
        System.out.println("Now Elements of stack are:"+stack);
        //search() method to search the specified element from stack and returns its position
        //Syntax:stack_name.search(element);
        int position=stack.search(40);
        System.out.println("The position of searched Element is:"+position);
        //empty() method to check stack is empty or not and it returns boolean value
        boolean b=stack.empty();
        System.out.println("The stack is empty:"+b);
    }
}
