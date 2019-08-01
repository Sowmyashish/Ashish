package Cisco;

/**
 * Created by ashishsowmya on 6/26/19.
 */
public class FindDuplicate
{
    public int findDuplicate(int[] nums)
    {
        int index=0;
        for(int i=0;i<nums.length;i++)
        {
            index = Math.abs(nums[i])-1;
            if(nums[index] > 0)
            {
                nums[index] = -1*nums[index];
            }
            else
            {
                return index+1;
            }
        }
        return -1;

    }
    public static void main(String[] args)
    {
        FindDuplicate obj = new FindDuplicate();
        int[] a = {1,3,4,2,2};
        int result = obj.findDuplicate(a);
        System.out.println(result);
    }
}
