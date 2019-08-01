package walmart;

import java.util.HashMap;
import java.util.Iterator;
import java.util.*;

/**
 * Created by ashishsowmya on 6/21/19.
 */
public class ComplementOfIntersection
{

    public Object[] complement(int[] a,int[] b)
    {
        Set<Integer> map = new HashSet<>();
        for(int i=0;i<a.length;i++)
        {
            if(!map.contains(a[i]))
            {
                map.add(a[i]);
            }
        }

        for(int i=0;i<b.length;i++)
        {
            if(map.contains(b[i]))
                map.remove(b[i]);
            else
                map.add(b[i]);
        }

        Object[] new_array = new Object[map.size()];
        new_array=map.toArray();

     return new_array;
    }

    public static void main(String args[])
    {
        ComplementOfIntersection obj = new ComplementOfIntersection();
        int[] a = {1,2,3,4,2,3};
        int[] b = {1,8,7,6,2,5};
       Object[] new_array= obj.complement(a,b);
       for(int i=0;i<new_array.length;i++)
       {
           System.out.println(new_array[i]);
       }
    }
}
