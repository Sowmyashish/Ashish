import java.sql.Struct;
import java.util.*;

/**
 * Created by ashishsowmya on 4/2/18.
 */
public class twoNumbers {
    public int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
             //   j = Math.max(j,map.get(s.charAt(i))+1);
               j=j+1;
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }
    public static void main(String args[])
    {
        twoNumbers t = new twoNumbers();
       int a= t.lengthOfLongestSubstring("abcedrfabcde");
        System.out.println(a);
    }
}