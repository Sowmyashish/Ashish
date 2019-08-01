package medium;
import java.util.*;

/**
 * Created by ashishsowmya on 3/18/19.
 */
public class perfectsquares
{
    //first find the perfect squares between 2 to given number and perform coin exchange for result

    public int coin(int n)
    {
        List<Integer> li = new LinkedList<>();
            int count=0;

            for(int i =1;i*i <n;i++)
            {
                li.add(i*i);
            }

            int[] arr = new int[li.size()];
            for(int i=0;i<=li.size()-1;i++)
            {
                arr[i] = li.get(i);
            }

            return  coinChange(arr,n);


    }

    public int coinChange(int[] coins, int amount) {
        if(coins.length == 0)
            return 0;

        int[] new_Array = new int[amount+1];
        Arrays.fill(new_Array,amount+1);
        new_Array[0] = 0;
        for(int i=1;i<new_Array.length;i++)
        {
            for(int coin:coins)
            {
                if(coin <= i)
                {
                    int index = i-coin;
                    int new_index= Math.min(new_Array[i],new_Array[index]+1);
                    new_Array[i] = new_index;
                }
            }

        }
        if(new_Array[new_Array.length-1] > amount)
            return -1;
        else
            return new_Array[new_Array.length-1];
    }

    public static void main(String args[])
    {
        perfectsquares obj = new perfectsquares();
        int result= obj.coin(5);
        System.out.println(result);

    }

}
