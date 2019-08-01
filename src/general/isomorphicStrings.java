package general;

import java.text.StringCharacterIterator;
import java.util.HashMap;

/**
 * Created by ashishsowmya on 2/27/19.
 */
public class isomorphicStrings
{
    public boolean isIsomorphic(String s,String t)
    {
        if(s.length() != t.length()) return false;
        int[] a = new int[256];

        for(int i=0;i<s.length();i++)
        {
            int index = t.charAt(i);
            if(a[index] == 0)
            {
                if(s.charAt(i) == 0)
                a[index] = s.charAt(i);
            }
            else if(a[index] != 0 && a[index] != s.charAt(i))
            {
                return false;
            }
        }
        return true;
    }

    public boolean isIsomorphic1(String s,String t)
    {
        char[] firstArray = new char[256];
        char[] secondArray = new char[256];
        for(int i=0;i<s.length();i++)
        {
            int firstIndex = s.charAt(i)-'a';
            int secondIndex = t.charAt(i)-'a';
           if(firstArray[firstIndex] == ' ')
           {
               firstArray[firstIndex] = t.charAt(i);
               if(secondArray[secondIndex] ==' ')
               {
                   secondArray[secondIndex] = s.charAt(i);
               }
               else if(secondArray[secondIndex] !=0 && secondArray[secondIndex] != s.charAt(i))
               {
                   return false;
               }
           }
           else if(firstArray[firstIndex] != ' ' && firstArray[firstIndex] != t.charAt(i))
               return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        isomorphicStrings obj = new isomorphicStrings();
        String S = "aa";
        String T = "ab";
       Boolean result= obj.isIsomorphic1(S,T);
        System.out.println(result);
    }

}
