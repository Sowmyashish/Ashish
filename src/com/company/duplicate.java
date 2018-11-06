package com.company;
import java.util.*;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * Created by ashishsowmya on 5/1/18.
 */
public class duplicate {

    boolean flag = false;
    public boolean removeDuplicate(Integer a[])
    {
        HashSet<Integer> set = new HashSet<Integer>();

        if(a.length == 0)
        {
            flag = false;

        }
        for(int i=0;i<a.length;i++)
        {
                if(set.contains(a[i]))
                {
                     flag = true;
                }
                else
                {
                    set.add(a[i]);
                }
        }
        return flag;
    }


    //2nd method
    //sort the array, if a[i] == a[i+1] , it contains duplicate and returns true
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);
        for(int ind = 1; ind < nums.length; ind++) {
            if(nums[ind] == nums[ind - 1]) {
                return true;
            }
        }
        return false;
    }


    //marks the value in index as negative, if there are same value, the same index is marked negative twice and
    //hence turns positive,


    public static void main(String args[])
    {
        Integer a[] = {0,1,2,2};
        duplicate obj = new duplicate();
       boolean flag= obj.removeDuplicate(a);
        System.out.println(flag);
    }
}
