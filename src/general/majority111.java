package general;
import java.util.*;

/**
 * Created by ashishsowmya on 2/23/19.
 */
public class majority111
{
    public List<Integer> majorityElement(int[] nums)
    {
        int length = (nums.length)/3;
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> li = new LinkedList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i],1);
                if(map.get(nums[i]) > length)
                    li.add(nums[i]);
            }
            else
            {
              map.put(nums[i],map.get(nums[i])+1);
              if(map.get(nums[i])> length)
              {
                  if(!li.contains(nums[i]))
                    li.add(nums[i]);
              }
            }
        }

     return li;


    }

    public static void main(String[] args)
    {
        int[] a = {2,2};
        majority111 obj = new majority111();
        List<Integer> li=obj.majorityElement(a);
        for(int i=0;i<li.size();i++)
            System.out.println(li.get(i));

    }
}
