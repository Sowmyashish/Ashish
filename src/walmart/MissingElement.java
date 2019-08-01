package walmart;

/**
 * Created by ashishsowmya on 6/21/19.
 */
public class MissingElement
{
    public int missing(int[] nums)
    {

        int xor = 0;
        int i=0;
        for( i = 0;i<nums.length;i++)
        {
            xor = nums[i] ^i^xor;
        }
        return xor^i;

    }


    public int miss(int[] nums)
    {
        int xor = 0;
        int i;
        for( i=0;i<nums.length;i++)
        {
            xor = xor ^i ^ nums[i];
        }
        return xor^i;
    }

    public static void main(String[] args)
    {
        int[] nums = {1};
        MissingElement obj = new MissingElement();
      int result=  obj.miss(nums);
        System.out.println(result);
    }
}
