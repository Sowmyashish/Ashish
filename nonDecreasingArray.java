package general;

/**
 * Created by ashishsowmya on 2/2/19.
 */
public class nonDecreasingArray {
    public boolean decreasing(int[] nums)
    {
        int count=0;
        for(int i=0;i+1<nums.length;i++)
        {
            if(nums[i] > nums[i+1])
            {
                count++;


               if(i>0 && nums[i+1] < nums[i-1])
               {
                  nums[i+1] = nums[i];
               }
               else
               {
                    nums[i] = nums[i+1];
               }
            }
        }
        return count<=1;
    }

    public static void main(String args[])
    {
        nonDecreasingArray obj = new nonDecreasingArray();
        int[] nums = {-1,4,2,3};
        boolean result = obj.decreasing(nums);
        System.out.println(result);
    }
}
