
package vector;
import java.util.Vector;
import java.util.Iterator;
public class Vector_Using_Collection 
{
    public static void main(String args[])
    {
//Syntax:Vector<Generic> vector_name=new Vector<>();
        Vector<Integer> vector=new Vector<>();
        //add() method to insert element in stack
//Syntax:vector_name.insertElementAt(index_number);
//Syntax:vector_name.add(element);
        vector.add(10);
        vector.add(20);
        vector.add(1,30);
        vector.add(40);
        System.out.println("Elements of vector are:"+vector);
        //remove() method to delete element from vector and will return that deleted element
        //Syntax:vector_name.removeElementAt(index_number);
        //Syntax:vector_name.remove(element);
        int element1=vector.remove(20);
        System.out.println("Element which is removed from stack is:"+element1);
        System.out.println("Now Elements of stack are:"+vector);
    //peek() method to check the top element without deleting it from stack and will return that element
        //Syntax:vector_name.get(index_number);
        int element2=vector.get(3);
        System.out.println("Top Element of vector is:"+element2);
        System.out.println("Now Elements of vector are:"+vector);
        //isEmpty() method to check vector is empty or not and it returns boolean value
        boolean b=vector.isEmpty();
        System.out.println("The vector is empty:"+b);
        Iterator<Integer> i=vector.iterator();
        System.out.println("Elements of vector are:");
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
