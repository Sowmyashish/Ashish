package Cisco;
import java.util.*;

/**
 * Created by ashishsowmya on 6/27/19.
 */
public class MaxProductOf3
{
    public int maximumProduct(int[] nums) {
        PriorityQueue<Integer> poheap = new PriorityQueue<>();
        PriorityQueue<Integer> neheap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : nums) {
            poheap.offer(num);
            neheap.offer(num);
            if (poheap.size() > 3) {
                poheap.poll();
            }
            if (neheap.size() > 2) {
                neheap.poll();
            }
        }
        int c1 = 1;
        int max = 0;
        while (!poheap.isEmpty()) {
            max = poheap.poll();
            c1 *= max;
        }
        while (!neheap.isEmpty()) {
            max *= neheap.poll();
        }
        return Math.max(c1, max);
    }


    public static void main(String[] args)
    {
          MaxProductOf3 obj = new MaxProductOf3();
          int[] a = {-1,-2,-3};
         int result= obj.maximumProduct(a);
        System.out.println(result);
    }
}
