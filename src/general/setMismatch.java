package general;
import java.util.*;

/**
 * Created by ashishsowmya on 1/24/19.
 */
public class setMismatch {

    public int[] findErrorNums(int[] nums)
    {
        Arrays.sort(nums);
        int duplicate=-1, missing=1;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i] == nums[i-1])
            {
                duplicate = nums[i];



            }
            else if(nums[i] > nums[i-1]+1)
                missing = nums[i-1]+1;
        }
        return new int[] {duplicate, nums[nums.length - 1] != nums.length ? nums.length : missing};


    }

    public static void main(String[] args)
    {
        setMismatch obj = new setMismatch();
        int[] a= {1,1};
      int[] b=  obj.findErrorNums(a);
      for(int i=0;i<b.length;i++)
          System.out.println(b[i]);

    }
}
