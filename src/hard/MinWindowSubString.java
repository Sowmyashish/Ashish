package hard;

import java.util.HashMap;

/**
 * Created by ashishsowmya on 6/3/19.
 */
public class MinWindowSubString {
    public String minWindow(String s, String t) {
        if (s == null || s.length() < t.length() || t.length() == 0) {
            return "";
        }
        HashMap<Character, Integer> map = new HashMap<>();
        for (Character ch : t.toCharArray()) {
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            } else {
                map.put(ch, map.get(ch) + 1);
            }
        }
        int left = 0;
        int minLength = s.length();
        int count = 0;
        int minLeft = 0;
        for (int right = 0; right < s.length(); right++) {
            if (map.containsKey(s.charAt(right)))
            {
                map.put(s.charAt(right), map.get(s.charAt(right)) - 1);
                if (map.get(s.charAt(right)) >= 0)
                {
                    count++;

                }

                while (count == t.length()) {
                    if (right - left + 1 < minLength)
                    {
                        minLeft = left;
                        minLength = right - left + 1;

                    }
                    if (map.containsKey(s.charAt(left)))
                    {
                        map.put(s.charAt(left), map.get(s.charAt(left)) + 1);
                        if (map.get(s.charAt(left)) > 0)
                        {
                            count--;
                        }
                    }
                    left++;
                }
            }
            if (minLength > s.length()) {
                return "";
            }
        }
        return s.substring(minLeft, minLeft + minLength);
    }


    public String minWindow1(String s,String t)
    {

        if(s.length() ==0 || s.length() < t.length() || s == null)
        {
            return "";
        }

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<t.length();i++)
        {
          //  map.put(t.charAt(i),map.getOrDefault(map.get(t.charAt(i))+1,1));
            if (!map.containsKey(t.charAt(i))) {
                map.put(t.charAt(i), 1);
            } else {
                map.put(t.charAt(i), map.get(t.charAt(i)) + 1);
            }
        }

        int left=0;
        int minLength = s.length();
        int minLeft =0;
        int count=0;
        for(int right =0;right < s.length();right++)
        {
            if (map.containsKey(s.charAt(right)))
            {
                map.put(s.charAt(right), map.get(s.charAt(right)) - 1);

                if (map.get(s.charAt(right)) >= 0)
                {
                    count++;
                }

                while (count == t.length())
                {

                    if (right - left + 1 < minLength)
                    {
                        minLeft = left;
                        minLength = right - left + 1;

                    }

                    if (map.containsKey(s.charAt(left)))
                    {
                        map.put(s.charAt(left), map.get(s.charAt(left)) + 1);
                        if (map.get(s.charAt(left)) > 0) {
                            count--;
                       }
                    }
                    left++;
                }
            }
        }
        if(minLength > s.length())
        {
            return "";
        }

        return s.substring(minLeft,minLeft+minLength);

    }


    public String min(String s,String t)
    {
        if(s.length() == 0 || t.length() > s.length())
        {
            return "";
        }
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<t.length();i++)
        {
            map.put(t.charAt(i),map.getOrDefault(map.get(s.charAt(i)),0)+1);
        }

        int count =0;
        int left = 0;
        int minLength = s.length();
        int minLeft =0;
        for(int right=0;right<s.length();right++)
        {
            if(map.containsKey(s.charAt(right)))
            {
                map.put(s.charAt(right),map.get(s.charAt(right))-1);

            }
        }



return "";


    }

    public static void main(String[] args)
    {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        MinWindowSubString obj = new MinWindowSubString();
      String str=  obj.minWindow1(s,t);
        System.out.println(str);
    }
}