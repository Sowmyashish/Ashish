package general;
import java.util.Arrays;

/**
 * Created by ashishsowmya on 7/18/19.
 */
public class CoinChange {
    public int coinChange(int[] coins, int amount) {
        int[] new_array = new int[amount + 1];
        Arrays.fill(new_array, amount + 1);
        new_array[0] = 0;
        for (int i = 0; i < new_array.length; i++) {
            for (int coin : coins) {
                if (coin <= i) {
                    int index = i - coin;
                    new_array[i] = Math.min(new_array[index] + 1, new_array[i]);
                }
            }
        }

        if (new_array[new_array.length - 1] > amount) return -1;
        else
            return new_array[new_array.length - 1];

    }

    public static void main(String[] args) {
        CoinChange obj = new CoinChange();
        int[] coins = {2};
        int min = obj.coinChange(coins, 3);
        System.out.println(min);
    }
}