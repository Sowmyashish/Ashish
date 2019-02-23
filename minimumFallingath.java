package general;
import java.util.*;

/**
 * Created by ashishsowmya on 2/2/19.
 */
public class minimumFallingath {
    public int minFallingPathSum1(int[][] A) {
        for (int i = 1; i < A.length; ++i)
            for (int j = 0; j < A.length; ++j)
                A[i][j] += Math.min(A[i - 1][j], Math.min(A[i - 1][Math.max(0, j - 1)], A[i - 1][Math.min(A.length - 1, j + 1)]));
        return Arrays.stream(A[A.length - 1]).min().getAsInt();
    }

    public int minFallingPathSum(int[][] A)
    {
        for(int i=1;i<A.length;++i)
        {
            for(int j=0;j<A.length;++j)
            {
                A[i][j] = A[i][j] + Math.min(A[i-1][j],Math.min(A[i-1][Math.max(0,j-1)], A[i-1][Math.min(A.length-1,j+1)]));
                //first get the minimum value from [row-1][same column-1] and [row-1][j+1] and then clculate the minimum
                //value of the result and the A[i-1][j]
              //  Math.min(A[i-1][j],      Math.min(A[i-1][Math.max(0,j-1)], A[i-1][Math.min(A.length-1,j+1)]));
                  //  min [ 3         ,         min(         1                             2 )  ]
            }
        }
           return Arrays.stream(A[A.length-1]).min().getAsInt();
    }


    public static void main(String[] args)
    {
        minimumFallingath obj = new minimumFallingath();
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int result = obj.minFallingPathSum(a);
        System.out.println(result);
    }
}


////https://www.youtube.com/watch?v=kCeRKIo_p8w