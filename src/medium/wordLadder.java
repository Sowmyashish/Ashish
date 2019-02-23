package medium;
import java.util.*;

/**
 * Created by ashishsowmya on 11/9/18.
 */
public class wordLadder {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {


        //correct code in leetcode solution but follow the logic present in the editor.
        Set<String> dict = new HashSet<>(wordList);
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int level = 1;
        while (!queue.isEmpty())
        {
            int size = queue.size();
            for (int q = 0; q < size; q++)
            { //keep on check till the queue is empty


                //here we are converting string present in the queue to character array directly instead of taking
                // queue element and storing it in a string and converting into character array.
                // String str = queue.poll();
                // char[] ch = str.toCharArray();
                //we are doing it in a single step
                char[] cur = queue.poll().toCharArray();

                //now we need to change one element from the character array and check if the new word after changing the
                //single character is present in the dictionary. and alsocheck if it is the last character.
                for (int i = 0; i < cur.length; i++) {

                        char tmp = cur[i];
                        for (char chr = 'a'; chr <= 'z'; chr++) {
                            {
                                cur[i] = chr;
                                String dest = new String(cur);
                                //check if the new word is the last word;
                                if (dict.contains(dest))
                                    if (dest.equals(endWord)) return level + 1;
                                    queue.add(dest);
                                    dict.remove(dest);
                                }
                            }
                            cur[i] = tmp;

                        }
                    }
                    level++;

                }
        return 0;
            }

    public int ladderLength1(String beginWord, String endWord, List<String> wordList) {
        Set<String> dict = new HashSet<>(wordList);
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int level = 1;
        while (!queue.isEmpty()) {
            for (int q=0; q < queue.size(); q++) {
                char[] cur = queue.poll().toCharArray();
                for (int i=0; i < cur.length; i++) {
                    char tmp = cur[i];
                    for (char chr='a'; chr <= 'z'; chr++) {
                        cur[i] = chr;
                        String dest = new String(cur);
                        if (dict.contains(dest)) {
                            if (dest.equals(endWord)) return level+1;
                            queue.add(dest);
                            dict.remove(dest);
                        }
                    }
                    cur[i] = tmp;
                }
            }
            level++;
        }
        return 0;
    }



    public static void main(String args[])
    {
        List<String> li = new LinkedList<>();
        li.add("hot");
        li.add("dot");
        li.add("dog");
        li.add("lot");
        li.add("log");
        li.add("cog");
        wordLadder obj = new wordLadder();
      int result=  obj.ladderLength1("hit","cog",li);
        System.out.println(result);
    }
}
