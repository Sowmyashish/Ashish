import java.util.HashSet;

/**
 * Created by ashishsowmya on 9/30/18.
 */
public class removeDuplicatesSortedArray
{
    public int removeDuplicates(int[] nums)
    {
//        int j=0;
//        int count=1;
//        if(nums.length == 0)
//        {
//            return 0;
//        }
//        for(int i=0;i<nums.length-1;i++)
//        {
//            if(nums[i] != nums[i+1])
//            {
//                count = count+1;
//                nums[j] = nums[i];
//                j++;
//            }
//        }
//        nums[j] = nums[nums.length-1];
//        return count;

        int i=0;
        int count =0;
        for(int j=1;j<nums.length;j++)
        {
            if(nums[i] != nums[j])
            {
                i++;
                nums[i] = nums[j];
                count++;
            }
        }

    return count+1;

    }



//    public int remove(int[] nums)
//    {
//        if(nums.length == 0) return 0;
//        int count = 1;
//
//        for(int i = 1; i < nums.length; i++) {
//            if(nums[i] != nums[i - 1])
//                nums[count++] = nums[i];
//        }
//        return count;
//    }
    public static void main(String args[])
    {
        removeDuplicatesSortedArray obj= new removeDuplicatesSortedArray();
        int a[] ={1,1,2,3,3,4};
       int result= obj.removeDuplicates(a);
        System.out.println(result);
    }
}//https://www.youtube.com/watch?v=gf7vdIin0dk

