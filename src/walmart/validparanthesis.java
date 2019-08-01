package walmart;
import java.util.*;

/**
 * Created by ashishsowmya on 6/20/19.
 */
public class validparanthesis
{

    public boolean valid(String str)
    {

        if(str.length() ==1 || str.length()%2 != 0) return false;
        Stack<Character> stack = new Stack();
          for(int i=0;i<str.length();i++)
          {
              if(str.charAt(i) == '(')
              {
                    stack.push(')');
              }
              else if(str.charAt(i) == '[')
              {
                  stack.push(']');
              }
              else if(str.charAt(i) == '{')
              {
                  stack.push('}');
              }
              else if(stack.isEmpty() || str.charAt(i) != stack.pop())
              {
                  return false;
              }
          }
          return stack.isEmpty();
    }

    public static void main(String args[])
    {
        String str = "{(([))}";
        validparanthesis obj = new validparanthesis();
        boolean result = obj.valid(str);
        System.out.println(result);
    }
}
