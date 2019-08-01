package medium;

import java.util.Arrays;

/**
 * Created by ashishsowmya on 2/24/19.
 */
public class coinChange
{
    public int coinChange1(int[] coins, int amount)
    {
        if(coins.length == 0)
            return 0;
        if(amount <0)
            return -1;

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
        coinChange obj = new coinChange();
        int[] coins = {5,6};
        int amount =11;
        int result= obj.coinChange1(coins,amount);
        System.out.println(result);
    }
}

//https://www.youtube.com/watch?v=jgiZlGzXMBw