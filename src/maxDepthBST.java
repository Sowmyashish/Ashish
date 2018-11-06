/**
 * Created by ashishsowmya on 9/28/18.
 */
public class maxDepthBST {

    class Node
    {
        Node left;
        Node right;
        int value;

        Node(int x)
        {
            value = x;
            right = left = null;
        }
    }
    Node root;

    public Node insert(Node root,int key)
    {
        if(root == null)
        {
            root = new Node(key);
            int a=root.value;
            return root;
        }
        else if(key < root.value)
        {
          root.left=  insert(root.left,key);
        }
        else if( key > root.value)
        {
            root.right = insert(root.right,key);
        }
        return root;
    }
    public void Insert_node(int key)
    {
       root= insert(root,key);
    }

    public void print(Node root)
    {
        if(root!= null)
        {
            print(root.left);
            System.out.println(root.value);
            print(root.right);
        }

    }

    public void print_node()
    {
        print(root);
    }
    public int maxheight()
    {
      return maxDepth(root);

    }

    public int maxDepth(Node node)
    {
        int height=0;
        if(node == null)
        {
            return 0;
        }
        else
        {
            int left = maxDepth(node.left);
            int right = maxDepth(node.right);

            height= (Math.max(left,right)+1);

        }
        return height;
    }
    public static void main(String args[])
    {
        maxDepthBST obj = new maxDepthBST();
        obj.Insert_node(40);
        obj.Insert_node(50);
        obj.Insert_node(20);
        obj.Insert_node(10);
        obj.Insert_node(60);
        obj.print_node();
       int result= obj.maxheight();
        System.out.println(result);
    }


}
