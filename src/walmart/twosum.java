package walmart;
import java.util.*;

import java.util.HashSet;

/**
 * Created by ashishsowmya on 6/21/19.
 */
public class twosum
{
    public int[] sum(int[] nums,int target)
    {
        if(nums.length ==0) return new int[0];

        int[] num = new int[2];
        Set<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++)
        {
            if(!set.contains(target-nums[i]))
            {
                set.add(nums[i]);
            }
            else
            {
                num[0] = nums[i];
                num[1] = target-nums[i];
            }
        }
        return num;
    }



    public int[] twoSum(int[] nums, int target)
    {
        if(nums.length ==0 || nums == null) return new int[]{};
        int[] new_array = new int[2];

        HashMap<Integer,Integer> map= new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(target-nums[i]))
            {
                map.put(nums[i],i);
            }
            else
            {
                new_array[0] = map.get(target-nums[i]);
                new_array[1] = i;
            }
        }
        return new_array;

    }

    public static void main(String args[])
    {
        int[] nums = {23, 12, 27, 15, 18, 7, 9, 10};
        twosum obj = new twosum();
        int[] num=  obj.sum(nums,32);
        for(int i:num)
          System.out.println(i);
    }
}
