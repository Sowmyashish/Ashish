package walmart;

/**
 * Created by ashishsowmya on 6/20/19.
 */
public class SecondlargestinArray
{
    public int largest(int[] nums)
    {
        if(nums.length ==1 || nums.length ==0) return -1;
        int max1 = nums[0];

        int max2= Integer.MIN_VALUE;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] > max1  )
            {
                 max2 = max1;
                max1 =nums[i];

            }
            else if(nums[i] < max1 && nums[i] >max2)
            {
                max2 = nums[i];
            }
        }
        return max2;
    }

    public int largest1(int[] nums)
    {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;


        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] > max2 && nums[i] < max1)
            {
                max2 = nums[i];
            }
            else if(nums[i] > max2 && nums[i]>max1)
            {
                max2 = max1;
                max1 = nums[i];
            }
        }
        return max2;
    }

    public static void main(String args[])
    {
        SecondlargestinArray obj = new SecondlargestinArray();
        int[] nums = {1,36,34,7,322};
        int a = obj.largest(nums);
        System.out.println(a);
    }
}
