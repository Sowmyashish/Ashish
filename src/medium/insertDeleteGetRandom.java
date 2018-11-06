package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

/**
 * Created by ashishsowmya on 10/4/18.
 */
public class insertDeleteGetRandom {

    HashMap<Integer,Integer> map = null;
    ArrayList<Integer> nums= null;

    java.util.Random rand = new java.util.Random();
    public insertDeleteGetRandom()
    {
        map =new HashMap<>();
        nums = new ArrayList<>();


    }

    public boolean insert(int val)
    {
       //no duplicates are allowed. If the value is already present. return false since it is duplicate element
        if(map.containsKey(val))
        {
            return false;
        }
        else
        {
            //stores the value with key as size of the arraylist which will be used while remove operation. Inorder
            //to know at which location the value is removed
            map.put(val,nums.size());
            nums.add(val);
            return true;
        }

    }


    //we have to remove the value from the arraylis, but if the value resides inthe middle of the arraylist, there
    //exist a gap, so inorder to fill that gap we get the index of the eleent which we are going to delete and inser
    //the last element in that index and decrease the arraylist size by 1.the sat element will be removed as it is
    //already copied to another index where the value is removed
    public boolean remove(int val)
    {
        if(!map.containsKey(val))
        {
           return false;
        }
        else
        {
            int index = map.get(val);
            int last_value = nums.get(nums.size()-1);

            if(index < nums.size()-1)
            {
              nums.set(index,last_value);
              map.put(last_value,index);
            }
            map.remove(val);
            nums.remove(nums.size()-1);
            return true;
        }


    }

    public int getRandom()
    {
      return nums.get(rand.nextInt(nums.size()));

    }


    public static void main(String args[])
    {

        insertDeleteGetRandom obj = new insertDeleteGetRandom();
        System.out.println( obj.insert(10));
        System.out.println( obj.insert(20));
        System.out.println( obj.insert(30));
        System.out.println( obj.insert(30));
        System.out.println(obj.remove(20));
        System.out.println(obj.getRandom());
    }
}
