/**
 * Created by ashishsowmya on 5/22/19.
 */
public class reverseString
{
    public String reverse(String s)
    {
        char[] word = s.toCharArray();
        int i=0;int j=s.length()-1;

        while(i <j)
        {
            char ch = word[i];
            word[i] =(char) word[j];
            word[j] =ch;
            i++;
            j--;
        }
        return new String(word);
    }

    public static void main(String args[])
    {
        String str = "hello";
        reverseString obj = new reverseString();
        String str1 = obj.reverse(str);
        System.out.println(str1);
    }
}
