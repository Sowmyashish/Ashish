package medium;

/**
 * Created by ashishsowmya on 10/6/18.
 */
public class setMatrixZeros {


    public void matrix(int[][] matrix)
    {
       for(int i=0;i<matrix.length;i++)
       {
           for(int j=0;j<matrix[i].length;j++)
           {

               if(matrix[i][j] ==0)
               {
                       for(int l=0;l<matrix[i].length;l++)
                       {
                           matrix[i][l] =0;
                       }
                       break;
//                   for(int kk=i+1;kk< matrix[i].length;kk++)
//                   {
//                       matrix[kk][j_temp] =0;
//                   }


                 //  break;
               }
           }
       }

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=0;j<matrix[i].length;j++)
            {
                System.out.print(matrix[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }

    }

    public static void main(String args[])
    {
        int[][] matrix = {
                            {2,0,3},
                            {1,2,3},
                            {3,4,0}

                         };
        setMatrixZeros obj = new setMatrixZeros();
        obj.matrix(matrix);

    }
}
