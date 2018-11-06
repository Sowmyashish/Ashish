package medium;
import java.util.*;

/**
 * Created by ashishsowmya on 8/16/18.
 */
public class inOrder {

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

    private List<Integer> inorderTraversal(Node root) {
        List<Integer> list = new ArrayList<>();
     //  int a=root.value;
      // int b= root.left.value;

        while(root != null)
        {
            inorderTraversal(root.left);
            System.out.println(root.value);
           // list.append()
            inorderTraversal(root.right);
        }


        for(int i=0;i<list.size();i++)
        {
            System.out.println(list.get(i));
        }

        return list;
    }
    public void in()
    {
        inorderTraversal(root);
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

    public static void main(String args[])
    {
        inOrder obj = new inOrder();
        obj.insert_node(30);
        obj.insert_node(20);
        obj.insert_node(50);
        obj.insert_node(10);
        obj.insert_node(60);
      obj.in();
       // obj.print();

    }
}
