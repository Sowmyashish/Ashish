package walmart;
import java.util.*;

/**
 * Created by ashishsowmya on 6/25/19.
 */
public class VerifyPreOrder
{
    public boolean verifyPreorder(int[] preorder) {
        int low = Integer.MIN_VALUE;
        Stack<Integer> path = new Stack();
        for (int p : preorder)
        {
            if (p < low)
            {
                return false;
            }

            while (!path.empty() && p > path.peek())
            {
                low = path.pop();
            }

            path.push(p);
        }
        return true;
    }

    public static void main(String[] args)
    {
        int[] array = {100,50,30,20,40,70,60,80,150,130,120,140,180};
        VerifyPreOrder obj = new VerifyPreOrder();
      boolean result=  obj.verifyPreorder(array);
        System.out.println(result);
    }
}
