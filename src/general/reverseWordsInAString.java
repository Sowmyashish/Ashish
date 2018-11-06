package general;

/**
 * Created by ashishsowmya on 10/28/18.
 */
public class reverseWordsInAString {

    public String reverseWords(String s)
    {
        StringBuilder sb  =new StringBuilder();
        String finalResult="";
        String[] split = s.split(" ");
        for(String str : split)
        {
            for(int i=str.length()-1;i>=0;i--)
            {
              sb.append(str.charAt(i));
            }
            sb.append(" ");

            finalResult = finalResult+sb.toString();

            sb.setLength(0);
        }

return finalResult.trim();
    }

    public static void main(String args[])
    {
        reverseWordsInAString obj = new reverseWordsInAString();
        String str ="Let's take LeetCode contest";
        String finalResult=obj.reverseWords(str);
        System.out.println(finalResult);
    }
}
