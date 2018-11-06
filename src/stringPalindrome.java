/**
 * Created by ashishsowmya on 6/12/18.
 */
public class stringPalindrome {

    public void palindrome(String a)
    {
        String b="";

        for(int i=a.length()-1; i>=0;i--){
             b = b+ a.charAt(i);
        }
        if(a.equalsIgnoreCase(b))
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not a palindrome");
        }
    }


    public String reverse1(String s)
    {
        StringBuilder sb= new StringBuilder();
        for(int i=s.length()-1;i>=0;i--)
        {
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public void reverse(String str)
    {
        String b="";
        for(int i=str.length()-1;i>=0;i--)
        {
            b=b+str.charAt(i);
        }

        System.out.println(b);
    }

    public static void main(String args[])
    {
        stringPalindrome obj = new stringPalindrome();
        String test="Ama";
        obj.palindrome(test);
        obj.reverse(test);

    }
}
