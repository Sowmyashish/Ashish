package general;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created by ashishsowmya on 6/27/19.
 */
public class priority
{
    public void test()
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.offer(8);
        pq.offer(5);
        pq.offer(2);
        pq.offer(7);
        pq.offer(6);
        System.out.println(pq.poll());
    }
    public static void main(String[] args)
    {
        priority obj  = new priority();
        obj.test();
    }
}
