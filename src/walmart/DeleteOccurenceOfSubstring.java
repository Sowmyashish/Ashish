package walmart;

/**
 * Created by ashishsowmya on 6/30/19.
 */
public class DeleteOccurenceOfSubstring
{
    public String occurence(String str,String subString) {
        while (str.length() > 0)
        {
            int index = str.indexOf(subString);
            if (index != -1) {
                str = str.replaceFirst(subString, "");
            }
            else
            {
                break;
            }
        }
        return str;
    }

    public static void main(String[] args)
    {
        String str1 = "abcabbbbcabc";
        String sub = "abc";
        DeleteOccurenceOfSubstring obj = new DeleteOccurenceOfSubstring();
        String result = obj.occurence(str1,sub);
        System.out.println(result);
    }
}
