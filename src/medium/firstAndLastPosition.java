package medium;

/**
 * Created by ashishsowmya on 10/13/18.
 */
public class firstAndLastPosition {

    public int firstAndLast(int[] nums,int target)
    {
        if(nums.length ==0)
        {

        }
        int start = 0;
        int end = nums.length-1;
       while(start <= end)
       {
           int mid = (start + end)/2;
           if(nums[mid] == target) {

               return mid;
           }
           if(mid > target) {
               end = mid - 1;
           }
           else {
               start = mid + 1;
           }
       }
        return -1;
    }


    public static void main(String args[])
    {
        firstAndLastPosition obj = new firstAndLastPosition();
        int[] a= {1,2,3,4,5,6,7};
        int target=7;
        int index= obj.firstAndLast(a,target);
        System.out.println(target+"is at index "+index);
    }
}
