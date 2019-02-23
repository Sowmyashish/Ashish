package medium;
import  java.util.*;

/**
 * Created by ashishsowmya on 11/11/18.
 */
public class missingRanges
{
    public List<String> findMissingRanges(int[] nums, int start, int range)
    {
        List<String> li = new LinkedList<>();
        if(nums.length ==0) return li;
        start =0;
        int end = start +1;
        int max = nums[nums.length-1];

        int check = nums[0];
        if(start != nums[0])
        {
            if(start+1 == check) li.add(start+"");
            else
            li.add(start + "->"+ (check-1));
        }
        while(nums[start] < max)
        {
            if(nums[start] +1 == nums[end])
            {
                start++;
                end++;
            }
            else
            {
                int missingFrom = nums[start] +1;
                int missingTo = nums[end]-1;
                if(missingFrom == missingTo)
                {
                    li.add(missingFrom+"");
                    start++;
                    end++;
                }

                else
                {
                    li.add(missingFrom + "->" + missingTo);
                    start++;
                    end++;
                }

            }
        }
        if(start == nums.length-1 && max != range)
        {
            if(max+1 == range) li.add(max+1+"");
            else
            li.add(max+1 +"->"+ range);

        }
        return li;

    }

    public static void main(String args[])
    {
        missingRanges obj = new missingRanges();
        int[] nums = {1,3,5,8};
        List<String> str= new LinkedList<>();
        str = obj.findMissingRanges(nums,0,199);
        for(int i=0;i<str.size();i++)
        {
            System.out.println(str.get(i));
        }

    }
}

