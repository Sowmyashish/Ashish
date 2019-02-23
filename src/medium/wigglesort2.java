package medium;

import java.util.Arrays;

/**
 * Created by ashishsowmya on 11/10/18.
 */
public class wigglesort2 {

    public void wiggleSort(int[] nums)
    {
        Arrays.sort(nums);
        for(int i=1;i<nums.length-1;i+=2)
        {
            if( i != nums.length)
            {
                int temp = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = temp;
            }

        }

    }


    public static void main(String args[])
    {
        wigglesort2 obj = new wigglesort2();
        int[] nums = {1,5,1,1,6,4};
        obj.wiggleSort(nums);
        for(int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]);
        }
    }
}
