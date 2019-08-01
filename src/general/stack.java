package general;

import java.util.Stack;

/**
 * Created by ashishsowmya on 5/31/19.
 */
public class stack
{
    public static void main(String args[])
    {
        Stack s= new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        System.out.println(s.search(1));


    }
}
