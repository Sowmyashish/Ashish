package general;
import java.util.*;
/**
 * Created by ashishsowmya on 2/2/19.
 */
public class validateStackSequence {

    public boolean validateStackSequences(int[] pushed,int[] popped)
    {
        Stack<Integer> stack = new Stack<>();
        int i=0;
        for(int p:pushed)
        {
            stack.push(p);
            while( !stack.isEmpty() && stack.peek() == popped[i])
            {
                stack.pop();
              ++i;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String args[])
    {
        int[] pushed = {1,2,3,4,5};
        int[] popped = {4,5,3,2,1};
        validateStackSequence obj = new validateStackSequence();
      boolean result=  obj.validateStackSequences(pushed,popped);
        System.out.println(result);
    }
}
