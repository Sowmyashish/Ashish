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




    public static void main(String args[])
    {
        houseRobber obj = new houseRobber();
        int[] a ={1,8,2,6,4,5};
       obj.robbery1(a);
       // System.out.println(res);

    }
}
