package general;

/**
 * Created by ashishsowmya on 5/22/19.
 */
public class Max3rd
{

     public int max(int[] nums)
     {
         int max1 = Integer.MIN_VALUE;
         int max2= Integer.MIN_VALUE;
         int max3= Integer.MIN_VALUE;

         for(int i=0;i<nums.length;i++)
         {
             if(nums[i]>max1)
             {
                 int temp = max1;
                 max1=nums[i];
                // if(max3 !=Integer.MIN_VALUE)
                     max3 = max2;
               //  if(max2 != Integer.MIN_VALUE)
                     max2 = temp;

             }

             else if(nums[i]<max1 && nums[i]>max2){
                 max2 = nums[i];
             }

            else if(nums[i] < max2) {
                 max3 = nums[i];
             }
             else
             {
                 max3 = max2;
                 max2 = nums[i];
             }
         }
         return max3;
     }



    public static void main(String args[])
    {
        Max3rd obj = new Max3rd();
        int[] nums ={1,2,3};
        int result = obj.max(nums);
        System.out.println(result);

    }
}
