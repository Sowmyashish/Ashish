package general;

import java.util.HashMap;

/**
 * Created by ashishsowmya on 7/18/19.
 */
public class RepeatingAndNonRepeating
{
    public char[] repeatingAndNon(String str)
    {
        if(str.length() == 0) return new char[]{};

        int[] new_array = new int[26];
        char[] ch = new char[2];
        for(int i=0;i<str.length();i++)
        {
            int index = str.charAt(i)- 'a';
            new_array[index] = new_array[index]+1;
        }

        //repeating
        for(int i=0;i<str.length();i++)
        {
            if(new_array[str.charAt(i)-'a'] >=2) {
                ch[0] = str.charAt(i);
                break;
            }
        }
        for(int i=0;i<str.length();i++)
        {
            if(new_array[str.charAt(i)-'a'] ==1)
            {
                  ch[1] = str.charAt(i);
                  break;
            }
        }
        return ch;

    }


    //2nd method
    public char[] repeatingnno(String str)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        char[] ch = new char[2];
        for(int i=0;i<str.length();i++)
        {
            if(!map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i),1);
            }
            else
            {
                int index = map.get(str.charAt(i));
                map.put(str.charAt(i),index+1);
            }
        }

        for(int i=0;i<str.length();i++)
        {
            if(map.get(str.charAt(i)) >1)
            {
                ch[0] = str.charAt(i);
                break;
            }

        }

        for(int i=0;i<str.length();i++)
        {
            if(map.get(str.charAt(i)) ==1)
            {
                ch[1] = str.charAt(i);
                break;
            }

        }
        return ch;
    }
public static void main(String[] args)
{
    RepeatingAndNonRepeating obj = new RepeatingAndNonRepeating();
    String str = "JavaConceptOfTheDay".toLowerCase();
   char[] a= obj.repeatingnno(str);
    System.out.println(a);
}


}
