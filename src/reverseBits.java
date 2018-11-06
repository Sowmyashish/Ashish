/**
 * Created by ashishsowmya on 6/13/18.
 */
public class reverseBits {

//    public int reverse(long nums)
//    {
//
//        long result =0;
//        for (int i=0;i<32;i++)
//        {
//            long remainder = nums % 2;
//            result = 2*result +remainder;
//            nums = nums/2;
//        }
//
//        return (int) result;
//    }


    public int reverse1(long n)
    {
        int result = 0;
        for (int i = 0; i < 31; i++) {
            result <<= 1;
            if ((n & 1) == 1)
                result++;
            n >>= 1;
        }
        return result;


    }

    public static void main(String args[])
    {

        reverseBits obj = new reverseBits();
       // long a=  Long.parseUnsignedLong("2147483648") ;
       long a= Long.parseUnsignedLong("3");
       int  result= obj.reverse1(a);
        System.out.println(result);
    }
}
