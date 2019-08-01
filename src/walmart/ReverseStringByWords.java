package walmart;



/**
 * Created by ashishsowmya on 6/20/19.
 */
public class ReverseStringByWords
{
    public String reverse(String word)
    {
        String[] str = word.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i =str.length-1;i>=0;i--)
        {
            sb.append(str[i] + " ");
        }
        return sb.toString().trim();

    }



    public static void main(String args[])
    {
        ReverseStringByWords obj = new ReverseStringByWords();
        String str = obj.reverse("Hello Word,");
        System.out.println(str);

    }
}
