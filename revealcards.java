package general;
import java.util.*;

/**
 * Created by ashishsowmya on 2/1/19.
 */
public class revealcards {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n= deck.length;
        Arrays.sort(deck);
        Queue<Integer> q= new LinkedList<>();
        for (int i=0; i<n; i++) q.add(i);
        int[] res= new int[n];
        for (int i=0; i<n; i++){
            int a = q.poll();
             int deck1 = deck[i];
            res[a]=deck[i];
            int secondpoll = q.poll();
            q.add(secondpoll);
        }
        return res;
    }

    public static void main(String args[])
    {
        revealcards obj = new revealcards();

        int[] a = {17,13,11,2,3,5,7};
        int[] b = obj.deckRevealedIncreasing(a);
        for(int i=0;i<b.length;i++)
        {
            System.out.print(b[i] + " ");

        }
    }

}
