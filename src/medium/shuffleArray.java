package medium;
import java.util.*;

/**
 * Created by ashishsowmya on 8/17/18.
 */
public class shuffleArray {
    private int nums[];
    Random random;

    public shuffleArray(int[] nums)
    {
        this.nums = nums;
      random = new Random();
    }

     public int[] reset()
     {
         return nums;
     }

     public int[] shuffle()
     {
         int[] a = nums.clone();
         for(int j=0;j<a.length;j++)
         {
             int random1 = random.nextInt(j + 1);
             swap(a,j,random1);
          }

          return a;
     }

     private void swap(int a[],int i,int j)
     {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;

     }


    public static void main(String args[])
    {
        int a[] ={1,2,3,4};
        shuffleArray obj = new shuffleArray(a);
        int b[] =obj.shuffle();
        for(int i=0;i<b.length;i++)
        {
            System.out.println(b[i]);
        }

       int[] c= obj.reset();
        for(int i=0;i<c.length;i++)
        {
            System.out.println(c[i]);
        }

    }
}
