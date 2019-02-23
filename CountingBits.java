package general;

/**
 * Created by ashishsowmya on 2/2/19.
 */
public class CountingBits
{
    public int[] countBits(int num)
    {

        int[] new_Array = new int[num+1];
         for(int i=0;i<= num;i++)
         {
             int j=i;
             int result=0;
             while(j >0)
             {
                 result = result + (j & 1);
                 j >>>=1;
             }
             new_Array[i] = result;
         }

return new_Array;

    }

    public static void main(String args[])
    {
        CountingBits obj = new CountingBits();
        int[] new_array = obj.countBits(5);
        for(int i=0;i<new_array.length;i++)
        {
            System.out.print(new_array[i] + " " );
        }

    }
}
