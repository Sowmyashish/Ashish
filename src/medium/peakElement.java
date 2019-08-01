package medium;

/**
 * Created by ashishsowmya on 10/2/18.
 */
public class peakElement
{
    public int index(int[] nums)
    {
       if(nums.length <= 1 || nums[0] > nums[1] || nums == null)
       {
           return 0;
       }
        if (nums[nums.length - 1] > nums[nums.length - 2]) return nums.length - 1;
        int high = nums.length-1;
        int low = 0;
        while(low<high)
        {
            int mid= low + (high - low)/2;
            if(nums[mid] > nums[mid+1] && nums[mid] > nums[mid-1])
            {
                return mid;
            }
            else if(nums[mid] > nums[mid+1])
            {
                high = mid;
            }
            else

            {
                low = mid;
            }
        }
       if(nums[low] > nums[low+1] &&nums[low] > nums[low-1])
       {
           return low;
       }

        return high;
    }
    public static void main(String args[])
    {
        peakElement obj = new peakElement();
        int a[] = {1,2,3};
        int result =obj.index(a);
        System.out.println(result);
    }

}
