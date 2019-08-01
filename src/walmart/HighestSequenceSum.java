package walmart;

/**
 * Created by ashishsowmya on 6/21/19.
 */
public class HighestSequenceSum
{
    public int[] highest(int[] nums)
    {
        int max_so_far = nums[0];
        int sum = 0;
        int start =0;
        int end=0;
        int s=0;
        for(int i=1;i<nums.length;i++)
        {
            sum = sum + nums[i];
            if(max_so_far <sum)
            {
                max_so_far = sum;
                end = i;
                start =s;
            }
            if(sum < 0)
            {
                sum =0;
                s = i+1;
            }
        }
        int[] new_array = new int[end-start+1];
        int count=0;
        for(int i=start;i<=end;i++)
        {
            new_array[count] = nums[i];
            count++;
        }

        return new_array;

    }


    public int[] highestsum(int[] nums)
    {
        int s =0;
        int start =0;
        int end=0;
        int max_so_far = nums[0];
        int sum = 0;
        for(int i=0;i<nums.length;i++)
        {
            sum = sum + nums[i];
           // max_so_far = Math.max(max_so_far,sum);

            if(max_so_far< sum)
            {
                max_so_far = sum;
                start =s;
                end = i;

            }
            if(sum < 0)
            {
                sum =0;
                s = i+1;
            }
        }
        return new int[]{start,end};
    }
    public static void main(String args[])
    {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
         HighestSequenceSum obj = new HighestSequenceSum();

         int[] result = obj.highestsum(nums);
         for(int i:result)
             System.out.println(i);
    }

}
