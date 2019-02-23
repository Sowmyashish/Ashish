package general;
import java.util.*;

/**
 * Created by ashishsowmya on 2/1/19.
 */
public class findAndReplace
{
    public  List<String> findAndReplacePattern(String[] words, String pattern)
    {
        List<String> list = new LinkedList<>();
        for(String word: words)
        {
            if(match(word,pattern))
            {
                list.add(word);
            }
        }
        return list;
    }

    public boolean match(String word, String pattern)
    {
        HashMap<Character,Character> wordMap = new HashMap<>();
        HashMap<Character,Character> patternMap = new HashMap<>();
        for(int i=0;i<word.length();++i)
        {
            char w = word.charAt(i);
            char p = pattern.charAt(i);
            if(!wordMap.containsKey(w)) //it is saved as ith character from the word -> ith characer from the patterm
            {
                wordMap.put(w,p);
            }
            if(!patternMap.containsKey(p))
            {
                patternMap.put(p,w);
            }
            if(wordMap.get(w) != p || patternMap.get(p) != w)
                return false;
        }
return true;
    }

    public static void main(String args[])
    {
        String[] words = {"abc","deq","mee","aqq","dkd","ccc"};
        String pattern = "abb";
        findAndReplace obj = new findAndReplace();
      List<String> list=  obj.findAndReplacePattern(words,pattern);
      for(int i=0;i<list.size();i++)
      {
          System.out.println(list.get(i));
      }
    }
}

//https://leetcode.com/problems/find-and-replace-pattern/solution/