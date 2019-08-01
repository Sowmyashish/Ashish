package walmart;

/**
 * Created by ashishsowmya on 6/30/19.
 */
public class PowerOfTwo
{
    public boolean power(int n)
    {
        while(n%2 == 0)
        {
            n = n/2;
        }
        return n==1;

    }

    public static void main(String[] args)
    {
        PowerOfTwo obj = new PowerOfTwo();
       boolean result= obj.power(40);
        System.out.println(result);
    }
}
