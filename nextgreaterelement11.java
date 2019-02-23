package general;

import java.util.HashMap;

/**
 * Created by ashishsowmya on 2/7/19.
 */
public class nextgreaterelement11 {
    public int[] nextGreaterElements(int[] nums)
    {

       int count =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],-1);
        }

        for(int i=0;i<=nums.length-2;i++)
        {

            for(int j=i+1;j<=nums.length-1;j++)
            {
                boolean found = false;
                if(nums[i] < nums[j])
                {

                        map.put(nums[i],nums[j]);
                        found = true;
                        break;
                }

                if( j == nums.length-1 && found == false)
                {
                    if( i !=j)
                    {
                        j=-1;
                        count++;
                    }


                    if(count==2)

                        break;
                }
            }


        }

        for(int i=0;i<nums.length;i++)
        {
            nums[i] = map.get(nums[i]);
        }
        return nums;
    }

    public static void main(String args[])
    {
        nextgreaterelement11 obj = new nextgreaterelement11();
        int[] nums = {5,4,3,2,1};
        int[] a = obj.nextGreaterElements(nums);
        for(int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]);
        }

    }
}