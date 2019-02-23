package medium;

/**
 * Created by ashishsowmya on 11/17/18.
 */
public class increasingTripletSubsequence {

    public boolean increasingTriplet(int[] nums)
    {
        if(nums.length ==0) return false;
        int k = Integer.MAX_VALUE;
        int l = Integer.MAX_VALUE;
        int m = Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] <= k)
                k = nums[i];
            else if(nums[i] <= l)
                l = nums[i];
            else return true;
        }

        return false;
    }
}
