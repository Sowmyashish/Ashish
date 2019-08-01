import java.util.HashMap;

/**
 * Created by ashishsowmya on 4/5/18.
 */

import java.util.*;
public class romanToInt {
    int a, result,out;
    public void roman(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            a = s.charAt(i);

            switch (a)
            {
                case '1' : result = 1;
                break;
                case 'V' : result=5;
                break;
                case 'X' : result=10;
                break;
                case 'L' : result=50;
                break;
                case 'C' : result=100;
                break;
                case 'D' : result=500;
                break;
                case 'M' : result=1000;
                break;
            }
            out = out+result;

        }
        System.out.println(out);
    }


    //correct with cases

    public int roman1(String s)
    {


       Map<Character,Integer> map = new HashMap<>();
       map.put('I',1);
       map.put('V',5);
       map.put('X',10);
       map.put('L',50);
       map.put('C',100);
       map.put('D',500);
       map.put('M',1000);

        char[] ch = s.toCharArray();
        int sum = 0;
        int lastVal = 0;
        for (Character c : ch) {
            int value = map.get(c);
            if (value > lastVal){
                sum = sum - 2 * lastVal + value;
            }else{
                sum += value;
            }
            lastVal = value;
        }
        return sum;
    }

    public static void main(String args[])
    {
        romanToInt obj = new romanToInt();
      int result=  obj.roman1("MCMXCIV");
        System.out.println(result);
    }
}
