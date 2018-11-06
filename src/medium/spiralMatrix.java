package medium;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ashishsowmya on 10/10/18.
 */
public class spiralMatrix {

    public List<Integer> spiralOrder(int m, int n, int[][] a) {
        int current_row = 0;
        int current_column = 0;
        List<Integer> li = new ArrayList<>();
        if(a.length ==0)
        {
            return li;
        }

        int last_row = a.length - 1;
        int last_column = a[0].length - 1;
        int i;




        while(current_row <= last_row && current_column <= last_column)
        {
        for (i = current_column; i <= last_column; i++) {
          //  System.out.println(a[current_row][i]);
            li.add(a[current_row][i]);
        }
        current_row++;


        for (i = current_row; i <= last_row; i++) {
            //System.out.println(a[i][last_column]);
            li.add(a[i][last_column]);
        }
        last_column--;
        if(current_row <= last_row)
        {
            for(int j=last_column;j>= current_column;j--)
            {
              //  System.out.println(a[last_row][j]);
                 li.add(a[last_row][j]);
            }
            last_row--;
        }
        if(current_column <= last_column)
        {
            for(int k = last_row;k >= current_row;k--)
            {
               // System.out.println(a[k][current_column]);
                li.add(a[k][current_column]);
            }
            current_column++;
        }
    }
return li;
}
        public static void main(String args[])
        {
                    spiralMatrix obj = new spiralMatrix();
                    List<Integer> li = new ArrayList<>();
//                    int[][] a = {
//                                      {2,3,4,5},
//                                    {13,14,15,6},
//                                    {12,17,16,7},
//                                     {11,10,9,8} };
            int[][] a={};
                 li=   obj.spiralOrder(4,4,a);
                 for(int i=0;i<li.size();i++)
                 {
                     System.out.println(li.get(i));
                 }
        }

}
//https://www.youtube.com/watch?v=TmweBVEL0I0&t=1s