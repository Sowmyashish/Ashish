package general;

/**
 * Created by ashishsowmya on 2/23/19.
 */
public class ReversewordsString
{
    public String reverseWords(String s)
    {
        StringBuilder sb = new StringBuilder();
        String[] str = s.trim().split("\\s+");
        for(int i = str.length-1;i>=0;i--)
        {
            sb.append(str[i]);
            sb.append(' ');
        }
         return sb.toString().trim();
    }


    public static void main(String args[])
    {
        ReversewordsString obj = new ReversewordsString();
        String s = "the sky is blue";
        String str = obj.reverseWords(s);
        System.out.println(str);
    }
}
