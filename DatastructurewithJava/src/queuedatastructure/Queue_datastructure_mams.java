//Creating Queue from scratch
package queuedatastructure;
import java.util.Scanner;
public class Queue_datastructure_mams 
{
    int SIZE = 5;
    int items[] = new int[SIZE];
    int front, rear;
    Queue_datastructure_mams() 
    {
        front = -1;
        rear = -1;
    }
    // check if the queue is full
    boolean isFull() 
    {
        if (front == 0 && rear == SIZE - 1) 
        {
            return true;
        }
        else
        {
            return false;
        }
        //return false;
    }
    // check if the queue is empty
    boolean isEmpty() 
    {
        if (front == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //insert elements to the queue
    void enQueue(int element) 
    {
        //if queue is full
        if (isFull()) 
        {
            System.out.println("Queue is full");
        }
        else 
        {
            if (front == -1) 
            {
                // mark front denote first element of queue
                front = 0;
            }
            //else
            //{
            
            //}
            rear++;
            //insert element at the rear
            items[rear] = element;
            System.out.println("Inserted " + element);
        }
    }
    //delete element from the queue
    int deQueue() 
    {
        int element;
        //if queue is empty
        if (isEmpty()) 
        {
            System.out.println("Queue is empty");
            return (-1);
        }
        else 
        {
            //remove element from the front of queue
            element = items[front];
            //if the queue has only one element
            if (front >= rear) 
            {
                front = -1;
                rear = -1;
            }
            else 
            {
                //mark next element as the front
                front++;
            }
            System.out.println( element + " Deleted");
            return (element);
        }
    }
    //display element of the queue
    void display() 
    {
        int i;
        if (isEmpty()) 
        {
            System.out.println("Empty Queue");
        }
        else 
        {
            // display the front of the queue
            //System.out.println("\nFront index-> " + front);
            // display element of the queue
            System.out.println("Items -> ");
            for (i = front; i <= rear; i++)
            {
                System.out.print(items[i] + "  ");
            }
            //display the rear of the queue
            //System.out.println("\nRear index-> " + rear);
        }
    } 
    public static void main(String[] args) 
    {
        Queue_datastructure_mams q = new Queue_datastructure_mams();
        // try to delete element from the queue
        // currently queue is empty
        // so deletion is not possible
        Scanner sc = new Scanner(System.in);
        while(true) 
        {
            System.out.println("1:enque");
            System.out.println("2:display");
            System.out.println("3:deque");
            System.out.println("4:Exit");
            System.out.println("Enter your choice");
            int c = sc.nextInt();
            switch(c)
            {
                case 1:
                    Scanner s=new Scanner(System.in); //creating scanner class object taking system.in object as an argument
                    System.out.println("Enter the no. to insert");
                    int fno=s.nextInt();
                    q.enQueue(fno);
                    break;
                case 2:    
                    q.display();
                    break;
                case 3: 
                    q.deQueue();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("wrong input");
                    break;   
            }
    /*q.deQueue();
    // insert elements to the queue
    for(int i = 1; i < 6; i ++) 
    {
      q.enQueue(i);
    }
    // 6th element can't be added to queue because queue is full
    q.enQueue(fno);
    q.display();
    // deQueue removes element entered first i.e. 1
    q.deQueue();
    // Now we have just 4 elements
    q.display(); */
        }
    }
}
