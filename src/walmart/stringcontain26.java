package walmart;

import java.util.HashSet;

/**
 * Created by ashishsowmya on 6/20/19.
 */
public class stringcontain26
{

    //indexing
    public boolean check(String str)
    {
       if(str.length() < 25) return false;
       int[] check = new int[26];
       for(int i=0;i<str.length();i++)
       {
           int index = str.charAt(i)-'a';
           check[index] = check[index]+1;
       }

       for(int i:check)
       {
           if( i ==0) return false;
       }
          return true;
    }


    //hashset

    public boolean ischeck(String str)
    {

        HashSet<Character> set = new HashSet<>();
        for(int i= 0; i< str.length();i++)
        {
            if(!set.contains(str.charAt(i)))
                set.add(str.charAt(i));
        }

        if(set.size() <26) return false;
//        for(char i = 'a'; i<= 'z';i++)
//        {
//            if(!set.contains(i))
//                return false;
//        }
        return true;


    }



    public boolean ischeck2(String str)
    {
        if(str.length()<25) return false;

        int[] new_array = new int[26];
        for(int i=0;i<str.length();i++)
        {
           int index = str.charAt(i)-'a';
           new_array[index] = new_array[index]+1;
        }
        for(int count:new_array)
        {
            if(count==0)
                return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        stringcontain26 obj = new stringcontain26();
       boolean result= obj.ischeck("abababcbdbdgdefhdeikjmlniopsqhrbstwfudvxyz");
        System.out.println(result);

    }
}
