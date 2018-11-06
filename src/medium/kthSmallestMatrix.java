package medium;

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

    public static void main(String args[])
    {
        kthSmallestMatrix obj = new kthSmallestMatrix();
        int[][] array ={
                {3,5,7},
                {8,9,10},
                {14,16,19}
        };

      int result=  obj.ksmallest(array,8);
        System.out.println(result);
    }
}
