package walmart;

/**
 * Created by ashishsowmya on 6/29/19.
 */

//question

    // Find Maximum sum in an array such that no 2 elements are adjacent.
// In this, 1 more condition was also there that first and last
// elements should also not be taken together
public class Robberywithchange
{
    public int robbery(int[] nums)
    {
        int[] new_array = new int[nums.length];
        if(nums.length == 0 || nums == null) return 0;
        if(nums.length == 1) return nums[0];
        if(nums.length ==2)
        {
            return Math.max(nums[0],nums[1]);
        }
        new_array[0] = nums[0];
        new_array[1] = Math.max(nums[0],nums[1]);
        for(int i= 2;i<nums.length;i++)
        {
            new_array[i] = Math.max(nums[i]+new_array[i-2],new_array[i-1]);
        }

//        if(new_array[new_array.length-1] == )
//
    return new_array[new_array.length-1];



    }


    public static void main(String[] args)
    {
        Robberywithchange obj = new Robberywithchange();
        int[] nums = {2,0,0,0,0,10};
       // int result =
    }
}
