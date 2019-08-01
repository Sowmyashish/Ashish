package general;

/**
 * Created by ashishsowmya on 6/24/19.
 */
public class MultiplyStrings
{

    public String test(String str1,String str2)
    {
        int a = multiply(str1);
        int b = multiply(str2);
        int c = a*b;
        return String.valueOf(c);

    }


    public int multiply(String str1)
    {
        int result=0;
        int remainder;
        int num ;
        for(int i=0;i< str1.length();i++)
        {
            num = str1.charAt(i)-'0';

            while(num >0)
            {
                remainder = num%10;
                result =result*10+remainder;
                num = num/10;
            }
        }
            return result;
    }


    public static void main(String[] args)
    {
        MultiplyStrings obj = new MultiplyStrings();
       String result= obj.test("123","456");
        System.out.println(result);
    }
}
