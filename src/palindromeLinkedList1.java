/**
 * Created by ashishsowmya on 10/28/18.
 */
public class palindromeLinkedList1 {
    Node head;

    public class Node{
        Node next;
        int value;

        public Node(int x)
        {
            value =x;
        }

    }

    public void Insert(int x)
    {
        Node new_node = new Node(x);
        new_node.value =x;
        Node last = head;

        if(head ==  null)
        {
            head = new_node;
            last = new_node;

        }
        else
        {
            while(last.next != null)
            {
                last = last.next;
            }
            last.next = new_node;
            last = new_node;

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


    public Node middleElement(Node head)
    {
        Node slow = head;
        Node fast = head;
        Node middleNode= null;

        while(true)
        {
            fast = fast.next.next;
            if(fast.next == null)  //odd linked list if fast.next == null
            {
                middleNode = slow.next;
                break;
            }
            if(fast.next.next == null) // for even linked list
            {
                middleNode=slow.next;
                break;
            }



              slow=slow.next;
        }
        return middleNode;
    }




    public Node ReverseLinkedList(Node head)
    {

        Node previous = null;
        Node current = head;
        Node next_node = null;

        while(current != null)
        {
           // int b=current.value;

                next_node = current.next;
               // int a=next_node.value;
                current.next = previous;
                previous = current;
              //  int d=previous.value;
                current = next_node;
              //  int e=current.value;
        }
        head = previous;
//        while(head !=null)
//        {
//            System.out.println(head.value);
//            head = head.next;
//        }
return head;
    }


    public void ReverseLinkedList1()
    {
      ReverseLinkedList(head);
    }
    public void middleElement1()
    {
        middleElement(head);
    }





    public boolean palindrome1()
    {
       return palindrome(head);
    }

    public boolean palindrome(Node head)
    {

        Node firstLL = head;
        Node middle = middleElement(head);
        Node head2 = middle.next;
        middle.next = null;
        Node secondLL= ReverseLinkedList(head2);
        while(firstLL != null)
        {
            if(firstLL.value == secondLL.value)
            {
                firstLL = firstLL.next;
                secondLL = secondLL.next;

            }
            else
            {
                return false;
            }
        }
        return true;


    }

    public static void main(String args[])
    {
        palindromeLinkedList1 obj = new palindromeLinkedList1();
        obj.Insert(10);
        obj.Insert(20);
       // obj.Insert(30);
//        obj.Insert(40);
        obj.Insert(10);
        obj.Insert(10);

    boolean flag=  obj.palindrome1();
        System.out.println(flag);

      //  obj.print();
       // obj.middleElement1();

      //  obj.ReverseLinkedList1();
      //  obj.print();


    }




}
