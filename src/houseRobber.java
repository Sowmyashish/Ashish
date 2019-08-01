/**
 * Created by ashishsowmya on 9/30/18.
 */
public class houseRobber {

    public void robbery(int nums[])
    {

        nums[nums.length-3] = nums[nums.length-3] + nums[nums.length-1];
        for(int i=nums.length-4;i>=0;i--)
        {
            nums[i] = nums[i] + Math.max(nums[i+2],nums[i+3]);

        }
    }

    public void robbery1(int nums[])
    {
        nums[2] = nums[2] +nums[0];
        for(int i=3; i < nums.length;i++)
        {
            nums[i] = nums[i] + Math.max(nums[i-2],nums[i-3]);
        }
    }

    public int robbery2(int[] nums,int n)
    {

            int[] new_array = new int[nums.length];
            if(nums.length == 0)
                return 0;
            else if(nums.length == 1)
                return nums[0];
            else if(nums.length ==2)
                return Math.max(nums[0],nums[1]);

            else
            {

                new_array[0] = nums[0];
                new_array[1] = Math.max(nums[0],nums[1]);
                for(int i=2;i<nums.length;i++)
                {
                    new_array[i] = Math.max(nums[i]+new_array[i-2],new_array[i-1]);
                }
            }
            return new_array[nums.length-1];
        }



    public static void main(String args[])
    {
        houseRobber obj = new houseRobber();
        int[] a ={1,8,2,6,4,5};
        obj.robbery2(a,a.length);
       // System.out.println(res);

    }
}
