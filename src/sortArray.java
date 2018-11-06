/**
 * Created by sowmya on 4/9/18.
 */


import java.util.*;
public class sortArray {

    int count =0;
    int v,j;
    public int sort(int A[])
    {
        count =0;
        for(int i=1;i<=A.length-1;i++)
        {
            v=A[i];
            j=i-1;
            while(j>=0 && A[j] >v)
            {
                count=count+1;
                A[j+1]=A[j];
                j=j-1;
                A[j+1]= v;
            }
        }
       // for(int i=0;i<A.length;i++)
        //{
           // System.out.println(A[i]);
        //}
        System.out.println("number of comparisions are");
        return count;
    }



    public int[] randomArray(int size) {

        Random random_number = new Random();
        int random_array[] = new int[size];

        int i = 0;

        while (i < size) {
            boolean duplicate = false;
            int random_Integer = random_number.nextInt(size) + 1;

            for (int j = 0; j < i; j++) {
                if (random_array[j] == random_Integer) {
                    duplicate = true;
                    break;
                }

            }
            if (duplicate) {
                continue;
            } else {
                random_array[i++] = random_Integer;
            }

        }
        return random_array;
    }

    public static void main(String args[])
    {
        int[] A ;
        sortArray obj = new sortArray();

        for(int i=1000;i<=20000;i += 1000)
        {
             A= obj.randomArray(i);
            int result = obj.sort(A);
            System.out.println(result);
        }

    //    System.out.println("Before Array sort");
//        for(int i=0;i<A.length-1;i++)
//        {
//
//           // System.out.println(A[i]);
//        }


    }
}
