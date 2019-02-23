package medium;

/**
 * Created by ashishsowmya on 11/5/18.
 */
public class sortList {
    public class ListNode {

        ListNode next;
        int value;

        public ListNode(int x) {
            value = x;
        }

    }

    ListNode head;

    public void insert(int value) {

        ListNode new_node = new ListNode(value);
        ListNode last = head;

        if (head == null) {

            head = new_node;
            last = new_node;

        } else {
            while (last.next != null) {
                last = last.next;
            }

            last.next = new_node;
            last = last.next;
        }
    }

    public void print() {
        ListNode temp = head;

        System.out.print("values are");
        while (temp != null) {
            System.out.print(temp.value + "\t");
            temp = temp.next;
        }
    }

     public ListNode sortList(ListNode head) {

         if (head == null || head.next == null)
             return head;

         // step 1. cut the list to two halves
         ListNode prev = null, slow = head, fast = head;

         while (fast != null && fast.next != null) {
             prev = slow;
             slow = slow.next;
             fast = fast.next.next;
         }

         prev.next = null;

         // step 2. sort each half
         int headval = head.value;
         ListNode l1 = sortList(head);
         int slowheadval = slow.value;
         ListNode l2 = sortList(slow);

         // step 3. merge l1 and l2
         return merge(l1, l2);
     }

    ListNode merge(ListNode l1, ListNode l2) {
       int l1test = l1.value;
       int l2test = l2.value;
        ListNode l = new ListNode(0), p = l;

        while (l1 != null && l2 != null) {
            if (l1.value < l2.value) {
                p.next = l1;
                l1 = l1.next;
            } else {
                p.next = l2;
                l2 = l2.next;
            }
            p = p.next;
        }

        if (l1 != null)
            p.next = l1;

        if (l2 != null)
            p.next = l2;

        return l.next;
    }




    public static void main(String args[])
    {
        sortList obj = new sortList();
        obj.insert(1);
        obj.insert(3);
        obj.insert(5);
        obj.insert(2);
        obj.insert(4);
        obj.insert(6);
        obj.print();
        ListNode node=obj.sortList(obj.head);
      obj.head = node;
      obj.print();
    }
}
