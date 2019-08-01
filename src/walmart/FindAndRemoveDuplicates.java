package walmart;
import java.io.FileInputStream;
import java.util.*;

import java.util.HashSet;

/**
 * Created by ashishsowmya on 6/20/19.
 */
public class FindAndRemoveDuplicates
{
    public Object[] remove(int[] nums)
    {
        Set<Integer> set = new HashSet<>();

        for(int i=0;i<nums.length;i++)
        {
            if(!set.contains(nums[i]))
            {
                set.add(nums[i]);
            }
        }

      Object[] array= set.toArray();

        return array;
    }

    public static void main(String[] args)
    {
        FindAndRemoveDuplicates obj = new FindAndRemoveDuplicates();
        int[] nums = {1,4,2,2,3,5,5,6,7,7,7,7,8};
        Object[] i = obj.remove(nums);
        for(int j =0;j<i.length;j++)
        {
            System.out.println(i[j]);
        }
    }
}
