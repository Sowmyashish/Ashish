/**
 * Created by ashishsowmya on 10/1/18.
 */
public class factorialTrailingZeros {

    public int zeros(int n)
    {
        int power =5;
        int result =0;
       while( n/power>= 1 && power*5 > power)
       {
           result =  result + (int)(n/power);
           power = power*5;

       }

       return result;
    }

    public static void main(String args[])
    {
        factorialTrailingZeros obj = new factorialTrailingZeros();
       int result= obj.zeros(1808548329);
        System.out.println(result);
    }
}
