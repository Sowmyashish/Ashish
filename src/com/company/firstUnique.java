package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.*;
/**
 * Created by ashishsowmya on 5/1/18.
 */
public class firstUnique {

    public int unique(int a[])
    {
        int i=0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for( i =0;i<a.length;i++)
        {
            if(map.containsKey(a[i]))
            {
                return i;
            }
            else
            {
                map.put(a[i],i);
            }
        }

        return i;
    }


    //2nd method
    //get the frequency of each character and store at the index, the first index with value 1 is the answer
    public int firstUniqChar(String s) {

        int a[] =new int[26];
        for(int i=0;i<s.length();i++)
        {
            a[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++)
        {
            if(a[s.charAt(i)-'a'] ==1)
                return i;
        }
return -1;
    }

    public int uniqueCharacter(String s)
    {
        char[] word = s.toCharArray();
        Map<Character,Integer> map = new LinkedHashMap<Character,Integer>();
        for(char c: word)
            map.put(c, map.getOrDefault(c, 0)+1);
        for(int i=0;i<word.length;i++)
            if(map.get(word[i])==1)
                return i ;
        return -1;
    }


    public int uniquec(String s)
    {
        char[] chars = s.toCharArray();
        Map<Character,Integer> map1 = new LinkedHashMap<Character,Integer>();
        for(char C1: chars)
        {
            map1.put(C1,map1.getOrDefault(C1,0)+1);

        }
        for(int i=0;i<chars.length;i++)
        {
            if(map1.get(chars[i])==1)
            {
                return i;
            }
        }
        return 0;



    }

    public static void main(String args[])
    {
        firstUnique obj = new firstUnique();
        int a[] ={1,2,2,5,2,7};
    //  int result=  obj.unique(a);
      //  System.out.println(result);

        String S = "leetcode";
      int result1 = obj.uniqueCharacter(S);
        System.out.println(result1);


    }
}
