package Cisco;

/**
 * Created by ashishsowmya on 6/26/19.
 */
public class ReorderList
{
    class ListNode
    {
        ListNode next;
        int value;
    }

    public void reorderList(ListNode head)
    {


        if(head == null || head.next ==null) return;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next != null && fast.next.next != null)
        {
            slow = slow.next;
            fast= fast.next.next;
        }
        ListNode middle = slow;



        ListNode current = slow.next;
        ListNode previous =null;
        ListNode next = null;
        while(current != null)
        {
            next = current.next;
            current.next = previous;
            previous =current;
            current = next;
        }

        middle.next = previous; // attaching middle.next to the reversed linked list that is to the head of the reversed linked list
        // 1->2->3->6->5->4
        ListNode current1 = head;  //initially 1
        ListNode reverse_head = middle.next;//initially 6
        while(current1 != middle)
        {
            middle.next = reverse_head.next;
            reverse_head.next = current1.next;
            current1= reverse_head.next;
            reverse_head = middle.next;





            // middle.next=reverse_head.next;
            // reverse_head.next=current.next;
            // current.next=reverse_head;
            // current=reverse_head.next;
            // reverse_head=middle.next;
        }
    }

}
