import java.util.Arrays;

/**
 * Created by ashishsowmya on 4/21/18.
 */
public class anagrampattern {

    int j;
    int i;
    public void stringpattern(int A[], int B[])
    {
        int textLength = A.length-1;
        int patternLength = B.length;
        for( i=0;i<=(textLength-patternLength);i++)
        {
            j=0;
            while(j<patternLength && B[j] == A[i+j])
            {
                j = j+1;
            }

        }
        System.out.println(i);
    }


    public boolean anagram(String a,String b)
    {
        boolean result = false;

        if(a.length() != b.length())
        {
            result = false;
        }
        else {
            char[] t = a.toCharArray();
            char[] p = b.toCharArray();

            Arrays.sort(t);
            Arrays.sort(p);

            return Arrays.equals(t,p);


        }


        return result;
    }


//new
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())
        {
            return false;
        }

        int array[] = new int[26];
        for(int i=0;i<s.length();i++)
        {
                array[s.charAt(i) -'a'] = array[s.charAt(i)-'a']+1; //put the value 1 at a particular position, when the same positin is encoutered
                                                                     // by it, 1 is decremnted to 0, and hence if all the values in array are 0 then return true
                array[t.charAt(i)-'a'] = array[t.charAt(i)-'a']-1;
        }
        for(int count:array)
        {
            if(count!=0)
                return false;
        }

return true;


    }
    public static void main(String args[])
    {
        anagrampattern obj = new anagrampattern();

        int[] A={1,3,2,3,4,2,5,6};
        int[] B={4,2,5,6};
     //   obj.stringpattern(A,B);
        String c = "abc";
        String d ="cba";
       // boolean result= obj.anagram(c,d);
        boolean result = obj.isAnagram(c,d);
        System.out.println(result);

    }
}
