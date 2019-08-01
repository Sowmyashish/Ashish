package general;
import java.util.*;
/**
 * Created by ashishsowmya on 4/15/19.
 */
public class countofsmallernumbersafterself
{
    public List<Integer> countSmaller(int[] nums)
    {
        List<Integer> li = new LinkedList<>();
        for(int i = 0;i<nums.length;i++)
        {
            int count=0;
            for(int j = i+1;j<nums.length;j++)
            {
               if(nums[j] < nums[i])
                   count++;
            }
            li.add(count);
        }
        return li;
    }

    public static void main(String args[])
    {
        int[] nums = {5,2,6,1};
        countofsmallernumbersafterself obj = new countofsmallernumbersafterself();
        List<Integer> li=obj.countSmaller(nums);
        for(int i=0;i<li.size();i++)
        {
            System.out.println(li.get(i));
        }
    }
}
