package general;

/**
 * Created by ashishsowmya on 3/22/19.
 */
public class capstone
{
    public void arrange(int[] nums)
    {
        int j=0;
        for(int i=1;i<nums.length;i++)
        {
            if(nums[j] <0)
            {
                j++;
            }
            if(nums[i] < 0 && nums[j] >=0)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }


    public void shwet(int[] nums)
    {
        int count=0;int temp;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i] <0)
            {
                temp = nums[count];
                nums[count] = nums[i];
                nums[i] = temp;
                count++;
            }
        }
    }


    public void test(int[] nums)
    {
        int j =0; int i = nums.length-1;
        while(j < i)
        {
            if(nums[j] < 0)
            {
                j++;
            }
            if(nums[i] >0)
            {
                i--;
            }
            if(nums[j] >=0 && nums[i] <0 && j <i)
            {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
                i--;
            }
        }
    }
    public static void main(String args[])
    {
        int[] a = {-2,-1,0,3,-3,7,-8,9,-9};
        capstone obj = new capstone();
        obj.test(a);
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i] +" ");
        }
    }
}
