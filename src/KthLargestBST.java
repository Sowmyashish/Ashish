import java.util.Stack;

/**
 * Created by ashishsowmya on 9/21/18.
 */
public class KthLargestBST {
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

    public KthLargestBST()
    {
        root = null;
    }

    private Node insert(Node root,int value)
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

  public void kth(int k)
  {
      KthsmallestElement(root,k);

  }

  public int KthsmallestElement(Node root,int k)
  {
      int a=0;
int count=0;
      Stack<Node> stack = new Stack<>();
      Node p = root;
      while(p != null & k!=0)
      {
          stack.push(p);
           a= p.value;
          p = p.left;
          count ++;

          if(count == k)
          {

              System.out.println(a);

          }


      }
      return a;
  }


  public static void main(String args[])
  {
      KthLargestBST obj = new KthLargestBST();
      obj.insert_node(30);
      obj.insert_node(20);
      obj.insert_node(50);
      obj.insert_node(10);
      obj.insert_node(60);
      obj.print();
      obj.kth(3);

  }































//
//    class Node {
//        int key;
//        Node left, right;
//
//        public Node(int item) {
//            key = item;
//            left = right = null;
//        }
//    }
//
//    // Root of BST
//    Node root;
//
//    // Constructor
//    KthLargestBST() {
//        root = null;
//    }
//
//    // This method mainly calls insertRec()
//    void insert(int key) {
//        root = insertRec(root, key);
//    }
//
//    /* A recursive function to insert a new key in BST */
//    Node insertRec(Node root, int key) {
//
//        /* If the tree is empty, return a new node */
//        if (root == null) {
//            root = new Node(key);
//            return root;
//        }
//
//        /* Otherwise, recur down the tree */
//        if (key < root.key)
//            root.left = insertRec(root.left, key);
//        else if (key > root.key)
//            root.right = insertRec(root.right, key);
//
//        /* return the (unchanged) node pointer */
//        return root;
//    }
//
//    // This method mainly calls InorderRec()
//    void inorder() {
//        inorderRec(root);
//    }
//
//    // A utility function to do inorder traversal of BST
//    void inorderRec(Node root) {
//        if (root != null) {
//            inorderRec(root.left);
//            System.out.println(root.key);
//            inorderRec(root.right);
//        }
//    }
//
//    // Driver Program to test above functions
//    public static void main(String[] args) {
//        KthLargestBST tree = new KthLargestBST();
//
//        /* Let us create following BST
//              50
//           /     \
//          30      70
//         /  \    /  \
//       20   40  60   80 */
//        tree.insert(50);
//        tree.insert(30);
//        tree.insert(20);
//        tree.insert(40);
//        tree.insert(70);
//        tree.insert(60);
//        tree.insert(80);
//
//        // print inorder traversal of the BST
//        tree.inorder();
//    }





}