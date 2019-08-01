package walmart;

import java.util.ArrayList;
import java.util.*;

/**
 * Created by ashishsowmya on 6/21/19.
 */
public class FindDuplicateElements
{
    public List<Integer> duplicate(int[] nums)
    {
        List<Integer> li = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int index = Math.abs(nums[i])-1;
            if(nums[index] <0)
                li.add(index +1);
            nums[index] = -1*nums[index];
        }

        return li;
    }

    public static void main(String[] args)
    {
        FindDuplicateElements obj = new FindDuplicateElements();
        int[] nums = {7,6,5,6,2,8,3,3,1};
        List<Integer> li = obj.duplicate(nums);
        li.forEach((i)-> System.out.println(i));
    }
}
