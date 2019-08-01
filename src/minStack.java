/**
 * Created by ashishsowmya on 6/15/18.
 */

import java.util.*;

public class minStack {

    Stack<Integer> stack1;
    Stack<Integer> stack2;
    int min = Integer.MIN_VALUE;
    public minStack()
    {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }


    public void push(int x)
    {
        stack1.push(x);
        if(stack2.isEmpty())
        {
            stack2.push(x);
            min = x;
        }
        else if( x <= min)
        {
            stack2.push(x);
            min = x;
        }
    }

    public void pop()
    {
        int a =stack1.peek();
        int b = stack2.peek();
        if(a== b)
        {
            stack1.pop();
            stack2.pop();
        }
        else
        {
            stack1.pop();
        }
    }

    public int top() {
        return stack1.peek();
    }

    public int getMin()
    {
        return stack2.peek();

    }

    public static void main(String args[])
    {
        minStack obj = new minStack();
         obj.push(512);
         obj.push(-1024);
         obj.push(-1024);
         obj.push(512);
         obj.pop();
         int tet = obj.top();
        int b= obj.getMin();
        System.out.println(b);
         obj.pop();

       int c=  obj.getMin();
        System.out.println(c);
         obj.pop();
        int d= obj.getMin();
        System.out.println(d);

    }
}
