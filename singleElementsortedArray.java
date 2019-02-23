package general;

/**
 * Created by ashishsowmya on 2/3/19.
 */
public class singleElementsortedArray
{
    public int singleNonDuplicate(int[] nums)
    {
//        int xor = nums[0];
//        for(int i=1;i<nums.length;i++)
//        {
//            xor = xor ^ nums[i];
//        }
//
//          return xor;
        int n=nums.length, lo=0, hi=n/2;
        while (lo < hi) {
            int m = (lo + hi) / 2;
            if (nums[2*m]!=nums[2*m+1]) hi = m;
            else lo = m+1;
        }
        return nums[2*lo];

    }




    public static void main(String args[])
    {
        singleElementsortedArray obj = new singleElementsortedArray();
        int[] a = {1,1,2,2,3};
        int result =obj.singleNonDuplicate(a);
        System.out.println(result);

    }
}
