/**
 * Created by ashishsowmya on 6/18/18.
 */
public class palindromeLinkedList {

    Node head;
    Node tail;
    public class Node
    {
        int value;
        Node next;
        Node previous;

        public Node(int x)
        {
            value =x;
        }
    }
    public void insert(int x)
    {
        Node new_node = new Node(x);
        new_node.value =x;
        if(head ==  null)
        {
            head = new_node;
            tail = new_node;
            new_node.next = null;
            new_node.previous = null;

        }
        else
        {
            tail.next = new_node;
            new_node.previous=tail;
            tail = new_node;
        }
    }

    public void print()

    {
        Node temp;
        temp =head;
        while(temp != null)
        {
            System.out.println("values are" +temp.value);
            temp=temp.next;
        }
    }
    public void palindrome()
    {
        Node temp_head=head;
        Node temp_tail= tail;

        while(temp_head != temp_tail)
        {
            if(temp_head.value == temp_tail.value)
            {
                temp_head = temp_head.next;
                temp_tail = temp_tail.previous;
            }
            else
            {
                System.out.println("Not a palindrome");
                break;
            }
            if(temp_head == temp_tail || ((temp_head.next  == temp_tail) && temp_head.value == temp_tail.value ))
            {
                System.out.println("palindrome");
            }
        }


    }

    public static void main(String args[])
    {
        palindromeLinkedList obj = new palindromeLinkedList();
        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.insert(4);
        obj.insert(2);
        obj.insert(1);
        obj.print();
        obj.palindrome();
    }


}
