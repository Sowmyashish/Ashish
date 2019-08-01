package walmart;

/**
 * Created by ashishsowmya on 6/21/19.
 */
public class SortBinaryArray
{
    public int[] sort(int[] nums)
    {
        int[] new_array = new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum=0;
            int a = nums[i];
            for(int j =0;j<6;j++)
            {
                //int result= a %10;
                //double power = Math.pow(2,j);

                sum = (int) ((a%10)*(Math.pow(2,j)) + sum);
                 a = a/10;
            }
            new_array[i] = sum;
        }
          return new_array;
    }


    public void sortbinary(int[] nums)
    {
        int j=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
                if(nums[i] == 0)
                {
                    nums[j] = nums[i];
                    j++;
                }
                else
                {
                    count++;
                }
        }

        for(int i = count-1;i<nums.length;i++)
        {
           nums[i] =1;
        }



    }


    public void test(int[] nums)
    {
        int count=0;
        for(int i =0;i<nums.length;i++ )
        {
            if(nums[i] ==0)
            {
                nums[count] = nums[i];
                count++;
            }
        }
        for(int i =count;i< nums.length;i++)
        {
            nums[i] =1;
        }
    }
    public static void main(String args[])
    {
        SortBinaryArray obj = new SortBinaryArray();
  //      int[] nums = {001,1010,110,1001,0101,1111,100101};
//        int[] num = obj.sort(nums);
//        for(int i:num)
//        {
//            System.out.println(i);
//        }

        int[] nums = {0,1,1,1,0,1,1};
        obj.test(nums);
        for(int i:nums)
            System.out.println(i);




    }
}
