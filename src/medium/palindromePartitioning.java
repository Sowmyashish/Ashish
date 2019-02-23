package medium;
import java.util.*;

/**
 * Created by ashishsowmya on 11/6/18.
 */
public class palindromePartitioning {
    public void partition(String s)
    {

        //if(s.length() == 0) return new ArrayList<>();
        List<String> innerList = new LinkedList<>();
        List<String> mainList = new LinkedList<>();

        int j = s.length()-1;
        for(int i=0;i<s.length();i++)
        {

            if(s.charAt(i) == s.charAt(j))
            {

                int firstMatch =i;
                j--;
            }
            else
            {
                j = s.length()-1;
                break;

            }
        }

    }

    public static void main(String[] args)
    {
        palindromePartitioning obj = new palindromePartitioning();
        String str = "aaba";
        obj.partition(str);
    }
}
