/**
 * Created by ashishsowmya on 4/26/18.
 */

import java.io.*;
import java.util.LinkedList;

public class deleteNode {

    Node head;
    Node tail;
    public class Node
    {
        int value;
        Node next;

        public Node(int d)
        {
            value =d;
            next = null;
        }
    }

    public void print() {
        Node new_node = head;

        while (new_node != null) {
            System.out.println(new_node.value);
            new_node = new_node.next;

        }
    }

    public void push(int data)
    {
        Node new_node = new Node(data);
        if(head == null)
        {
            new_node.value = data;
            head = new_node;
            tail=new_node;
            tail.next = null;
        }
        else
        {
            new_node.value = data;
            tail.next = new_node;
            tail = new_node;
        }

    }



    public void delete(int value)
    {
        boolean flag = false;
        if(head.value == value)
        {
            System.out.println(head.value +"is removed");
            head=head.next;

        }
        else
        {
             Node temp = head;
            while(temp != null)
            {
                Node previous = temp;
                Node current = temp.next;
                if(value == current.value)
                {
                    flag = true;
                    System.out.println(current.value +"is removed");
                    if(current.next != null) {
                        previous.next = current.next;
                        current = null;
                    }
                    else
                    {

                        previous.next=null;
                    }
                    temp=null;
                }
                else
                {
                   temp=temp.next;
                }
            }
        }

    }


    public void del(Node node)
    {
        Node new_node = head;
        while(new_node!=null)
        {
            if(new_node.next == node)
            {
                new_node.next = node.next;

            }

            else
            {
                new_node = new_node.next;
            }
        }
    }


  public  void reverse() {
    Node currenthead = head;
    Node nextnode = null;
    Node previousnode = null;

    while(currenthead != null)
    {
          nextnode = currenthead.next;
          currenthead.next = previousnode;
          previousnode = currenthead;
          currenthead = nextnode;

    }
          head=previousnode;


    }

    public static void main(String[] args) {

        deleteNode llist = new deleteNode();
        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);
        llist.push(8);
        System.out.println("\nCreated Linked list is: ");
        llist.print();
        llist.delete(8);
        llist.print();
        llist.reverse();
        System.out.println("Reverse");
        llist.print();


    }
}

//if(node.next == null){
//        return;
//        }
//        ListNode current = node;
//        ListNode prev = null;
//        while(current.next != null){
//        current.val = current.next.val;
//        prev = current;
//        current = current.next;
//        }
//        prev.next = null;
//        }