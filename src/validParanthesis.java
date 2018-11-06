import java.util.HashMap;
import java.util.Stack;

/**
 * Created by ashishsowmya on 10/1/18.
 */
public class validParanthesis {
   public boolean valid(String str)
   {
        Stack<Character> stackObject = new Stack<>();

        for (int i=0;i<str.length()-1;i++)
        {


            if(str.charAt(i) == '(')
            {
                stackObject.push(')');
            }
            else if(str.charAt(i) == '{')
            {
                stackObject.push('}');
            }
            else if(str.charAt(i) == '[')
            {
                stackObject.push(']');
            }
            else if(stackObject.isEmpty() || stackObject.pop() != str.charAt(i))
            {
                return false;
            }
        }

        return stackObject.isEmpty();

   }

   public static void main(String args[])
   {
       String str = "()";
       validParanthesis obj = new validParanthesis();
       boolean result=  obj.valid(str);
       System.out.println(result);

   }


}
