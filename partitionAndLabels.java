package general;
import java.util.*;

/**
 * Created by ashishsowmya on 2/2/19.
 */
public class partitionAndLabels
{
    public List<Integer> partitionLabels(String S) {
        if(S == null || S.length() == 0){
            return null;
        }
        List<Integer> list = new ArrayList<>();
        int[] map = new int[26];  // record the last index of the each char

        for(int i = 0; i < S.length(); i++){
            map[S.charAt(i)-'a'] = i;
        }
        // record the end index of the current sub string
        int last = 0;
        int start = 0;
        for(int i = 0; i < S.length(); i++){
            last = Math.max(last, map[S.charAt(i)-'a']);
            if(last == i){
                list.add(last - start + 1);
                start = last + 1;
            }
        }
        return list;
    }


    public List<Integer> partition(String s)
    {
        List<Integer> list = new LinkedList<>();
        int[] new_array = new int[26];
        if(s.length()==0 || s == null)
        {
            return null;
        }

        for(int i=0;i<s.length();i++)
        {
            new_array[s.charAt(i)-'a'] =i;
        }


            int start =0;
            int last =0;
        for(int i=0;i<s.length();i++)
        {
            last = Math.max(last,new_array[s.charAt(i)-'a']);
            if(last == i)
            {
                list.add(last-start+1);
                start = last+1;
            }
        }
        return list;
    }

    public static void main(String[] args)
    {
        String str= "ababcbacadefegdehijhklij";
        partitionAndLabels obj = new partitionAndLabels();
       List<Integer> list= obj.partitionLabels(str);
       for(int i=0;i<list.size();i++)
       {
           System.out.println(list.get(i));
       }
    }
}
