package general;
import java.util.*;
/**
 * Created by ashishsowmya on 10/27/18.
 */
public class binaryNumbersAlteringbits
{
    private boolean binary(int a)
    {
         while(a>0)
         {
             int a1 = a&1;
          int  result = a>>=1;
             int a2 = result &1;
             if(a1 == a2)
             {
                return false;
             }
              a = result;
         }
         return true;
    }


    //alternative method
    public boolean hasAlternatingBits(int n) {
        int start = n & 1;
        while ((n != 0) && (((n >> 1) & 1) != start)) {
            start = (n >> 1) & 1;
            n = n >> 1;
        }

        return n == 0;
    }

    public static void main(String args[])
    {

        binaryNumbersAlteringbits obj = new binaryNumbersAlteringbits();
        int a=11;
        boolean result= obj.binary(a);
        System.out.println(result);
    }

}
