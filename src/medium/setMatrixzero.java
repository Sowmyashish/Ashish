package medium;

/**
 * Created by ashishsowmya on 11/11/18.
 */
public class setMatrixzero
{
    public void setZeroes(int[][] matrix)
    {

        int col0 = 1, rows = matrix.length,cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) col0 = 0;
            for (int j = 1; j < cols; j++)
                if (matrix[i][j] == 0)
                    matrix[i][0] = matrix[0][j] = 0;
        }





        for (int i = rows - 1; i >= 0; i--) {
            for (int j = cols - 1; j >= 1; j--)
                if (matrix[i][0] == 0 || matrix[0][j] == 0)
                    matrix[i][j] = 0;
            if (col0 == 0) matrix[i][0] = 0;
        }

    }
  public static void main(String args[])
  {
      int[][] matrix = {
              {0,1,1},
              {1,1,1},
              {1,1,0}

      };
      setMatrixzero obj = new setMatrixzero();
      obj.setZeroes(matrix);
      for(int i=0;i<3;i++)
      {
          for(int j=0;j<3;j++)
          {
              System.out.print(matrix[i][j] +"\t");
          }
          System.out.print("\n");
      }


  }
}
