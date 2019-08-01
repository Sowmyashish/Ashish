package string;

/**
 * Created by ashishsowmya on 7/19/19.
 */
public class DecodedStringAtIndex
{
    public String decodeAtIndex(String s,int k)
    {
        int i=0;
        StringBuilder sb  = new StringBuilder();
        String str="";
        while(i<s.length())
        {
            if(!Character.isDigit((s.charAt(i))))
            {
                while(!Character.isDigit(s.charAt(i)) && i < s.length())
                {
                    sb.append(s.charAt(i));
                    if(sb.length() >=k)
                    {
                      return  (String.valueOf(sb.toString().charAt(k-1)));
                    }
                    i++;
                }
            }
            else
            {
                str = sb.toString();
                if(str.length() <k)
                {
                    sb.setLength(0);
                    int digit = s.charAt(i)-'0';
                    for(int j=0;j<digit;j++)
                    {
                        sb.append(str);
                    }
                    i++;
                }
                else
                {
                    return String.valueOf(str.charAt(k - 1));
                }
            }
        }
        String str1 = sb.toString();
         return String.valueOf(str1.charAt(k-1));
    }
    public static void main(String[] args)
    {
        DecodedStringAtIndex obj = new DecodedStringAtIndex();
        String S = "abc";
        int k=1;
        String result =obj.decodeAtIndex(S,k);
        System.out.println(result);
    }

}
