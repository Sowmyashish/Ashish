package walmart;
import java.util.*;

/**
 * Created by ashishsowmya on 6/30/19.
 */

//implement queue using 2 stacks
public class queueWIth2Stacks
{
    Stack<Integer> stack1 = new Stack<>();
    Stack<Integer> stack2 = new Stack<>();

    public void push(int x)
    {
        while(!stack1.isEmpty())
        {
            stack2.push(stack1.pop());
        }
        stack1.push(x);
        while(!stack2.isEmpty())
        {
            stack1.push(stack2.pop());
        }

    }

    public int pop()
    {
        return stack1.pop();
    }

    public int peek()
    {
        return stack1.peek();
    }

    public static void main(String args[])
    {
        queueWIth2Stacks obj = new queueWIth2Stacks();
        obj.push(1);
        obj.push(2);
        obj.push(3);
       int a= obj.pop();
        System.out.println(a);
    }

}
