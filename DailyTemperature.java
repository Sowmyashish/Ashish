package general;

/**
 * Created by ashishsowmya on 2/2/19.
 */
public class DailyTemperature
{
    public int[] dailyTemperatures(int[] T)
    {
        int[] new_Array = new int[T.length];

      out:  for(int i=0;i<T.length-1 ;i ++)
        {
            int j = i+1;

            while(T[i] >= T[j] && j != T.length)
            {
                j++;
                if(j > T.length-1)
                {
                    new_Array[i]=0;
                    continue out;
                }
            }
            new_Array[i] = j-i;
        }
        return new_Array;
    }


    public static void main(String args[])
    {
        DailyTemperature obj = new DailyTemperature();
        int[] T = {55,38,53,81,61,93,97,32,43,78};
        int[] new_Array = obj.dailyTemperatures(T);
        for(int i=0;i<new_Array.length;i++)
        {
            System.out.print(new_Array[i] + " ");
        }
    }
}
