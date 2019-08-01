package LikedQuestions;

/**
 * Created by ashishsowmya on 2/25/19.
 */
public class shortedUnsortedContinues
{
    public int findUnsortedSubarray(int[] nums)
    {
        int firstIndex =nums.length-1;
        int lastIndex =0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i] > nums[i+1])
            {
                firstIndex = Math.min(firstIndex,i);
                lastIndex = Math.max(lastIndex,i+1);
            }
            if(firstIndex != nums.length-1 && nums[i] == nums[i+1])
            {
                    lastIndex = Math.max(lastIndex,i+1);

            }
        }
        if(firstIndex == nums.length-1 && lastIndex ==0)
        {
            return 0;
        }
        return lastIndex-firstIndex+1;
    }

    public static void main(String args[])
    {
        int[] a = {1,3,2,2,2};
        shortedUnsortedContinues obj  = new shortedUnsortedContinues();
       int result = obj.findUnsortedSubarray(a);
        System.out.println(result);
    }
}
