package walmart;

/**
 * Created by ashishsowmya on 6/20/19.
 */
public class Integerpalindrome
{
    public boolean palindrome(int number)
    {
        int temp = number;
        int sum =0;
        while(number > 0)
        {
            int remainder = number%10;
            sum = sum*10 + remainder;
            number = number/10;

        }
        if(sum != temp)
            return false;
        return true;
    }


    public static void main(String [] args)
    {
        Integerpalindrome obj = new Integerpalindrome();
        boolean result = obj.palindrome(128921);
        System.out.println(result);
    }
}
