package medium;

import java.util.HashSet;

/**
 * Created by ashishsowmya on 10/9/18.
 */
public class longestSubstringWithoutRepeatingchar {

    public int substring(String s)
    {
        int maxLength=0;
        int i=0;
        int j=0;
        HashSet<Character> set = new HashSet<>();
        while(j < s.length())
        {
            if(!set.contains(s.charAt(j)))
            {
                set.add(s.charAt(j));
                j++;
                maxLength = Math.max(maxLength,(j-i));

            }
            else
            {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return maxLength;
    }

    public static void main(String args[])
    {
        longestSubstringWithoutRepeatingchar obj = new longestSubstringWithoutRepeatingchar();
        int result = obj.substring("pwwkew");
        System.out.println(result);
    }

}
