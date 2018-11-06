package medium;

/**
 * Created by ashishsowmya on 10/8/18.
 */
public class remNthfromendLL {
    Node head;


    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }


    public void append(int new_data) {

        Node new_node = new Node(new_data);
        if (head == null) {
            head = new Node(new_data);
            return;
        }
        new_node.next = null;

        Node last = head;
        while (last.next != null)
            last = last.next;
        last.next = new_node;

    }

    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;


        }
    }


    public void remove(int n)
    {
        removenthnode(head,n);
    }

    public Node removenthnode(Node head,int n)
    {

//        Node slow=head;
//        Node fast = head;
//
//        int count=1;
//        while(count <= n)
//        {
//            fast = fast.next;
//            count++;
//        }
//        while(fast.next != null)
//        {
//            fast = fast.next;
//            slow = slow.next;
//        }
//
//
//        slow.next = slow.next.next;
//        return head;



        Node dummy = new Node(0);
        Node fast = dummy, slow = dummy;
        dummy.next = head;
        for(int i = 0; i < n+1; i++) fast = fast.next;
        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return dummy.next;


    }


    public static void main(String args[])
    {
        remNthfromendLL obj = new remNthfromendLL();
        obj.append(10);
        obj.append(20);
        obj.append(30);
        obj.append(40);
        obj.append(50);
        obj.append(60);
        obj.printList();
       obj.remove(3);
       obj.printList();


    }
}


//https://www.youtube.com/watch?v=5BpQ5m0K_t4