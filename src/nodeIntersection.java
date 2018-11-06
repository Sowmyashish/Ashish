/**
 * Created by ashishsowmya on 6/14/18.
 */
public class nodeIntersection {

    Node head;
    Node tail;
    public class Node
    {
        int value;
        Node Next;

        public Node(int x)
        {
            value=x;
            Next =null;
        }
    }


    public void Insert(int x)
    {

        Node new_node = new Node(x);
        if(head == null)
        {
            new_node.value = x;
            head = new_node;
            tail=new_node;
            tail.Next = null;
        }
        else
        {
            new_node.value = x;
            tail.Next = new_node;
            tail = new_node;
        }
    }

    public void print()
    {
        Node new_node = head;
        while(new_node != null)
        {
            System.out.println(new_node.value);
            new_node = new_node.Next;
        }
    }



    public static void main(String args[])
    {
        nodeIntersection obj = new nodeIntersection();
        obj.Insert(10);
        obj.Insert(20);
        obj.Insert(40);
        obj.Insert(60);
        obj.Insert(80);
        obj.print();

        nodeIntersection obj1 = new nodeIntersection();
        obj.Insert(100);
        obj.Insert(90);
        obj1.Insert(60);
        obj1.Insert(80);




    }
}
