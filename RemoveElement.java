package general;

/**
 * Created by ashishsowmya on 2/10/19.
 */
public class RemoveElement
{
    public int removeElement(int[] nums, int val)
    {
        int j=0;
        int count=0;
        if(nums.length == 0)
            return 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] != val)
            {
                nums[j] = nums[i];
                j++;
            }
            else
                count++;


        }
        return nums.length-count;
    }

    public static void main(String args[])
    {
        int[] nums = {3,2,2,3};
        int value = 3;
        RemoveElement obj = new RemoveElement();
        int result = obj.removeElement(nums,value);
        System.out.println(result);
    }
}
