/**
 * Created by ashishsowmya on 5/1/18.
 */
public class reverseLL {
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

    public Node reverse(Node head)
    {
        //iterative

        Node current, previous,next;
        current = head;
        previous = null;
        while (current.next != null)
        {
            next = current.next;
           // int a=next.value;
            current.next = previous;
            if(current.next !=null)
            {
                int b=current.next.value;
            }

            previous = current;
            int c=previous.value;
            current = next;
            int d=current.value;


        }
        head = previous;

        Node temp;
        temp =head;
        while(temp != null)
        {
            System.out.println("values are" +temp.value);
            temp=temp.next;
        }

        return head;
    }

    public void rev()
    {
      int temp=  head.value;

      reverse(head);
    }




    public static void main(String args[])
    {
        reverseLL obj = new reverseLL();
        obj.Insert(10);
        obj.Insert(20);
        obj.Insert(30);
      //  obj.print();
        obj.rev();

    }


}
