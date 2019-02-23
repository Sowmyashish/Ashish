package general;

/**
 * Created by ashishsowmya on 10/4/18.
 */
public class tripletSubsequence {
    public boolean triplet(int[] nums)
    {
    boolean flag=false;
        if(nums.length <3)
        {
            return false;
        }

        for(int i=1;i<nums.length-1;i++)
        {
            if( nums[i-1] < nums[i] && nums[i]<nums[i+1])
            {
                return true;
            }
            else
            {
                flag= false;
            }
        }

       return flag;
    }

    public static void main(String args[])
    {
        tripletSubsequence obj = new tripletSubsequence();
        int[] a = {5,1,5,5,2,5,4};
        boolean result = obj.triplet(a);
        System.out.println(result);
    }
}
