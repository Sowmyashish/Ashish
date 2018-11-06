package hard;

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


    public static void main(String args[])
    {
        int[] a ={2,7,4,5};
        longestConsecutiveSequence obj = new longestConsecutiveSequence();
        int result = obj.consecutive(a);
        System.out.println(a);
    }
}
