/**
 * Created by ashishsowmya on 5/3/18.
 */
public class maxSubarray {



    static int maxSubArraySum(int a[])
    {
        int size = a.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + a[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }


    public int maxSubArray(int[] nums)
    {
        int max_so_far = nums[0];
        int current =0;
        for(int i=0;i<nums.length;i++)
        {
            current = current + nums[i];
            if(current > max_so_far)
            {
                max_so_far = current;
            }
            if(current<0)
            {
                current =0;
            }
        }
       return max_so_far;
    }


    public static void main (String[] args)
    {
        maxSubarray obj = new maxSubarray();
        int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
        int result = obj.maxSubArray(a);
        System.out.println(result);

    }
}
