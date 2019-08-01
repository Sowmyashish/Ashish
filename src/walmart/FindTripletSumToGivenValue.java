package walmart;

import java.util.Arrays;

/**
 * Created by ashishsowmya on 6/21/19.
 */
public class FindTripletSumToGivenValue
{
    public int[] find(int[] nums,int target)
    {
        int[] new_array = new int[3];
        int length = nums.length-1;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            int j =i+1;
            while(j < length)
            {
                if(nums[i] + nums[j] + nums[length] == target)
                {
                   new_array[0] = nums[i];
                   new_array[1] = nums[j];
                   new_array[2] = nums[length];
                   return new_array;
                }
                else if(nums[i] + nums[j] + nums[length]>target)
                    length--;
                else
                    j++;
            }
        }
         return new_array;
    }

    public int[] find1(int[] nums,int target)
    {
        int[] new_array = new int[3];
        if(nums.length <3) return new int[]{};
        Arrays.sort(nums);
        int last = nums.length-1;
        for(int i=0;i<nums.length;i++)
        {
              int j = i+1;
              while(j < last)
              {
                  if(nums[i] + nums[j] + nums[last] == target)
                  {
                      new_array[0] =nums[i];
                      new_array[1] = nums[j];
                      new_array[2] = nums[last];
                      return new_array;
                  }
                  else if(nums[i] + nums[j] + nums[last] < target)
                  {
                      j++;
                  }
                  else
                  {
                      last--;
                  }
              }

        }
        return new_array;
    }



    public static void main(String[] args)
    {
        int[] nums ={12, 3, 4, 1, 6, 9};
        FindTripletSumToGivenValue obj = new FindTripletSumToGivenValue();
        obj.find1(nums,24);
    }
}
