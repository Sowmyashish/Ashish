package medium;
import com.sun.org.apache.bcel.internal.generic.SWAP;

import java.util.*;

/**
 * Created by ashishsowmya on 10/4/18.
 */
public class rotateImage {

//find the code in transpose of a matrix in general category


    public void print(int a[][]) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }

    }


    public void rotate(int[][] a) {

        int last_row = a.length - 1;
        for (int i = 0; i < last_row; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (i == last_row || i > last_row) {
                    break;
                } else {
                    int temp = a[i][j];
                    a[i][j] = a[last_row][j];
                    a[last_row][j] = temp;
                }
            }
            last_row--;

        }

//transpose of a matrix
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;

            }
        }

    }


    public static void main(String args[]) {
        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        rotateImage obj = new rotateImage();
        obj.rotate(a);
        obj.print(a);

        //https://www.youtube.com/watch?v=Jtu6dJ0Cb94
    }
}
