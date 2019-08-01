package LikedQuestions;

/**
 * Created by ashishsowmya on 11/6/18.
 */
public class searchInsertpositin {

    public int searchInsert(int[] nums, int target)
    {
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] == target || nums[i] > target)
                return i;
        }
        return nums.length;

    }
    public static void main(String args[])
    {
        searchInsertpositin obj = new searchInsertpositin();
        int[] a = {1,3,5,6};
        int result = obj.searchInsert(a,5);
        System.out.println(result);

    }
}
