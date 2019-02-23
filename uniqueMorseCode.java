package general;

import java.util.HashMap;

/**
 * Created by ashishsowmya on 10/19/18.
 */
public class uniqueMorseCode {

    public String morse(String str)
    {
        HashMap<String,Integer> map = new HashMap<>();
        String[] s= new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
         //a-1,b-2,c-3

        String example="";
        for(int i=0;i<str.length();i++)
        {
           int result= (str.charAt(i) - 'a');
            example = example + s[result];
            //System.out.println(example);
        }

        return example;
    }



    public int morse1(String[] str)
    {
        HashMap<String,Integer> map = new HashMap<>();
        String[] s= new String[]{".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        //a-1,b-2,c-3


        for(String str1: str)
        {
            String example="";
            for(int i=0;i<str1.length();i++)
            {
                int result = (str1.charAt(i)-'a');
                example = example+s[result];
            }
            if(!map.containsKey(example))
            {
                map.put(example,1);
            }
            else
            {
              int count=  map.get(example);
              map.put(example,count+1);
            }

        }

        return map.size();
    }

    public static void main(String args[])
    {
        String[] str = {"gin", "zen", "gig", "msg"};
        uniqueMorseCode obj = new uniqueMorseCode();
      int result=    obj.morse1(str);
        System.out.println(result);

    }
}
