package walmart;

/**
 * Created by ashishsowmya on 6/20/19.
 */
public class StringPalindrome
{

    public boolean palindrome(String str)
    {
        if(str.length() == 0 || str.length() == 1) return true;
        int i=0,j=str.length()-1;
        while(i<j)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                return false;
            }
            i++;
            j--;
        }
        return true;

    }

    public void reverseString(char[] ch)
    {
       // String s = s.toString();
        int i=0;
        int j= ch.length-1;

        while(i < j)
        {

        char c = ch[i];
        ch[i] = ch[j];
        ch[j] =c;
         i++;
         j--;

        }
    }


    public static void main(String args[])
    {
        StringPalindrome obj = new StringPalindrome();
        char[] ch = {'a','b','c','d','e','f'};
       obj.reverseString(ch);
        //System.out.println(result);
    }
}
