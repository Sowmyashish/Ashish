package medium;
import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.util.*;

/**
 * Created by ashishsowmya on 10/4/18.
 */
public class rotateImage {

//find the code in transpose of a matrix in general category


    public void print(int a[][])
    {
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(a[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }

    }



//    public void rotate(int[][] a)
//    {
//        int current_row=0;
//        int current_colum =0;
//        int top_left = a[current_row][current_colum];
//        int last_column=a[0].length-1;
//        int top_right = a[current_row][last_column];
//        int last_row = a.length-1;
//        int bottom_right = a[last_row][last_column];
//        int bottom_left = a[last_row][current_colum];

//    }


    public static void main(String args[])
    {
        int Matrix_Size=2;
        int a[][] = new int[Matrix_Size][Matrix_Size];
        int count=0;
        int last = Matrix_Size-1;
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                a[i][j] =count++;
            }
        }
        rotateImage obj = new rotateImage();
       // System.out.println(Arrays.deepToString(a));
        System.out.println("Old Matrix");
       obj.print(a);
        System.out.println("New Matrix");
        for(int i=0;i<last;i++)
        {

        }
    }


    //https://www.youtube.com/watch?v=Jtu6dJ0Cb94
}
