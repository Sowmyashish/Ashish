package Cisco;

/**
 * Created by ashishsowmya on 6/26/19.
 */
public class CanPlaceFlowers
{
    public boolean canPlaceFlowers(int[] nums, int n)
    {

       int count = 0;
       for(int i=0;i<nums.length && count<n;i++)
       {
           if(nums[i] == 0)
           {
               int prev = (i==0)?0:nums[i-1];
               int next = (i == nums.length-1)?0:nums[i+1];
               if(next ==0 && prev ==0)
               {
                   nums[i] = 1;
                   count++;
               }
           }

       }

return count==n;
    }
    public static void main(String[] args)
    {
        CanPlaceFlowers obj = new CanPlaceFlowers();
        int[] nums = {1,0,0,0,1};
        boolean result = obj.canPlaceFlowers(nums,1);
        System.out.println(result);
    }
}
