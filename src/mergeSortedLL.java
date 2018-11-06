/**
 * Created by ashishsowmya on 9/28/18.
 */
public class mergeSortedLL {

    Node head;
    Node tail;
    class Node
    {
        Node next;
        int value;

        Node(int x)
        {
            value =x;
        }
    }



    public void Insert(int x)
    {
        Node new_node = new Node(x);
        new_node.value =x;
        if(head ==  null)
        {
            head = new_node;
            tail = new_node;
            new_node.next = null;

        }
        else
        {
            tail.next = new_node;
            tail = new_node;
        }
    }

    public void print()
    {

        Node temp=head;
        while(temp != null)
        {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }


    //iterative solution


//    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        if (l1 == null) return l2;
//        if (l2 == null) return l1;
//
//        ListNode head = null;
//
//        if (l1.val <= l2.val) {
//            head = l1;
//            l1 = l1.next;
//        } else {
//            head = l2;
//            l2 = l2.next;
//        }
//
//        ListNode cur = head;
//
//        while (l1 != null && l2 != null) {
//            if (l1.val <= l2.val) {
//                cur.next = l1;
//                l1 = l1.next;
//            } else {
//                cur.next = l2;
//                l2 = l2.next;
//
//            }
//            cur = cur.next;
//        }
//
//        cur.next = l1 == null ? l2:l1;
//        return head;
//    }
//}







    public Node merge(Node L1, Node L2) {
        Node head1 = L1;
        Node head2 = L2;

        Node new_node = new Node(head1.value);
        Node l3 = new_node;

        while (head1 != null && head2 != null) {
            if (head1.value <= head2.value) {
                l3 = head1;
                head1 = head1.next;
            } else {
                l3 = head2;
                head2 = head2.next;

            }
            l3 = l3.next;
            if (head1 != null) {
                l3.next = head1;
            }
            if (head2 != null) {
                l3.next = head2;
            }
        }
        return new_node.next;
    }

    public Node mergeTwoLists(Node l1, Node l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        if(l1.value < l2.value){
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else{
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }




    public static void main(String args[])
    {

        mergeSortedLL obj = new mergeSortedLL();
        obj.Insert(10);
        obj.Insert(20);
        obj.Insert(30);
        obj.Insert(40);
        obj.print();
        System.out.println(" ");
        mergeSortedLL obj2 = new mergeSortedLL();
        obj2.Insert(15);
        obj2.Insert(25);
        obj2.Insert(35);
        obj2.Insert(45);
        obj2.print();

        mergeSortedLL obj3 =new mergeSortedLL();
        Node node= obj3.mergeTwoLists(obj.head,obj2.head);
       int a= node.value;
        while(node != null)
        {
           System.out.println(node.value);
           node = node.next;
         }



    }
}
