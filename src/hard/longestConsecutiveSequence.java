package hard;

import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by ashishsowmya on 10/10/18.
 */
public class longestConsecutiveSequence {

    public int consecutive(int[] nums)
    {
        int best=0;
        int y=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!set.contains(nums[i]))
            {
                set.add(nums[i]);
            }
        }

        for(int i=0;i<nums.length;i++)
        {
            if( !set.contains(nums[i]-1))
            {
                y= nums[i] +1;
                while(set.contains(y))
                {
                    y=y+1;
                }
                best = Math.max(best,y-i);
            }
        }
return best;
    }


    public int longestConsecutive(int[] nums)
    {
        int maxLength=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                int left = map.containsKey(nums[i]-1)?map.get(nums[i]-1):0;
                int right = map.containsKey(nums[i]+1)?map.get(nums[i]+1):0;
                int sum = left+right+1;
                map.put(nums[i],sum);
                maxLength = Math.max(maxLength,sum);


                int testLeft = nums[i]-left;
                int testRight = nums[i] + right;
                map.put(nums[i] - left, sum);
                map.put(nums[i] + right, sum);
            }
            else
            {
                continue;//for duplicate elements
            }
        }
        return maxLength;
    }

    public static void main(String args[])
    {
        int[] a ={2,4,1,3,6,8,9};
        longestConsecutiveSequence obj = new longestConsecutiveSequence();
        int result = obj.longestConsecutive(a);
        System.out.println(result);
    }
}
