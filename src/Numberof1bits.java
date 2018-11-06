/**
 * Created by ashishsowmya on 9/29/18.
 */
public class Numberof1bits {

    public int hammingWeight(int n)
    {
        int result=0;
        for(int i=0;i<32;i++)
        {

            //if((n & 1) == 1)
                result = result + (n&1);
            n >>>=1;
        }

        return result;
    }

    public static void main(String args[])
    {
        Numberof1bits obj = new Numberof1bits();
        int result=obj.hammingWeight(20);
        System.out.println(result);

    }
}
