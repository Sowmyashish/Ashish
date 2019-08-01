package string;
import java.util.*;
/**
 * Created by ashishsowmya on 7/19/19.
 */
public class PermutationInString
{
    public boolean checkInclusion1(String s1, String s2) {
        HashMap<Character, Integer> dict = new HashMap<>();
        for (int i = 0; i < s1.length(); i++)
        {
            int feq = dict.getOrDefault(s1.charAt(i), 0);
            dict.put(s1.charAt(i), feq + 1);
        }

        HashMap<Character, Integer> temp = new HashMap<>();
        int i = 0;
        for (int j = 0; j < s2.length(); j++)
        {
            if (!dict.containsKey(s2.charAt(j)))
            {
                i = j +1;
                temp.clear(); //clear counter
                continue;
            }

            int count = temp.getOrDefault(s2.charAt(j), 0);
            if (count == 0 || count < dict.get(s2.charAt(j)))
            {
                temp.put(s2.charAt(j), count + 1);

                if (j - i +1  == s1.length())
                {
                    return true;
                }
            }
            else
                {
                    while (i < j)
                    {
                        if (s2.charAt(i) == s2.charAt(j))
                        {
                            i++;
                            break;
                        }

                    temp.put(s2.charAt(i), temp.get(s2.charAt(i)) - 1);
                    i++;
                }
            }
        }

        return false;
    }

    public boolean checkInclusion(String s1, String s2)
    {
        HashMap<Character,Integer> dic = new HashMap<>();
        HashMap<Character,Integer> temp = new HashMap<>();

        for(int i=0;i<s1.length();i++)
        {
            dic.put(s1.charAt(i),dic.getOrDefault(s1.charAt(i),0)+1);
        }

        int i=0;
        for(int j=0;j<s2.length();j++)
        {
            if(!dic.containsKey(s2.charAt(j)))
            {
                i = j+1;
                temp.clear();
                continue;
            }
            int count = temp.getOrDefault(s2.charAt(j),0);
            if(count ==0 || count < dic.get(s1.charAt(j)))
            {
                temp.put(s1.charAt(j),count+1);
                if(j-i+1 == s1.length())
                {
                    return true;
                }
            }
            else
            {
                while(i <j)
                {
                    if(s2.charAt(j) == s2.charAt(i))
                    {
                        i++;
                        break;
                    }
                    temp.put(s2.charAt(i),temp.get(s2.charAt(i))-1);
                    i++;
                }

            }
        }

       return false;
    }

        public static void main(String[] args)
        {
            String s1 = "adc";
            String s2 ="addca";
            PermutationInString obj = new PermutationInString();
            boolean result = obj.checkInclusion1(s1,s2);
            System.out.println(result);
        }
}
