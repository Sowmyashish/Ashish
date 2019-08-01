package general;

import java.util.Stack;

/**
 * Created by ashishsowmya on 2/23/19.
 */
public class removeKdigits
{
    public String removeKdigits(String num, int k)
    {

        if(num.length() == k) return "0";
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int i=0;
        while(i < num.length())
        {

         while (!stack.isEmpty() && k > 0 && stack.peek() > num.charAt(i)) {
             k--;
             stack.pop();
         }
         stack.push(num.charAt(i));
         i++;
        }
        //when all the strings are same like 0000, none of the string
        // is deleted and k value remains same, so delete first 3 characters
        while(k > 0)
        {
            stack.pop();
            k--;
        }

        while(!stack.isEmpty())
        {
            sb.append(stack.pop());
        }

         sb.reverse();

         //if the first character of the result " 0200" is 0 then remove
        while(sb.length()>1 && sb.charAt(0) == '0')
        {
            sb.deleteCharAt(0);
        }
        return sb.toString();

    }

    public static void main(String args[])
    {
        String str = "0200";
        int k=3;
        removeKdigits obj = new removeKdigits();
       String string= obj.removeKdigits(str,k);
        System.out.println(string);


    }
}
