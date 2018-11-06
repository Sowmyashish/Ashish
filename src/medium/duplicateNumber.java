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
    public static void main(String args[])
    {
        duplicateNumber obj = new duplicateNumber();
        int a[] = {1,22,4,3,3};
       int result= obj.duplicate(a);
        System.out.println(result);
    }
}
