package hard;

import java.util.PriorityQueue;

/**
 * Created by ashishsowmya on 11/1/18.
 */


class Node
{
    int key;
    Node left, right;

    public Node(int item)
    {
        key = item;
        left = right = null;
    }
}
class SerializeDeserialize {


    Node root;

    // Constructors
    SerializeDeserialize(int key)
    {
        root = new Node(key);
    }

    SerializeDeserialize()
    {
        root = null;
    }

    public void print(Node root)
        {
            if(root == null){
                System.out.print("null" + "\t");
            }

            else{
                print(root.left);
                System.out.print(root.key + "\t");
                print(root.right);
            }
        }

        public void print1()
        {
            print(root);
        }


    public String serialize(Node root)
    {
      Node node = root;
        PriorityQueue<Node> pq = new PriorityQueue<>();

        while(node != null)
        {
            pq.offer(node);

            node = node.left;
            Node deleteNode= pq.poll();

            if(deleteNode.left != null)
            {
                pq.offer(deleteNode.left);

            }
            if(deleteNode.right != null)
            {
                pq.offer(deleteNode.right);
            }

        }



        return " ";

    }
    public static void main(String args[])
    {
        SerializeDeserialize obj = new SerializeDeserialize();
//        obj.root = new Node(1);
//        obj.root.left = new Node(2);
//        obj.root.right = new Node(3);
//     //   obj.root.left.left = new Node(5);
//        obj.root.right.left = new Node(4)
//        obj.print1();
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        obj.print(root);


    }


}
