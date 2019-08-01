package walmart;
import java.util.*;

import java.util.HashSet;

/**
 * Created by ashishsowmya on 6/20/19.
 */
public class RemoveDuplicatesString
{

    public String remove(String str)
    {
        Set<Character> set = new HashSet<>();
        for(int i=0;i<str.length();i++)
        {

            if(!set.contains(str.charAt(i)))
            {
                set.add(str.charAt(i));
            }
        }

        StringBuilder sb  = new StringBuilder();
      Iterator<Character> it = set.iterator();
        while(it.hasNext())
        {
            sb.append(it.next());
        }
        return sb.toString();
    }

    public String removeDuplicates(String str)
    {
        StringBuilder sb = new StringBuilder();
        List<Character> li = new LinkedList<>();

        for(int i=0;i<str.length();i++)
        {
            if(!li.contains(str.charAt(i)))
            {
                li.add(str.charAt(i));
            }
        }

        for(char c:li)
        {
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String args[])
    {
        RemoveDuplicatesString obj = new RemoveDuplicatesString();
      String str=  obj.remove("abbeghecddf");
        System.out.println(str);
       String str1 = obj.removeDuplicates("abbeghecddf");
        System.out.println(str1);
    }
}
