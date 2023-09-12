//Creating Linked list from scratch
package linked_list;
import java.util.Scanner;
public class All_Types_Linked_List_mams 
{
    Node head;
    static class Node
    {
        int value;
        Node next;
        Node(int d)
        {
            value=d;
            next=null;
        }
    }
    public static All_Types_Linked_List_mams insert(All_Types_Linked_List_mams list, int data)
    {
        // Create a new node with given data
        Node new_node = new Node(data);
        // If the Linked List is empty,
        // then make the new node as head
        if (list.head == null) 
        {
            list.head = new_node;
        }
        else 
        {
            // Else traverse till the last node
            // and insert the new_node there
            Node last = list.head;
            while (last.next != null) 
            {
                last = last.next;
            }
            // Insert the new_node at last node
            last.next = new_node;
        }
        // Return the list by head
        return list;
    }
    public static void printList(All_Types_Linked_List_mams list)
    {
        Node currNode = list.head;
        System.out.print("LinkedList: ");
        // Traverse through the LinkedList
        while (currNode != null) 
        {
            // Print the data at current node
            System.out.print(currNode.value + " ");
            // Go to next node
            currNode = currNode.next;
        }
    }
    public static void main(String[] args) 
    {
       All_Types_Linked_List_mams linkedL = new All_Types_Linked_List_mams(); 
       Scanner scanner = new Scanner(System.in);
       while(true) 
       {
            System.out.println("1:addition");
            System.out.println("2:display");
            System.out.println("3:exit");
            System.out.println("Enter your choice");
            int c = scanner.nextInt();
            switch(c)
            {
                case 1:
                    Scanner scanner1 = new Scanner(System.in);
                    System.out.println("enter item to insert");
                    int i = scanner1.nextInt();
                    linkedL = insert(linkedL, i);
                    break;
                case 2:  
                    printList(linkedL);
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("wrong input");
                    break;
                /*linkedL = insert(linkedL, 2);
                linkedL = insert(linkedL, 3);
                linkedL = insert(linkedL, 4);*/
            }
        }
    }
}
