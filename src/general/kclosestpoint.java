package general;
import java.util.*;

/**
 * Created by ashishsowmya on 6/1/19.
 */
public class kclosestpoint {
    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>((p1, p2) -> p2[0] * p2[0] + p2[1] * p2[1] - p1[0] * p1[0] - p1[1] * p1[1]);
        for (int[] p : points) {
            pq.offer(p);
            if (pq.size() > K) {
            int resu[]=    pq.poll();
            }
        }
        int[][] res = new int[K][2];
        while (K > 0) {
            res[--K] = pq.poll();
        }
        return res;
    }

public static void main(String[] args)
{
    kclosestpoint obj = new kclosestpoint();
    int[][] array ={
            {1,3},
            {-1,2}
    };

    int[][] result = obj.kClosest(array,1);


}
}
