package string;
import walmart.Integerpalindrome;

import java.util.*;

/**
 * Created by ashishsowmya on 7/19/19.
 */
public class ValidParanthesisString
{
    public boolean checkValidString(String s)
    {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                stack1.push(')');
            }
            else if(s.charAt(i) == '*')
            {
                stack2.push('*');
            }
            else
            {
                if(stack1.isEmpty())
                {
                    return false;
                }
                if(!stack1.isEmpty() && stack1.pop() == s.charAt(i))
                {
                    continue;
                }
                else if(stack2.isEmpty())
                {
                    return false;
                }
                else if(!stack2.isEmpty())
                {
                    stack2.pop();
                    continue;
                }
            }
        }
        if(stack1.isEmpty())
        {
            return true;
        }
       else if(stack1.size() == stack2.size())
        {
            return true;
        }
        else if(stack2.size() > stack1.size())
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args)
    {
        ValidParanthesisString obj = new ValidParanthesisString();
        boolean result = obj.checkValidString("(())((())()()(*)(*()(())())())()()((()())((()))(*");
        System.out.println(result);
    }
}
