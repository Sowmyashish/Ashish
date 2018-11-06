package medium;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by ashishsowmya on 10/8/18.
 */
public class threeSum {

    public void three(int[] nums)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> li = new LinkedList<>();

        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],i);
            }

        }

        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if( i !=j )
                {
                    int k = nums[i] + nums[j];
                    int temp = (-1)*k;
                    if(map.containsKey(temp))
                    {
                        li.add(nums[i]);
                        li.add(nums[j]);
                        li.add(temp);
                    }

                }
            }
        }
    }


    public List<List<Integer>> Threesum(int[] nums)
    {
        List<List<Integer>> list = new LinkedList<>();

        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {

            if( i==0 || (i >0 && nums[i] != nums[i-1]))
            {
                int low = i+1;
                int high = nums.length-1;
                int sum = 0 - nums[i];

                while(low< high)
                {
                    if(nums[low] + nums[high] == sum)
                    {
                        //add the three values tolist
                        list.add(Arrays.asList(nums[i],nums[low],nums[high]));
                        while(low < high && nums[low] == nums[low+1])
                        {
                            low++;
                        }
                        while(low<high && nums[high] == nums[high-1])
                        {
                            high--;
                        }
                        low++;
                        high--;

                    }
                    else if(nums[low] + nums[high] < sum)
                    {
                        low++;
                    }
                    else
                    {
                        high--;
                    }
                }
            }


        }
        return list;

    }

    public static void main(String args[])
    {
        int a[]={-1,0,1,2,-1,-4};
        threeSum obj = new threeSum();
        obj.three(a);
    }
}
