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

    public static void main(String args[])
    {
        String str = "aaa";
        uniqueMorseCode obj = new uniqueMorseCode();
      String result=    obj.morse(str);
        System.out.println(result);

    }
}
