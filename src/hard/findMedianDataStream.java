package hard;
import java.util.*;

/**
 * Created by ashishsowmya on 2/27/19.
 */
public class findMedianDataStream
{
    PriorityQueue<Integer> minHeap = null;
    PriorityQueue<Integer> maxHeap = null;

    /** initialize your data structure here. */
    public findMedianDataStream() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
    }

    public void addNum(int num) {
        minHeap.offer(num);
        maxHeap.offer(minHeap.poll());

        if(minHeap.size()<maxHeap.size()){
            minHeap.offer(maxHeap.poll());
        }
    }

    public double findMedian() {
        if(minHeap.size() > maxHeap.size()){
            return minHeap.peek();
        }else {
            return (minHeap.peek()+maxHeap.peek())/2.0;
        }
    }


    public static void main(String args[])
    {
        findMedianDataStream obj = new findMedianDataStream();
        obj.addNum(0);
        obj.addNum(1);
        obj.addNum(2);
        obj.addNum(0);
        obj.addNum(3);
        obj.addNum(0);
        //obj.addNum(9);
        double result = obj.findMedian();
        System.out.println(result);

//https://www.programcreek.com/2015/01/leetcode-find-median-from-data-stream-java/
    }
}
