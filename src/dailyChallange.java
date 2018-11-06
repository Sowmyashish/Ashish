import com.sun.deploy.util.ArrayUtil;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

/**
 * Created by ashishsowmya on 10/30/18.
 */
public class dailyChallange {


    public int[] getIndicesOfItemWeights(int[] arr, int limit)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        int a[] = {};

        if(arr.length ==0)
        {
            return a;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(!map.containsKey(arr[i]))
            {
                map.put(arr[i],i);
            }
        }

        for(int i=0;i<arr.length;i++)
        {
            int result = limit-arr[i];
            if(map.containsKey(result))
            {
                a[0] = map.get(result);
                a[1] = i;

                break;
            }

        }
        return a;

    }

    public static void main(String[] args)
    {
            dailyChallange obj = new dailyChallange();
            int[] a= {4,4};
          int[] b=  obj.getIndicesOfItemWeights(a,8);
          for(int i=0;i<b.length;i++)
          {
              System.out.println(b[i]);
          }

    }

}
