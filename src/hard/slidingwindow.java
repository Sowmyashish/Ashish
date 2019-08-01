package hard;
import java.util.*;

/**
 * Created by ashishsowmya on 5/15/19.
 */
public class slidingwindow
{

    public int[] sliding(int[] nums,int k)
    {
        int max = Integer.MIN_VALUE;
        if(nums.length == 0)
        {
            int[] outerArray = {};
            return outerArray;
        }

        int[] outerArray = new int[nums.length-k+1];
        if(nums.length ==2)
        {
            for(int i=0;i<2;i++)
            {
                outerArray[i] = nums[i];
            }
            return outerArray;
        }


        for(int i=0;i<nums.length-k+1;i++)
        {
            max =0;
            for(int j=i;j<i+k;j++)
            {
                max= Math.max(max,nums[j]);
            }
            outerArray[i] = max;
        }
        return outerArray;

    }


    public int[] sliding1(int[] nums,int k)
    {
        if(nums.length == 0 || k <=0)
            return new int[0];

        int[] result = new int[nums.length- k + 1];
        Deque<Integer> deque = new LinkedList<>();

         for(int i=0;i<nums.length;i++)
         {
             if( !deque.isEmpty() && deque.peek() < i-k+1)
             {
                 deque.poll();
             }

             while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()])
             {
                 int a = nums[deque.peekLast()];
                 int b = deque.peekLast();
                 int z=deque.pollLast();
             }
             deque.offer(i);
             if (i - k + 1 >= 0) {
                 result[i - k + 1] = nums[deque.peek()];
             }
         }

return result;
    }

//ideserve



    public static void main(String args[])
    {
        slidingwindow obj = new slidingwindow();
        int[] a = {7,2,4};

       int arr[]= obj.sliding1(a,2);
       for(int i=0;i<arr.length;i++)
       {
           System.out.println(arr[i]);
       }
    }

}
