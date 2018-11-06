/**
 * Created by ashishsowmya on 10/8/18.
 */
public class singlyLinkedList {

    Node head;
    public class Node
    {
        Node next;
        int value;

        public Node(int x)
        {
            value=x;
        }
    }


    public void Insert(int value)
    {
        Node new_node = new Node(value);
        new_node.value = value;
        Node last = head;

        if(head == null)
        {

            head = new_node;
            last = new_node;
        }

        else
        {
            while(last.next !=null)
            {
                last = last.next;
            }
            last.next = new_node;
            last = new_node;

        }
    }

    public void print()
    {
            Node temp=head;
            while(temp != null)
            {
                System.out.println("values are" +temp.value);
                temp=temp.next;
            }
        }


    public Node add(Node l1_head,Node l2_head)
    {

        int carry=0;
        int remainder=0;
        int number =0;
        int result=0;

        Node l1 = l1_head;
        Node l2= l2_head;

        while(l1 != null && l2 != null)

        {
            result = l1.value + l2.value + carry;
            Node l3_head = new Node(result);
            Node l3_tail = head;




            if (result <= 9)
            {
                if (head == null) {
                    head = l3_head;
                    l3_tail = l3_head;
                    l3_tail.next =null;
                    l1 = l1.next;
                    l2 = l2.next;
                }
                else {

                    while (l3_tail.next != null) {
                        l3_tail = l3_tail.next;
                    }
                    l3_tail.next = l3_head;
                    l3_tail = l3_head;
                    l1 = l1.next;
                    l2 = l2.next;

                }
            }

            else if(result > 9)
            {
                carry = result/10;
                number = result%10;


                    if (head == null) {
                        l3_head.value = number;
                        head = l3_head;
                        l3_tail = l3_head;
                        l3_tail.next =null;
                        l1 = l1.next;
                        l2 = l2.next;
                    }
                    else {

                        while (l3_tail.next != null) {
                            l3_tail = l3_tail.next;
                        }
                        l3_head.value = number;
                        int hh = l3_head.value;
                        l3_tail.next = l3_head;
                        l3_tail = l3_head;
                        l1 = l1.next;
                        l2 = l2.next;

                    }
                }

        }

        return head;

    }


    public static void main(String args[])
    {
        singlyLinkedList obj = new singlyLinkedList();
        obj.Insert(3);
        obj.Insert(4);
        obj.Insert(5);
        obj.print();

        singlyLinkedList obj1 = new singlyLinkedList();
        obj1.Insert(7);
        obj1.Insert(7);
        obj1.Insert(6);


        obj1.print();

        singlyLinkedList obj3 = new singlyLinkedList();
        Node node=  obj3.add(obj.head,obj1.head);
        Node temp=node;
        while(temp != null)
        {
            System.out.println("values are" +temp.value);
            temp=temp.next;
        }

    }
}
