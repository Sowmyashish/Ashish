package medium;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by ashishsowmya on 8/21/18.
 */
public class addTwoNumbers {

    Node head1,head2,tail1,tail2;
    public class Node{
        Node next;
        int value;

        Node(int x)
        {
            value=x;
        }

    }


    public void Insert(int x,int list)
    {
        Node new_node = new Node(x);
        if(list ==1)
        {
            if(head1 == null)
            {
                new_node.value = x;
                head1 = new_node;
                tail1=new_node;
                tail1.next = null;
            }
            else
            {
                new_node.value = x;
                tail1.next = new_node;
                tail1 = new_node;
            }
        }
        else if(list ==2)
        {
            if(head2 == null)
            {
                new_node.value = x;
                head2 = new_node;
                tail2=new_node;
                tail2.next = null;
            }
            else
            {
                new_node.value = x;
                tail2.next = new_node;
                tail2 = new_node;
            }
        }

    }

    public void print()
    {
        Node new_node = head1;
       // System.out.println("First Node Values"+" ");
        while(new_node != null)
        {
            System.out.println(new_node.value);
            new_node = new_node.next;
        }
        Node new_node1 = head2;
      //  System.out.println("Second Node Values are");
        while(new_node1 != null)
        {
            System.out.println(new_node1.value);
            new_node1 = new_node1.next;
        }
    }


    public Node addNumber(Node n1, Node n2) {

        Node temp1 = n1;
        Node temp2 = n2;
        Node new_node = new Node(0);

        int carry = 0;
        int number;
        List<Integer> li = new ArrayList<>();

        while (temp1 != null && temp2 != null) {
            int result = n1.value + n2.value + carry;
            number = result % 10;
            carry = result / 10;
            li.add(number);
            temp1 = temp1.next;
            temp2 = temp2.next;

            new_node.next = new Node(number);
            new_node = new_node.next;

        }
        while (new_node != null)
        {
            System.out.println(new_node.value);
            new_node = new_node.next;
        }
        return new_node.next;
    }


    public void addNumber1(Node n1,Node n2)
    {

        Node temp_h1 = n1;
        Node temp_h2 = n2;
        int carry =0;
        int result=0;
        int number=0;
        int remainder=0;

        while(temp_h1 != null && temp_h2!=null)
        {
            result = temp_h1.value + temp_h2.value + carry;

            if(result <9)
            {
                Node new_node= new Node(result);

                if(new_node == null)
                {
                    Node temp_head3= new_node;
                    new_node.next = null;
                    temp_h1 = temp_h1.next;
                    temp_h2 = temp_h2.next;
                }

                else
                {


                }
//                temp_h1 = temp_h1.next;
//                temp_h2 = temp_h2.next;
//                int a=node.value;
//                node.next = null;
            }
            else if(result > 9)
            {
                    remainder = result%10;

                    Node node = new Node(remainder);
                    number = result/10;
                    carry = number;
                   int b=node.value;
                   node.next = null;
                   temp_h1 = temp_h1.next;
                   temp_h2 = temp_h2.next;
            }
        }

    }


    public static void main(String args[])
    {

        addTwoNumbers obj = new addTwoNumbers();

        obj.Insert(2,1);
        obj.Insert(4,1);
        obj.Insert(3,1);
        obj.print();
        addTwoNumbers obj1 = new addTwoNumbers();
        obj1.Insert(5,2);
        obj1.Insert(6,2);
        obj1.Insert(4,2);
        obj1.print();
       obj1.addNumber1(obj.head1,obj1.head2);



    }
}


//    Node temp1 =n1;
//    Node temp2=n2;
//    Node new_node = new Node(0);
//
//    int carry=0;
//    int number;
//    List<Integer> li = new ArrayList<>();
//
//      while(n1 != null && n2 !=null || carry>0) {
//              int result = n1.value + n2.value + carry;
//              number = result % 10;
//              carry = result/10;
//              li.add(number);
//              n1=n1.next;
//              n2=n2.next;
//
//
//
//              }
//
//              System.out.println("output is");
//              for(int i=0;i<li.size();i++)
//        {
//
//        System.out.println(li.get(i));
//        }
//        }