package medium;

import java.util.LinkedList;

/**
 * Created by ashishsowmya on 8/17/18.
 */
public class oddEvenLL {

//    Node head, tail;
//    public class Node
//    {
//        int value;
//        Node next;
//        Node previous;
//        public Node(int x)
//        {
//            value =x;
//        }
//    }
//    public void insert(int x)
//    {
//        Node new_node = new Node(x);
//        new_node.value =x;
//        if(head ==  null)
//        {
//            head = new_node;
//            tail = new_node;
//            new_node.next = null;
//            new_node.previous = null;
//
//        }
//        else
//        {
//            tail.next = new_node;
//            new_node.previous=tail;
//            tail = new_node;
//        }
//    }
//
//    public void oddEven(Node head) {
//
//        Node temp_Head = head;
//        Node temp_previous;
//        int count = 0;
//
//       while(temp_Head != null && count<3) {
//           Node temp_even = temp_Head.next;
//           temp_previous = temp_Head.next.next;
//           temp_Head.next = temp_previous;
//           temp_previous.previous = temp_Head;
//           tail.next = temp_even;
//           tail = tail.next;
//           System.out.println(head.value);
//           System.out.println(head.next.value);
//           System.out.println(head.next.next.value);
//           System.out.println(head.next.next.next.value);
//           System.out.println(head.next.next.next.next.value);
//           System.out.println(head.next.next.next.next.next.value);
//            count++;
//           temp_Head = temp_Head.next;
//
//       }
////           if (temp_Head != null) {
////               Node temp_even1 = temp_Head.next;
////               Node temp_previous1 = temp_Head.next.next;
////               temp_Head.next = temp_previous1;
////               temp_previous1.previous = temp_Head;
////               tail.next = temp_even1;
////               tail = tail.next;
////               System.out.println(head.value);
////               System.out.println(head.next.value);
////               System.out.println(head.next.next.value);
////               System.out.println(head.next.next.next.value);
////               System.out.println(head.next.next.next.next.value);
////               System.out.println(head.next.next.next.next.next.value);
////               temp_Head = temp_Head.next;
////           }
////
////           if (temp_Head != null) {
////               Node temp_even2 = temp_Head.next;
////               Node temp_previous2 = temp_Head.next.next;
////               temp_Head.next = temp_previous2;
////               temp_previous2.previous = temp_Head;
////               tail.next = temp_even2;
////               tail = tail.next;
////               System.out.println(head.value);
////               System.out.println(head.next.value);
////               System.out.println(head.next.next.value);
////               System.out.println(head.next.next.next.value);
////               System.out.println(head.next.next.next.next.value);
////               System.out.println(head.next.next.next.next.next.value);
////           }
////       }
//        }
//



    public class Node
    {

        Node next;
        int value;

        public Node(int x)
        {
            value = x;
        }

    }
    Node head;

    public void insert(int value)
    {

        Node new_node = new Node(value);
        Node last= head;

        if(head == null)
        {

            head = new_node;
            last = new_node;

        }
        else
        {
            while (last.next != null)
            {
                last = last.next;
            }

            last.next = new_node;
            last = last.next;
        }
    }
    public void print()
    {
        Node temp= head;

        System.out.print("values are");
        while(temp != null)
        {
            System.out.print(temp.value+"\t");
            temp=temp.next;
        }
    }


    public Node oddeven(Node head)
    {
        if(head != null)
        {
            Node odd = head,even = head.next,headEven = even;
            while(even != null && even.next != null)
            {
                odd.next = odd.next.next;
                even.next = even.next.next;
                odd = odd.next;
                even = even.next;
            }
            odd.next = headEven; // attaching even header at the end of the odd list.
        }
        return head;
    }

    public Node rotateRight(Node head,int k)
    {
        Node slow = head;
        Node fast = head;
        int count =0;
        while(count < k && fast != null)
        {
            fast = fast.next;
            count++;
        }
        while(fast.next != null)
        {
            fast = fast.next;
            slow = slow.next;
        }
        Node newhead = slow.next;
        slow.next = null;
        fast.next = head;
        head = newhead;
        return head;
    }


    public static void main(String args[])
    {
        oddEvenLL obj = new oddEvenLL();
        obj.insert(1);
        obj.insert(2);
        obj.insert(3);
        obj.insert(4);
        obj.insert(5);
        obj.insert(6);

       // obj.oddeven(obj.head);
        Node node = obj.rotateRight(obj.head,2);


        obj.print();
    }


}
