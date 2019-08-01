package walmart;
import java.util.*;

/**
 * Created by ashishsowmya on 6/27/19.
 */
public class ThreeSum
{
    public List<List<Integer>> threeSum(int[] nums)
    {
        List<List<Integer>> li= new ArrayList<>();
        Arrays.sort(nums);
      for(int i=0;i<nums.length;i++)
      {
        int j =i+1;
        int k = nums.length-1;
        while(j<k)
        {
            if(nums[i]+nums[j]+nums[k] ==0)
            {
                List<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                list.add(nums[j]);
                list.add(nums[k]);
                if(!li.contains(list))
                {
                    li.add(list);

                }
                j++;
                k--;
            }
            else if(nums[i]+nums[j]+nums[k]>0)
            {
                k--;
            }
            else
            {
                j++;
            }
        }
      }
      return li;
    }

    public static void main(String[] args)
    {
        ThreeSum obj = new ThreeSum();
        int[] a = {-1,0,1,2,-1,-4};
       List<List<Integer>> li=obj.threeSum(a);
        System.out.println(li);

    }
}
