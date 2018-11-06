package general;

import java.util.HashMap;
import java.util.Stack;

/**
 * Created by ashishsowmya on 10/27/18.
 */
public class nextGreaterElement1 {

    public int[] nextGreaterElement(int[] sub,int[] nums)
    {
        Stack<Integer> stack = new Stack<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums)
        {
            while(!stack.isEmpty() && stack.peek() < num)
            {
                    map.put(stack.pop(),num);
            }
            stack.push(num);
        }

        for(int i=0;i<sub.length;i++)
        {
          sub[i]=  map.getOrDefault(sub[i],-1);
        }

        return sub;
    }

    public static void main(String args[])
    {
        nextGreaterElement1 obj = new nextGreaterElement1();
        int[] sub  = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] result = obj.nextGreaterElement(sub,nums2);
                for(int i=0;i<result.length;i++)
                {
                    System.out.println(result[i]);
                }
    }

}





