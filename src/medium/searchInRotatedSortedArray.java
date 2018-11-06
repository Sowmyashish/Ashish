package medium;

/**
 * Created by ashishsowmya on 10/13/18.
 */
public class searchInRotatedSortedArray {


    public void search(int[] a,int target)
    {
      int low=0;
      int high = a.length-1;
      int pivotIndex =-1;

      while(low<high) {

          int mid = (low + high) / 2;
          if (a[mid] > a[(mid + 1)])
          {
              pivotIndex = mid+1;
              System.out.println(a[pivotIndex]);
              break;
          }
          else if (a[low] > a[mid])
          {  //first part
              high = mid - 1;
          }
          else if(a[mid] > a[high])
          {
              low = mid +1;
          }
      }


          if(target == a[pivotIndex])
          {
              System.out.println(pivotIndex);
          }

          if(target > a[pivotIndex] && target < a[high])
          {
              low = pivotIndex+1; //second half
              high = a.length-1;

          }
          else if(target > a[pivotIndex] && target > a[high])
          {
              high = pivotIndex-1;
              low =0;
          }


          while(low <= high)
          {
              int mid = (low+high)/2;
              if(a[mid] == target) {

                  System.out.println(a[mid] +"at index" +mid);
              }
              if(a[mid] > target) {
                  high = mid - 1;
              }
              else {
                  low = mid + 1;
              }

          }
      }

      public int search1(int[] nums,int target)
      {
          int low=0;
          int high = nums.length-1;
          while(low <= high)
          {
            int mid = (low+high)/2;
            if(nums[mid] == target)
            {
                return mid;
            }

            else if(nums[mid] >= nums[low])
            {
                //this means all the left elements are in increasing order and we now need to check if the element
                //is in left side of mid or right, if it is in left side, then the target is less than mid ad >= low

                if(nums[mid] > target && target >= nums[low])
                {
                    high = mid-1;
                }
                else
                {
                    low = mid+1; // this means target is not at left side and need to check right side of the mid;
                }
            }
            else
            {
                if(nums[mid] <= target && nums[high] >= target)
                {
                    low =mid+1;
                }
                else
                {
                    high = mid-1;
                }
            }
          }
          return -1;
      }



//    int start = 0;
//    int end = nums.length - 1;
//        while (start <= end){
//        int mid = (start + end) / 2;
//        if (nums[mid] == target)
//            return mid;
//
//        if (nums[start] <= nums[mid]){
//            if (target < nums[mid] && target >= nums[start])
//                end = mid - 1;
//            else
//                start = mid + 1;
//        }
//
//        if (nums[mid] <= nums[end]){
//            if (target > nums[mid] && target <= nums[end])
//                start = mid + 1;
//            else
//                end = mid - 1;
//        }
//    }
//        return -1;
//}
//    public static void main(String[] args)
    {
        searchInRotatedSortedArray obj  = new searchInRotatedSortedArray();
        int[] a ={12,14,18,21,22,23,3,6,8,9};
        //pivot at 4.
       int aa= obj.search1(a,23);
        System.out.println(aa);

    }
}
