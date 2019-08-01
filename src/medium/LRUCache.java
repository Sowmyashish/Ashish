package medium;
import java.util.*;

/**
 * Created by ashishsowmya on 6/2/19.
 */
public class LRUCache
{

    private int count;
    private int capacity;
    private Node head, tail;
    public Hashtable<Integer, Node>
            cache = new Hashtable<Integer, Node>();

    class Node
    {
        int key;
        int value;
        Node prev;
        Node next;
    }



    public LRUCache(int capacity)
    {
        this.count = 0;
        this.capacity = capacity;
        head = new Node();
        tail = new Node();
        head.prev = null;
        tail.next = null;
        head.next = tail;
        tail.prev = head;

    }



    public void add(Node new_node)
    {
        //new node is always added to the front

        new_node.prev = head;
        new_node.next = head.next;
        head.next.prev = new_node;
        head.next = new_node;
    }


    public Node deleteTail()
    {

        Node node = tail.prev; // node which need to be deleted
        this.remove(node);

        return node;
    }



    public void remove(Node node)
    {
        Node preNode = node.prev;
        Node nextNode = node.next;

        preNode.next = nextNode;
        nextNode.prev = preNode;
    }

    //if a node already exists, we need to remove from the end and add to the front
    public void moveHead(Node node)
    {
        this.remove(node);
        this.add(node);
    }


    public int get(int key)
    {

        Node node=  cache.get(key);
        if(node == null)
            return -1;
        this.moveHead(node);
        return node.value;

    }

    public void put(int key, int value)
    {
        //first we neeed to check if that key exist or not, waste of adding a new node when that node already exists, so check it in hashtable
        Node node = cache.get(key);
        if(node == null)
        {
            //this means there is no node and we need to create a node with key and value
            Node new_node = new Node();
            new_node.key = key;
            new_node.value = value;
            //add this new node to the hastable with key and new_node
            this.cache.put(key,new_node);
            //now add this by changing modifying the next of head to this new node

            this.add(new_node); // NEW METHOD
            count++;
            if(count > capacity)
            {
                //now delete a node which is least frequently accessed or used, which will always be present to the previous of tail and decrement the count and add this node to the front of the head.next


                //first delete the node
                Node del_Node = this.deleteTail(); // NEW METHOD
                //since we dont know which key to remove from the hashtable, the node which is passed as parameter is the new_node key, we need to delete the alreadypresent key,therefore get it from deleteTail method and access the key.
                cache.remove(del_Node.key);
                --count;
            }
        }
        //end of if loop, that is if node is not present in the hashtable.
        else
        {
            //if node is present we need to move the node to the front

            node.value = value; // key would be same, update the value of the node
            this.moveHead(node); // NEW METHOD

        }


    }
}