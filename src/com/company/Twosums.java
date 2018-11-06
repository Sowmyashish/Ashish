package com.company;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ashishsowmya on 6/14/17.
 */
public class Twosums {
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i + 1;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i + 1);
        }
        return result;
    }


    public static int[] sum(int[] numbers, int target)
    {
        int[] result = new int[2];
        Map<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<numbers.length;i++)
        {
            if(map.containsKey(target-numbers[i]))
            {
                result[1] = i;
                result[0] = map.get(target-numbers[i]);
            }
            map.put(numbers[i],i);
        }
        return result;
    }


    public static void main(String args[])
    {
        int[] nums = {4,4};
        int target = 8;
        int[] result = sum(nums,target);
        System.out.println("indexes are " +result[0]+" and " + result[1]);

    }


}
