package Cisco;

/**
 * Created by ashishsowmya on 6/26/19.
 */


import java.util.*;

public class CopyListWithRandonPointer
{
    class Node
    {
        public int val;
        public Node next;
        public Node random;

        public Node() {}

        public Node(int _val,Node _next,Node _random) {
            val = _val;
            next = _next;
            random = _random;
        }

        public Node(int _val) {
            val = _val;
        }
    }


    public Node copyRandomList(Node head)
    {
        if(head == null) return null;
        Node current = head;
        HashMap<Node,Node> map = new HashMap<>();
        while(current != null)
        {
            map.put(current,new Node(current.val));
            current = current.next;
        }

        current = head;
        while(current != null)
        {
            map.get(current).next = map.get(current.next);
            map.get(current).random = map.get(current.random);
            current=current.next;
        }
        return map.get(head);

    }

}
