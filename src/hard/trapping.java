package hard;

/**
 * Created by ashishsowmya on 5/11/19.
 */
public class trapping
{
    int count=0;
    int leftMax = 0;
    int rightMax=0;
    int minHeight =0;
    public int rainWater(int[] nums)
    {

        for(int i=1;i<nums.length;i++)
        {
            leftMax =0;
            rightMax =0;
            //find out left and right max height for each element and then find minimum of left and right
            for(int j=i-1;j>=0;j--)
            {
                    leftMax = Math.max(leftMax,nums[j]);


            }
            if(leftMax <= nums[i])
                continue;
            for(int k = i+1;k<=nums.length-1;k++)
            {
                    rightMax = Math.max(rightMax,nums[k]);
            }
            if(rightMax <= nums[i])
                continue;

            minHeight = Math.min(leftMax,rightMax);
            count =count+ ( minHeight-nums[i]);

            if(count ==-1)
                count =0;
        }
        return count;
    }



    public static void main(String args[])
    {
        int[] nums= {4,9,4,5,3,2};
        trapping obj = new trapping();
       int result= obj.rainWater(nums);
        System.out.println(result);


    }
}

//goodtecher