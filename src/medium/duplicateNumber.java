package medium;

import com.company.HashTable;

import java.util.HashMap;

/**
 * Created by ashishsowmya on 8/18/18.
 */
public class duplicateNumber {

   HashMap<Integer,Integer> map = new HashMap<>();
   int result;
    public int duplicate(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            if(map.containsKey(a[i]))
            {
                result = a[i];
            }
            else
            {
                map.put(a[i],1);
            }

        }
return result;
    }

    public int duplicate1(int[] nums) {
        if (nums.length > 1) {
            int slow = nums[0];
            int fast = nums[nums[0]];
            while (slow != fast) {
                slow = nums[slow];
                fast = nums[nums[fast]];
            }

            fast = 0;
            while (fast != slow) {
                fast = nums[fast];
                slow = nums[slow];
            }
            return slow;
        }
        return -1;
    }



    public static void main(String args[])
    {
        duplicateNumber obj = new duplicateNumber();
        int a[] = {1,2,3,2,4};
       int result= obj.duplicate1(a);
        System.out.println(result);
    }
}
