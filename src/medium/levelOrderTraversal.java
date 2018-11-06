package medium;
import java.util.*;
import java.util.Queue;

/**
 * Created by ashishsowmya on 9/28/18.
 */
public class levelOrderTraversal {

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


    public void levelordering()
    {
      //  level(root);
        levelOrder(root);
    }

    public List<List<Integer>> test(Node root)
    {

        List<List<Integer>> mainList = new LinkedList<>();
        List<Integer> subArray = new LinkedList<>();
        Queue<Node> queue = new LinkedList<>();

        if(root == null)
        {
            return mainList;
        }

            queue.offer(root);
            while(!queue.isEmpty())
            {
                int size = queue.size();
                for(int i=0;i<size;i++)
                {
                    if(queue.peek().left != null)
                        queue.offer(queue.peek().left);

                    if(queue.peek().right !=null)

                        queue.offer(queue.peek().right);

                    subArray.add(queue.poll().value);
                }
                mainList.add(subArray);
            }
        return mainList;


    }

    public List<List<Integer>> level(Node root)
    {
        List<List<Integer>> mainList = new LinkedList<>();
        if( root == null)
        {
           return mainList;
        }
        else
        {
            Queue<Node> queue=new LinkedList<Node>();
            queue.offer(root);

            List<Integer> subList= new LinkedList<>();
            while(!queue.isEmpty())
            {

                Node current = queue.peek();
                System.out.println(current.value);
                if(current.left != null)
                {
                    queue.offer(current.left);
                }
                if(current.right != null)
                {
                    queue.offer(current.right);
                }
                subList.add(queue.poll().value);

            }
            mainList.add(subList);


        }
        return mainList;
    }



    public List<List<Integer>> levelOrder(Node root) {
        Queue<Node> queue = new LinkedList<Node>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();

        if(root == null) return wrapList;

        queue.offer(root);
        while(!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<Integer>();
            for(int i=0; i<levelNum; i++) {
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                subList.add(queue.poll().value);
            }
            wrapList.add(subList);
        }
        return wrapList;
    }

    //https://www.youtube.com/watch?v=86g8jAQug04

    public static void main(String args[])
    {
        levelOrderTraversal obj = new levelOrderTraversal();
        obj.insert_node(30);
        obj.insert_node(20);
        obj.insert_node(50);
        obj.insert_node(10);
        obj.insert_node(60);
       // obj.print();
        //obj.levelordering();
        obj.levelordering();
    }
}
