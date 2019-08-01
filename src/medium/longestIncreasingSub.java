package medium;

import java.util.Arrays;

/**
 * Created by ashishsowmya on 2/24/19.
 */
public class longestIncreasingSub
{
    public int lengthOfLIS(int[] nums)
    {
        if(nums.length == 0)
            return 0;
        int[] new_Array = new int[nums.length];
        Arrays.fill(new_Array,1);
        for(int i =1;i<nums.length;i++)
        {
            int j=0;
            while(j < i)
            {
                int count=0;
                if(nums[i] >nums[j])
                {
                    count = new_Array[j]+1;
                    new_Array[i]  = Math.max(new_Array[i],count);
                }
                j++;
            }

        }
        Arrays.sort(new_Array);
        return new_Array[new_Array.length-1];
    }

    public static void main(String args[])
    {
        int[] a = {1,3,6,7,9,4,10,5,6};
        longestIncreasingSub obj = new longestIncreasingSub();
     int result=   obj.lengthOfLIS(a);
        System.out.println(result);

    }

    }
//https://www.youtube.com/watch?v=fV-TF4OvZpk
