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


    //leetcode 34

    public int[] firstandLast(int[] nums,int target)
    {
        int[] result = {-1,-1};
        int low=0;
        int high = nums.length-1;


        while(low < high)
        {
            int mid = (low + high)/2;
            if( target< nums[mid])
            {
                high = mid-1;
            }
            else if(target > nums[mid])
            {
                low = mid+1;
            }
            else if(nums[mid] == target)
            {
                int firstPosition = mid;
              int  lastPosition = mid;

                int first = mid-1;
                int last = mid+1;
                while(nums[first] == target)
                {
                    firstPosition=first;
                    result[0] = firstPosition;
                    first--;

                }
                while(nums[last] == target)
                {
                    lastPosition = last;
                    result[1] = lastPosition;
                    last++;
                }

            }

        }
        return result;

    }


    public int[] find(int[] nums,int target)
    {
        int[] array = new int[2];
         array[0] = firstPosition(nums,target);
         array[1] = lastPosition(nums,target);
        return  array;
    }


    public int firstPosition(int[] nums,int target)
    {

        int low=0;
        int high = nums.length-1;
        int Startindex =-1;
        while(low <= high)
        {
            int mid = (low+high)/2;
            if(target <= nums[mid])
            {
                high = mid-1;
            }
            else //if(target >= nums[mid])
            {
                low = mid+1;
            }
            if(target == nums[mid])
            {
                Startindex = mid;
            }
        }
        return Startindex;
    }

    public int lastPosition(int[] nums,int target)
    {
       int lastIndex = -1;
       int low=0;
       int high = nums.length-1;
       while(low< high)
       {
           int mid = (low+high)/2;
           if(target >= nums[mid])
           {
               low = mid+1;
           }
           else
           {
               high= mid-1;
           }
           if(target == nums[mid])
           {
               lastIndex=mid;
           }
       }
        return lastIndex;

    }
    public static void main(String args[])
    {
        firstAndLastPosition obj = new firstAndLastPosition();
        int[] a= {1};
        int target=1;
        int[] index= obj.find(a,target);
        System.out.println(target+"is at index "+index[0]);
        System.out.println(target+"is at index "+index[1]);
    }
}
