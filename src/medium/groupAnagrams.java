package medium;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by ashishsowmya on 10/12/18.
 */
public class groupAnagrams {

    //https://www.youtube.com/watch?v=4rAc8Oo0kpo




    public List<List<String>> anagram(String[] strs)
    {

        HashMap<String,List<String>> map = new HashMap<>();
        if(strs == null || strs.length == 0)
        {
                return new ArrayList<List<String>>();

        }

        for(String str : strs)
        {
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String newString = String.valueOf(c);
            if(map.containsKey(newString))
            {
                   List<String> newList= map.get(newString);
                   newList.add(str);
                   map.put(newString,newList);
            }
            else
            {
                List<String> newList = new ArrayList<>();
                newList.add(str);
                map.put(newString,newList);
            }

        }
        return new ArrayList<List<String>>(map.values());
    }


    public static void main(String args[])
    {
        groupAnagrams obj = new groupAnagrams();
        String[] str = {"ate","tea","eat","at","ta"};
       List<List<String>>  list=  obj.anagram(str);
       for(int i=0;i<list.size();i++)
       {
           System.out.println(list.get(i));
       }
    }
}
