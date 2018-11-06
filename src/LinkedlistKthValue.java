/**
 * Created by ashishsowmya on 9/27/18.
 */
public class LinkedlistKthValue {

    Node head;
    Node tail;
    public class Node{
        Node next;
        Node previous;
        int value;

        public Node(int x)
        {
            value =x;
        }

    }

    public void Insert(int x)
    {
        LinkedlistKthValue.Node new_node = new LinkedlistKthValue.Node(x);
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
        LinkedlistKthValue.Node temp;
        temp =head;
        while(temp != null)
        {
            System.out.println("values are" +temp.value);
            temp=temp.next;
        }
    }


    public int kth(int k) {

        int count = 1;
        Node p = head;
        int a =p.value;
        while (p != null)

        {
            if (count == k) {
                a = p.value;
                return a;
            } else {
                count = count + 1;
                p = p.next;
            }

        }
        return a;
    }

    public static void main(String args[])
    {
        LinkedlistKthValue obj = new LinkedlistKthValue();
        obj.Insert(4);
        obj.Insert(3);
        obj.Insert(1);
        obj.Insert(2);
        obj.Insert(5);
        obj.print();
       int result= obj.kth(3);
        System.out.println(result);


    }


}
