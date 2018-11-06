package general;
import java.util.*;

/**
 * Created by ashishsowmya on 10/19/18.
 */
public class allDuplicates {
        public List<Integer> findDuplicates ( int[] nums){
            List<Integer> res = new ArrayList<>();
            for (int i = 0; i < nums.length; ++i) {
                int index = Math.abs(nums[i]) - 1;
                if (nums[index] < 0)
                    res.add(Math.abs(index + 1));
                nums[index] = -nums[index];
            }
            return res;
        }

        public List<Integer> duplicates(int[] nums)
        {
            List<Integer> li = new LinkedList<>();
            for(int i=0;i<nums.length;++i)
            {
                int index = Math.abs(nums[i])-1;
                if(nums[index] <0)
                {
                    li.add(Math.abs(index +1));
                }
                nums[index] = -nums[index];
            }
            return li;
        }


    public static void main(String args[])
    {
        allDuplicates obj = new allDuplicates();
        int a[] = {4,3,2,7,8,2,3,1};
        List<Integer> li=obj.duplicates(a);
        for(int i=0;i<li.size();i++)
        {
            System.out.println(li.get(i));
        }
    }
}
