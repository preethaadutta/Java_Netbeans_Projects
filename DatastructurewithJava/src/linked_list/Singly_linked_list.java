//Creating Singly linked list from scratch and traversing over that
package linked_list;
import java.util.Scanner;
public class Singly_linked_list 
{
    //creating a node
    static class Node //We'll make Node as a static class so that without creating object we can access
    {
        int data; //we're storing integer data in Singly_linked_list so int datatype
        Node next; //as next is storing address of next Node so it is a pointer so datatype will be Node
        Node(int data) //Constructor
        {
            this.data=data; //initializing variables declared in that class
            this.next=null; //initializing variables declared in that class
        }
    }
    Node head=null; //if no linked list is present then head=null and datatype of head is Node as it is 
    //a pointer
    /*
    Creation of Linked-list means we'll add nodes with head
    Two cases-
    1) If no Linked-list exists:  if(head==null)
    2) If one Linked-list exists:  if(head==null) else
    */
    public void creation() 
    {
        int data;//
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter data: ");
        data=sc.nextInt();
        Node new_node=new Node(data);//adding node to the linkedlist
        if(head==null) //If no node exists
        {
            head=new_node; //storing address of 1st node to the head of linked list
        }
        else //If one or more nodes exists //inserting node at the beginning of linked list
        {
            new_node.next=head; 
            head=new_node;
        }
    }
    public void traversel()
    {
        Node temp=head;
        if(head==null)
        {
            System.out.print("Lined list does not exist");
        }
        else
        {
            while(temp!=null)
            {
                System.out.print(temp.data);
                temp=temp.next;
            }
        }
    }
    public static void main(String args[])
    {
        Singly_linked_list sl=new Singly_linked_list();
        Scanner sc1=new Scanner(System.in);
        System.out.print("Enter number of nodes you want to insert: ");
        int m=sc1.nextInt();
        for(int i=0;i<m;i++)
        {
            sl.creation();
        }
        sl.traversel();
    }
}
