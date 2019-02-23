package general;

import java.util.Comparator;
import java.util.HashMap;
import java.util.*;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.List;

/**
 * Created by ashishsowmya on 2/10/19.
 */
public class sortCharactersbyFrequency
{
    public String frequencySort(String s)
    {
        char[] ch = s.toCharArray();
        HashMap<Character,Integer>  map = new HashMap<>();

        for(int i=0;i<ch.length;i++)
        {
            if(!map.containsKey(ch[i]))
            {
                map.put(ch[i],1);
            }
            else
            {
               // int count = map.get(ch[i]);
                map.put(ch[i],map.get(ch[i])+1);
            }
        }

PriorityQueue<Map.Entry<Character,Integer>> pq = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());
        pq.addAll(map.entrySet());

        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty())
        {
            Map.Entry a= pq.poll();
            String d = a.getKey().toString();

            //if there are two 'll' then each l need to be printed so for loop
            for(int i=0;i<(int)a.getValue();i++)
            {
                sb.append(a.getKey());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args)
    {
        String str="hello";
        sortCharactersbyFrequency obj = new sortCharactersbyFrequency();
        String str1=  obj.frequencySort(str);
        System.out.println(str1);
    }
}
