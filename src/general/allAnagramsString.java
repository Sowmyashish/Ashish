package general;

import java.util.*;
/**
 * Created by ashishsowmya on 2/25/19.
 */
public class allAnagramsString
{
    public List<Integer> findAnagrams(String s, String p)
    {
        int subLength = p.length();
        List<Integer> li = new LinkedList<Integer>();

        char[] cp = p.toCharArray();
        Arrays.sort(cp);
        for(int i = 0;i<s.length()-subLength+1;i++)
        {
            String subString = s.substring(i,i+subLength);
            char[] ch = subString.toCharArray();
            Arrays.sort(ch);
            String b = new String(ch);
            if(Arrays.equals(cp,ch))
            {
                li.add(i);
            }
        }
        return li;

    }

    public static void main(String args[])
    {
        allAnagramsString obj = new allAnagramsString();
        String s = "cbaebabacd";
        String p ="abc";
       List<Integer> li= obj.findAnagrams(s,p);
       for(int i=0;i<li.size();i++)
       {
           System.out.println(li.get(i));
       }
    }
}
