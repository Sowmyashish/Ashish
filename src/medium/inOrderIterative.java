package medium;

import java.util.Stack;

/**
 * Created by ashishsowmya on 10/3/18.
 */
public class inOrderIterative {

    class Node {
       Node left;
        Node right;
        int value;

        Node(int x) {
            value=x;
            right = left = null;
        }
    }
    Node root;



    private Node insert(Node root, int value)
    {
        if(root == null)
        {
            root = new Node(value);
            int a=root.value;
            return root;
        }
        else if(value < root.value)
        {
            root.left = insert(root.left,value);
        }
        else if(value > root.value)
        {
            root.right= insert(root.right,value);
        }

        return root;
    }

    private void insert_node(int value)
    {
        root= insert(root,value);
    }

    public void print()
    {
        print_node(root);
    }

    public void print_node(Node root)
    {
        if(root!=null)
        {
            print_node(root.left);
            System.out.println(root.value);
            print_node(root.right);

        }
    }

    public void inOrderIterative1()
    {
        Node p = root;
        Stack<Node> stackObject = new Stack<>();
        while(true)
        {
            while(p != null)
            {
                stackObject.push(p);
                p = p.left;
            }

            if(stackObject.isEmpty())

            {
                break;
            }
            Node pop=stackObject.pop();
            System.out.println(pop.value);
            p = p.right;
        }
    }

    public static void main(String args[])
    {
        inOrderIterative obj = new inOrderIterative();
        obj.insert_node(10);
        obj.insert_node(20);
        obj.insert_node(6);
        obj.insert_node(3);
        obj.insert_node(1);
        obj.insert_node(7);
        obj.insert_node(15);
        obj.insert_node(25);
        obj.insert_node(12);
        obj.insert_node(18);
        obj.insert_node(23);
        obj.inOrderIterative1();
    }
}
