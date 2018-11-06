package medium;

/**
 * Created by ashishsowmya on 10/12/18.
 */
public class searchA2DMatrix2 {
    public boolean searchMatrix(int[][] matrix, int target) {

       int test= matrix.length;

        if(matrix == null  || matrix.length ==0 || matrix[0].length < 1)
        {
            return false;
        }
        int row =0;
        int column = matrix[0].length-1;

        while(row <= matrix.length-1 && column >= 0)
        {
            if(target == matrix[row][column])
            {
                return true;
            }
            else if(target < matrix[row][column])
            {
                column--;
            }
            else if(target > matrix[row][column])
            {
                row++;
            }
        }
        return false;
    }

    public static void main(String args[])
    {
//        int a[][] = {  {2,3,4},
//                {5,6,7},
//                {8,9,10}
//                     };
        int a[][] = {};

        searchA2DMatrix2 obj = new searchA2DMatrix2();
       boolean result= obj.searchMatrix(a,3);
        System.out.println(result);
    }
}
