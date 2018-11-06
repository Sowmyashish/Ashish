/**
 * Created by ashishsowmya on 9/30/18.
 */
public class powerOfTwo {

    public boolean two(int n)
    {
        boolean flag = false;
        while(n % 2 == 0 && n<Integer.MAX_VALUE)
        {
            n = n/2;
        }
        if( n == 1)
        {
            flag = true;
            return flag;
        }
        return flag;
    }

    public static void main(String args[])
    {
        powerOfTwo obj  = new powerOfTwo();
        boolean result = obj.two(6);
        System.out.println(result);
    }

}
