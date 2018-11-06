import java.util.SplittableRandom;

/**
 * Created by sowmya on 5/17/18.
 */
public class substring {
    public static void stringMatching(String text, String pattern)
    {
       // int comparision=0;
        int textLength = text.length();
       // System.out.println("TextLength"+" :"+textLength);
        int  patternLength = pattern.length();
        for (int i = 0; i <= textLength - patternLength ; i++) {
            int j;
            for (j = 0; j < patternLength; j++) {
              //  comparision = comparision + 1;
                if (text.charAt(i + j) != pattern.charAt(j))
                    break;
                if (j == patternLength)
                    System.out.println("Pattern found at position" + i);
            }
        }
      //  System.out.println("Number of Comparisions are "+comparision);
    }


    public int patternMatching(String haystack, String needle) {
        int textLength = haystack.length();
        int patternLength = needle.length();
        for (int i = 0; i <= (textLength - patternLength); i++) {
            int j = 0;
            while (j < patternLength && needle.charAt(j) == haystack.charAt(i + j)) {
                j = j + 1;
            }
            if (j == patternLength ) {
                return i;
            }


        }
        return -1;
    }

    public static void main(String[] args)
    {
//        String text ="0000";
//        String pattern ="000";
//        stringMatching(text, pattern);
        String text = "hello";
        String pattern ="ll";
        substring obj = new substring();
       int a= obj.patternMatching(text,pattern);
        System.out.println(a);
    }
}
