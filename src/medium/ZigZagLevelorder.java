package medium;
import java.util.*;
/**
 * Created by ashishsowmya on 10/13/18.
 */

//https://www.youtube.com/watch?v=YsLko6sSKh8

public class ZigZagLevelorder {
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


    public void zigzag()
    {
         zigzagLevelOrder(root);
    }

    public List<List<Integer>> zigzagLevelOrder(Node root)
    {

        Stack<Node> stack1 = new Stack<>();
        Stack<Node> stack2 = new Stack<>();

        List<List<Integer>> res = new LinkedList<>();
         if(root == null)
         {
             return res;
         }

        stack1.add(root);
         while(!stack1.isEmpty() || !stack2.isEmpty())
         {
             List<Integer> list = new LinkedList<>();
             if(!stack1.isEmpty())
             {
                 while(!stack1.isEmpty())
                 {
                     Node node = stack1.pop();
                     list.add(node.value);
                     //keep pushing from left to right into stack2 so that while popping stack2 we get the elements from right to left
                     if(node.left != null)
                     {
                         stack2.push(node.left);
                     }
                     if(node.right != null)
                     {
                         stack2.push(node.right);
                     }
                 }
             }else
             {
                 //stack2 is not empty
                 while(!stack2.isEmpty())
                 {
                     Node node = stack2.pop();
                     list.add(node.value);
                     //add from right to left into stack1
                     if(node.right != null)
                     {
                         stack1.add(node.right);
                     }
                     if(node.left != null)
                     {
                         stack1.add(node.left);
                     }

                 }
             }
             res.add(list);

         }
return res;

    }

    public static void main(String args[])
    {
        ZigZagLevelorder obj = new ZigZagLevelorder();
        obj.insert_node(3);
        obj.insert_node(9);
        obj.insert_node(20);
        obj.insert_node(1);
        obj.insert_node(7);
        obj.print();
       obj.zigzag();

    }
}
