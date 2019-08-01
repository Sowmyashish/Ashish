package walmart;

/**
 * Created by ashishsowmya on 6/21/19.
 */
public class ArrayReturnAdding
{
    public int sum(int[] nums)
    {
        int result =0;
        for(int i=0;i<nums.length;i++)
        {
            nums[i] = nums[i]+1;
        }
        for(int i=0;i<nums.length;i++)
        {
            result = result+nums[i];
        }
        return result;
    }

    public static void main(String args[])
    {
        ArrayReturnAdding obj = new ArrayReturnAdding();
        int[] nums = {1,2,3,4,5};
        int result = obj.sum(nums);
        System.out.println(result);
    }
}
