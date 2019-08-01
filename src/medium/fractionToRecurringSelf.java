package medium;

import java.util.HashMap;

/**
 * Created by ashishsowmya on 10/29/18.
 */
public class fractionToRecurringSelf {

    public String fractionToDecimal(int numerator, int denominator)
    {
        if (numerator == 0)
        {
          return "0";
        }

        StringBuilder sb = new StringBuilder();
        sb.append(((numerator > 0) ^ (denominator > 0)) ? "-" : "");
        long num = Math.abs((long)numerator);
        long den = Math.abs((long)denominator);

        long integratPart = num/den;
        sb.append(integratPart);
        num = num%den;
        if(num ==0)
        {
                return sb.toString();
        }


            sb.append(".");
        HashMap<Long,Integer> map = new HashMap<>();
        map.put(num,sb.length());
        while(num !=0)
        {
            num = num*10;
            sb.append(num/den);
            num = num%den;
            if(map.containsKey(num))
            {
                int index = map.get(num);
                sb.insert(index,"(");
                sb.append(")");
                return sb.toString();
            }
            else
            {
                map.put(num,sb.length());
            }

        }
return sb.toString();
    }


    public static void main(String args[])
    {
        fractionToRecurringSelf obj = new fractionToRecurringSelf();
        int numerator = 2;
        int denominator = 3;
       String result= obj.fractionToDecimal(numerator,denominator);
        System.out.println(result);
    }
}