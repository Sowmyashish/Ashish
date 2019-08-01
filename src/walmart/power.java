package walmart;

/**
 * Created by ashishsowmya on 6/20/19.
 */
public class power
{

    public double myPow(double x, int n)
    {
        if(n==0) return 1;
        if(n == Integer.MIN_VALUE)
        {
            return myPow(x*x,n/2);

        }
        if(n <0)
        {
            x = 1/x;
            n = -n;
        }

        if(n %2 ==0)
            return  myPow(x*x,n/2);
        else
            return myPow(x*x,n/2)*x;

    }

    public static void main(String args[])
    {
        power obj = new power();
        double result= obj.myPow(2,3);
        System.out.println(result);
    }
}
