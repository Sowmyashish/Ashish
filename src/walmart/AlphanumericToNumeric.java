package walmart;
import java.util.*;
import java.util.regex.*;
/**
 * Created by ashishsowmya on 6/21/19.
 */
public class AlphanumericToNumeric
{
    public List<Integer> numeric(String str)
    {
        List<Integer> li = new LinkedList<>();
        char[] ch = str.toCharArray();

        for(int i=0;i<ch.length;i++)
        {
            //int result =ch[i]- '0';
            if(Character.isDigit(ch[i]))
            {
               int a = ch[i]-'0';
               li.add(a);
            }

        }
        return li;
    }


    public List<Integer> numeric1(String str)
    {
        List<Integer> li = new LinkedList<>();
        String regex = "[0-9][0-9]*";
        Pattern p = Pattern.compile(regex);
        char[] ch = str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            String s=Character.toString(ch[0]);
            if(s.matches("^\\d+$"))
            {
                li.add(ch[i]-'0');
            }

        }


return li;


    }
    public static void main(String[] args)
    {
        AlphanumericToNumeric obj = new AlphanumericToNumeric();
        String str = "019st2ring3";
       List<Integer> list= obj.numeric1(str);
       list.forEach(i-> System.out.println(i));
    }
}
