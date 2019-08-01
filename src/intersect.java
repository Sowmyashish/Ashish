/**
 * Created by ashishsowmya on 7/31/19.
 */
import java.util.*;

public class intersect
{
    public int[] intersect(int[] nums1, int[] nums2)
    {
        List<Integer> li = new LinkedList<Integer>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums1.length;i++)
        {
            if(!map.containsKey(nums1[i]))
            {
                map.put(nums1[i],1);
            }
            else
            {
                map.put(nums1[i],map.get(nums1[i])+1);
            }
        }

        for(int i=0;i<nums2.length;i++)
        {
            if(map.containsKey(nums2[i]))
            {
                li.add(nums2[i]);
                int index = map.get(nums2[i])-1;
                if(index ==0)
                {
                    map.remove(nums2[i]);
                }

            }
        }
        int[] new_array = new int[li.size()];
        for(int i=0;i<li.size();i++)
        {
            new_array[i] =li.get(i);
        }
        return new_array;
    }

    public static void main(String[] args)
    {
        int[] a = {4,9,5};
        int[] b = {9,4,9,8,4};
        intersect obj = new intersect();
        int[] new_array = obj.intersect(a,b);
    }

}
