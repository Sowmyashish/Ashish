package Cisco;

/**
 * Created by ashishsowmya on 6/27/19.
 */
public class PalindromeNumber
{
    public boolean isPalindrome(int x)
    {
        String str= String.valueOf(x);
        for(int i=0,j=str.length()-1;i<j;i++,j--)
        {
            if(str.charAt(i) != str.charAt(j))
                return false;
        }
        return true;
    }
}
