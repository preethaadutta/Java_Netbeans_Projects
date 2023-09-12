
package linked_list;
import java.util.Scanner;
public class Singly_linked_list_deletion 
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
    public void deletion_from_beginning()
    {
        if(head==null)
        {
            System.out.print("Lined list does not exist");
        }
        else
        {
            Node temp=head;
            temp=temp.next;
            head=temp;
        }
    }
    public void deletion_from_end()
    {
        if(head==null)
        {
            System.out.print("Lined list does not exist");
        }
        else
        {
            Node temp1=head;
            Node pointer1=temp1.next;
            while(pointer1.next!=null)
            {
                temp1=pointer1;
                pointer1=pointer1.next;
            }
            temp1.next=null;
        }
    }
    public void deletion_from_specificlocation()
    {
        Scanner sc=new Scanner(System.in);
        int p; 
        if(head==null)
        {
            System.out.print("Lined list does not exist");
        }
        else
        {
            System.out.print("Enter position of node to be deleted: ");
            p=sc.nextInt();
            Node temp2=head;
            Node pointer2=temp2.next;
            for(int i=0;i<p-2;i++)
            {
                temp2=pointer2;
                pointer2=pointer2.next;
            }
            temp2.next=pointer2.next;
        }
    }
    public static void main(String args[])
    {
        Singly_linked_list_deletion sl=new Singly_linked_list_deletion();
        Scanner sc1=new Scanner(System.in);
        System.out.print("Enter number of nodes you want to insert: ");
        int j=sc1.nextInt();
        for(int i=0;i<j;i++)
        {
            sl.creation();
        }
        System.out.print("Before deletion linked list is: ");
        sl.traversel();
        System.out.print(" Enter 1 to delete from beginning, enter 2 to delete from end, enter 3 to delete from end: ");
        int choice=sc1.nextInt();
        switch(choice)
        {
            case 1:
                sl.deletion_from_beginning();
                System.out.print("After deletion linked list is: ");
                sl.traversel();
                break;
            case 2:
                sl.deletion_from_end();
                System.out.print("After deletion linked list is: ");
                sl.traversel();
                break;
            case 3:
                sl.deletion_from_specificlocation();
                System.out.print("After deletion linked list is: ");
                sl.traversel();
                break;
        }
    }
}
