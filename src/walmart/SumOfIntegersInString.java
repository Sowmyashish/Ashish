package walmart;

/**
 * Created by ashishsowmya on 6/30/19.
 */
public class SumOfIntegersInString
{
    public int sum(String str)
    {
        int sum =0;
        int index =0;
        int i=0;
        int j=0;
        while(i<str.length())
            if(!Character.isDigit(str.charAt(i)))
            {
                i++;
            }
            else
            {
                j =i;
                while( i<str.length() &&  Character.isDigit(str.charAt(i)))
                {
                    i++;
                }
                if(i-j >0)
                {
                    index =Integer.valueOf(str.substring(j,i));
                    sum = sum + index;
                }
                else
                {
                    sum = sum + (str.charAt(i)-'0');
                }
            }

        return sum;
    }

    public static void main(String[] args)
    {
        String str = "abc1xy2mno78jh3khl21";
        SumOfIntegersInString obj = new SumOfIntegersInString();
        int index = obj.sum(str);
        System.out.println(index);
    }
}
