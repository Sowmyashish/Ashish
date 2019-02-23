package general;

/**
 * Created by ashishsowmya on 10/12/18.
 */
public class transposeMatrix {

    public void transpose(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;

            }
        }
    }

    public void rotate_image(int[][] a) {

        int last_row = a.length - 1;
        for (int i = 0; i < last_row; i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                if(i == last_row || i > last_row)
                {
                    break;
                }
                else
                    {
                        int temp = a[i][j];
                        a[i][j] = a[last_row][j];
                        a[last_row][j] = temp;
                    }
            }
            last_row--;

        }



    }

    public static void main(String args[]) {

        transposeMatrix obj = new transposeMatrix();
        int a[][] = {
                {5, 1, 9, 11},
                {2, 4, 8, 10},
                {13, 3, 6,7},
                {15,14,12,16}
        };

        obj.rotate_image(a);
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a.length; j++) {
//                System.out.print(a[i][j]);
//                System.out.print("\t");
//            }
//            System.out.println();
//
//        }
        obj.transpose(a);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.print(a[i][j]);
                System.out.print("\t");
            }
            System.out.println();

        }

    }
}
