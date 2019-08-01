package medium;

import javax.swing.text.html.HTMLDocument;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * Created by ashishsowmya on 9/27/18.
 */
public class kthSmallestMatrix {

    public int ksmallest(int[][] matrix, int k)
    {

       // PriorityQueue<Integer> p = new PriorityQueue<>();
        int result=0;
        int count =1;
        for(int i=0;i<matrix.length;i++)
        {


            for( int j=0;j<matrix.length;j++)
            {
                result = matrix[i][j];
                if( count == k)
                {
                    return result;
                }
                else
                {
                    count++;
                }

            }
        }
        return result;
    }


    public int kthsmallest(int[][] matrix,int k) {

       PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[0].length;j++)
            {
                pq.add(matrix[i][j]);
            }
        }
        int result=0;
        while(k>0)
        {

           // System.out.print(pq.poll() + " ");
            result = pq.poll();
            k--;

        }
        return result;
    }

    public static void main(String args[])
    {
        kthSmallestMatrix obj = new kthSmallestMatrix();
        int[][] array ={
                {1,5,9},
                {6,11,13},
                {12,13,15}
        };

     int result= obj.kthsmallest(array,8);
        System.out.println(result);

    }
}
