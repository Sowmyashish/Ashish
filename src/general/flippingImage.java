package general;

/**
 * Created by ashishsowmya on 10/19/18.
 */
public class flippingImage {
    public int[][] flipAndInvertImage(int[][] A) {


        int row_start=0;
        int row_end = A.length-1;

        for(int i=row_start;i<=row_end;i++)
        {
            int col_start =0;
            int col_end = A[0].length-1;
            while(col_start <col_end)
            {
                int temp = A[i][col_start];
                A[i][col_start] = A[i][col_end];
                A[i][col_end] = temp;
                col_start++;
                col_end--;
            }
        }


        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<A.length;j++)
            {
                if(A[i][j] ==0)
                {
                    A[i][j] =1;
                }
                else
                {
                    A[i][j]=0;
                }
            }
        }
        return A;
    }


    public static void main(String args[])
    {
        flippingImage obj = new flippingImage();
        int[][] a= {
                {1,1,0},
                {1,0,1},
                {0,0,0}
                    };


     int b[][]= obj.flipAndInvertImage(a);

     for(int i=0;i<b.length;i++)
     {
         for(int j=0;j<b.length;j++)
        {
            System.out.print(b[i][j]);
            System.out.print("\t");
        }
         System.out.println();
     }
    }
}
