package medium;

import java.util.Arrays;

/**
 * Created by ashishsowmya on 2/25/19.
 */
public class wigglesort
{
    public void wiggleSort(int[] nums)
    {
        int[] new_Array = new int[nums.length];
        Arrays.sort(new_Array);
        //we have to do the modification in the nums itself as it is not returning any aray
        //so create a duplicate array with same content
        for(int i=0;i<nums.length;i++)
        {
            new_Array[i] = nums[i];
        }
        int index =1;

        //place all the higher numbers at indexes 1,3,5,7,....
        //and least numbers at indexes 0,2,4,6,8....
        for(int i = nums.length-1;i > (nums.length-1)/2;i--)
        {
               nums[index] = new_Array[i];
               index = index+2;
               //last number(highest number) is placed at index 1 and next highest(i--) is placed at index 3
        }

        //place now even indices with small numbers from index 0
        index =0;
        for(int i = (nums.length-1)/2;i>=0;i--)
        {
            nums[index] = new_Array[i];
            index +=2;
        }

    }


    public void wiggleSort2(int[] nums)
    {
        int[] copy = new int[nums.length];
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++) copy[i] = nums[i];
        int index = 1;
        for(int i = nums.length - 1; i > (nums.length - 1) / 2; i--){
            nums[index] = copy[i];
            index += 2;
        }
        index = 0;
        for(int i = (nums.length - 1) / 2; i >= 0; i--){
            nums[index] = copy[i];
            index += 2;
        }
    }

    public static void main(String args[])
    {
        wigglesort obj = new wigglesort();
        int[] a = {1,5,1,1,6,4};
        obj.wiggleSort2(a);
    }
}

//correct code but error while executing in the leetcode, so check submission from leetcode