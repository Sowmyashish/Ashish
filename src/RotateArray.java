/**
 * Created by ashishsowmya on 5/29/18.
 */
public class RotateArray {
    public void rotate(int[] nums, int k) {

        int objk= k% (nums.length);
        reverse(nums,0,nums.length-1);
        reverse(nums,0,objk-1);
        reverse(nums,objk,nums.length-1);
   for(int i=0;i<nums.length;i++)
   {
       System.out.println(nums[i]);
   }


    }
    public void reverse(int num[],int start,int end)
    {

        while(start<end) {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;

        }
    }

    public static void main(String args[])
    {
        RotateArray obj = new RotateArray();
        int nums[] = {1,2,3,4,5,6,7};
        int k=3;
        obj.rotate(nums,k);

    }
}
