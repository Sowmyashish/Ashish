package medium;
import java.util.*;

/**
 * Created by ashishsowmya on 10/16/18.
 */
public class letterCombinationPhoneNumber {

    public List<String> combination(String digit)
    {
        LinkedList<String> li = new LinkedList<>();
        if(digit.isEmpty())
        {
            return li;
        }
        else
        {
            String[] str = new String[]{"0","1","abc","def","ghi","jkl","mnp","pqrs","tuv","wxyz"};
            li.add("");
            for(int i=0;i<digit.length();i++)
            {
              int x= Character.getNumericValue(digit.charAt(i));
              while(li.peek().length() == i)
              {
                  String remove = li.remove();
                    for(char c:str[x].toCharArray())
                    {
                            li.add(remove+c);
                    }
              }
            }
        }
        return li;
    }

    public static void main(String args[])
    {
        letterCombinationPhoneNumber obj = new letterCombinationPhoneNumber();
        String str= "23";
        List<String> li = obj.combination(str);
        for(int i=0;i<li.size();i++)
        {
            System.out.println(li.get(i));
        }



    }
}
