package general;

/**
 * Created by ashishsowmya on 2/3/19.
 */
public class singleNumber111
{
    public int[] singleNumber(int[] nums) {
    int diff = 0;
        for (int num : nums) {
    diff ^= num;
}
    // Get its last set bit
    diff &= -diff;

    // Pass 2 :
    int[] rets = {0, 0}; // this array stores the two numbers we will return

        for (int num : nums)
        {
            int temp = num;
            int tempdif = diff;

        if ((num & diff) == 0) // the bit is not set
        {
            rets[0] ^= num;
        }
        else // the bit is set
        {
            rets[1] ^= num;
        }
    }
        return rets;
}
public static void main(String args[])
{
    singleNumber111 obj = new singleNumber111();
    int[] a = {1,2,1,3,4,3};
    int[] b= obj.singleNumber(a);
    for(int i=0;i<b.length;i++)
    {
        System.out.println(b[i]);
    }

}

}
