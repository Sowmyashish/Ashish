package general;

import java.util.Stack;

/**
 * Created by ashishsowmya on 2/1/19.
 */
public class minAddtovalidParanthesis
{
    public int minAddToMakeValid(String S)
    {
        int count=0;
        Stack<Character> stack = new Stack<>();
        for(char c: S.toCharArray())
        {

             if(c == ')' && !stack.isEmpty() && stack.peek() == '(')
            {
                   stack.pop();
            }
            else
             {
                 stack.push(c);
             }
        }
            return stack.size();
    }

    public static void main(String args[])
    {
        String str = "()))((";
        minAddtovalidParanthesis obj = new minAddtovalidParanthesis();
        int count = obj.minAddToMakeValid(str);
        System.out.println(count);
    }
}
