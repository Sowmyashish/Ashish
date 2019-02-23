package medium;
import java.util.*;

/**
 * Created by ashishsowmya on 11/15/18.
 */
public class isWordBreak {
    public boolean wordBreak(String s, Set<String> wordDict) {
        int[] pos = new int[s.length()+1];

        Arrays.fill(pos, -1);

        pos[0]=0;

        for(int i=0; i<s.length(); i++){
            if(pos[i]!=-1){
                for(int j=i+1; j<=s.length(); j++){
                    String sub = s.substring(i, j);
                    if(wordDict.contains(sub)){
                        pos[j]=i;
                    }
                }
            }
        }

        return pos[s.length()]!=-1;
    }

    public boolean wordBreak1(String str,Set<String> dic)
    {

        int[] pos = new int[str.length() +1];
        Arrays.fill(pos,-1);
        pos[0] = 0;

        for(int i=0;i<str.length();i++)
        {
            if(pos[i] != -1)
            {
                for(int j=i+1;j<=str.length();j++)
                {
                    String subString = str.substring(i,j);
                    if(dic.contains(subString))
                    {
                        pos[j] = i;
                    }
                }
            }
        }

        return pos[str.length()]!=-1;
    }

    public static void main(String args[])
    {
        isWordBreak obj = new isWordBreak();
        Set<String> set = new LinkedHashSet<>();
        set.add("leet");
      //  set.add("t");
        set.add("code");
        boolean result=    obj.wordBreak1("leetcode",set);
        System.out.println(result);
    }
}

//programcreek
