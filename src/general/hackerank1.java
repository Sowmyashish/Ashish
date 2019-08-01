package general;
import java.io.CharConversionException;
import java.util.*;

/**
 * Created by ashishsowmya on 3/3/19.
 */
public class hackerank1
{

    public static String betterCompression(String s) {
            Map<Character,Integer> map = new HashMap();
            char ch=' ';
            int sum =0;
            StringBuilder sb = new StringBuilder();
            int i=0;
            while(i < s.length())
            {
                if(!Character.isDigit(s.charAt(i)))
                {
                    ch = s.charAt(i);

                    if( i > s.length())
                    {
                        break;
                    }
                    i++;
                }
                else{
                    while( i <= s.length()-1 && Character.isDigit(s.charAt(i)) )
                    {

                        int sa = Character.getNumericValue(s.charAt(i));
                        sum = sum * 10 + sa;
                        if( i >= s.length())
                        {
                            sum =0;
                            break;
                        }
                        i++;
                    }

                        if(!map.containsKey(ch))
                        {
                            map.put(ch,sum);
                            sum=0;
                        }
                        else
                        {
                            int sa = Character.getNumericValue(s.charAt(i));
                            sum =0;
                            sum = sum*10 + sa;
                            int result = map.get(ch);
                            map.put(ch,map.get(ch)+sum);
                            sum=0;
                            if(i >= s.length()-1)
                            {
                                break;
                            }
                        }


                    }

                }
            TreeMap<Character,Integer> sortedMap = new TreeMap<>();
            sortedMap.putAll(map);

            //convert TreeMap to string
            for(Map.Entry<Character,Integer> entry:sortedMap.entrySet())
            {
                char c= entry.getKey();
                int value = entry.getValue();
                sb.append(c+" " +value);
            }
            return sb.toString();
        }



    public static void main(String args[])
    {
        String str = "a3c9b2c1d2";
       String s= betterCompression(str);
        System.out.println(s);

    }

}
