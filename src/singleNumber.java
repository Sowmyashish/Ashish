import com.sun.xml.internal.xsom.impl.scd.Iterators;

import java.util.HashMap;
import java.util.*;
import java.io.*;

/**
 * Created by ashishsowmya on 4/2/18.
 */
public class singleNumber {

    public int singleNumber(int[] a) {
        int result =0;
        for(int i=0;i<a.length;i++)
        {
            result = result^a[i];
        }

        return result;

    }

    public int single(int[] a) {
        HashMap<Integer, Integer> map = new HashMap<>();



        for (int i = 0; i < a.length ; i++) {
           int count=0;
            if (map.containsKey(a[i])) {
                int temp=0;
                temp = map.get(a[i]);
                temp = temp + 1;
                map.put(a[i], temp);
            } else {
                count = count + 1;
                map.put(a[i], count);
            }
        }

        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        int d=0;
        int result=0;
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();
            d=entry.getValue();
           if(d ==1)
           {
               result = entry.getKey();

           }
        }
      return result;
    }

        public static void main(String args[])
        {
            int[] a= {2,2,1};
            singleNumber s =new singleNumber();
            int c= s.singleNumber(a);
            System.out.println(c);
//           int e= s.single(a);
//            System.out.println(e);
        }

    }


