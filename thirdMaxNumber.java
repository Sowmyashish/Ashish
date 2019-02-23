package general;

/**
 * Created by ashishsowmya on 2/11/19.
 */
public class thirdMaxNumber
{
    public int thirdMax(int[] nums)
    {
        Integer max1= null;
        Integer max2 = null;
        Integer max3 = null;
        for(Integer n: nums)
        {
            if(max1.equals(n) || max2.equals(n) || max3.equals(n))
                continue;
            if(max1 == null || n > max1)
            {
                max3 = max2;
                max2 = max1;
                max1 = n;
            }
           else if(max2 == null || n > max2)
            {
                max3 = max2;
                max2 = n;
            }
            else if(max3 == null || n > max3)
            {
                max3 = n;
            }

        }
        return max3 == null?max1 : max3;

    }
}
