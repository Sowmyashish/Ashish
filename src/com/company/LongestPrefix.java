package com.company;
import  java.util.Arrays;
/**
 * Created by ashishsowmya on 6/15/17.
 */
public class LongestPrefix {
    // public static String longestCommonPrefix(String[] strs) {
       /* if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }
    public static void main(String args[])
    {
        String[] result1 = {"a","ab","abc"};

        String result = longestCommonPrefix(result1);
        System.out.println("result is" +result);
*/
    public static String longestCommonPrefix(String[] strs) {
        if (strs == null) return null;
        if (strs.length == 0) return "";

        Arrays.sort(strs);
        char[] first = strs[0].toCharArray();
        char[] last = strs[strs.length - 1].toCharArray();

        int i = 0, len = Math.min(first.length, last.length);
        while (i < len && first[i] == last[i]) i++;
        return strs[0].substring(0, i);
    }

    public static void main(String args[]) {
        String[] result1 = {"abcd", "abc", "ab"};

        String result = longestCommonPrefix(result1);
        System.out.println("result is" + result);


    }
}

