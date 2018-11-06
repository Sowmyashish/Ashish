package com.company;
import java.util.HashMap;
        import java.util.Map;

/**
 * Created by ashishsowmya on 6/14/17.
 */
public class RomantoInt {
    public static int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int number = 0;
       // char prev = '#';
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            int value = map.get(ch);
            if (value < number)
                    //&& ch != prev)
                {
                number = number - value;
            } else {
                number = number + value;
            }
            //prev = ch;
        }
        return number;

    }
    public static void main(String args[])
    {

        int integer = romanToInt("IX");
        System.out.println("integer"+integer);


    }
}
