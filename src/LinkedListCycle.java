/**
 * Created by ashishsowmya on 9/30/18.
 */
public class LinkedListCycle {
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

    public boolean cycle(Node node)
    {
        Node current = node;
        Node next= node;
        if(node == null)
        {
            return false;
        }
        else
        {
            while(next.next != null && next.next.next !=null)
            {
                current = current.next;
                next = current.next.next;
                if(current == next)
                {
                    return true;
                }
            }
        }
return false;
    }

}
