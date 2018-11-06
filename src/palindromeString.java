/**
 * Created by ashishsowmya on 8/13/18.
 */
public class palindromeString {

    public boolean palindrome(String s)
    {

      //  s.equalsIgnoreCase(" ","");
     //   String t=s.replaceAll("//s", "");
        String t = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        for(int start=0,  end = t.length()-1; start< end;start++, end--)
        {
            if(t.charAt(start) != t.charAt(end))
            {
                return false;
            }
        }
        return true;


    }

    public static void main(String args[])
    {
        String s= "A man, a plan, a canal: Panama";
        palindromeString obj = new palindromeString();
       boolean flag= obj.palindrome(s);
        System.out.println(flag);

    }
}
