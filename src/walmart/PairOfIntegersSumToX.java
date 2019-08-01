package walmart;
import java.util.*;

/**
 * Created by ashishsowmya on 7/18/19.
 */
public class PairOfIntegersSumToX
{
    public int[] twoSum(int[] nums, int target)
    {
        if(nums.length ==0 || nums == null) return new int[]{};
        int[] new_array = new int[2];

        HashSet<Integer> map= new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(!map.contains(target-nums[i]))
            {
                map.add(nums[i]);
            }
            else
            {
                new_array[0] = target-nums[i];
                new_array[1] = nums[i];
            }
        }
        return new_array;

    }

    public static void main(String[] args)
    {

        int[] nums = {2,7,11,15};
        int target = 17;
        PairOfIntegersSumToX obj = new PairOfIntegersSumToX();
        int[] a = obj.twoSum(nums,target);
        for (int i : a) {
            System.out.println(i);
        }
    }
}
