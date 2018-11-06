package medium;

/**
 * Created by ashishsowmya on 10/8/18.
 */
public class maxproductsubArray {


    //correct
    public int max(int[] A)
    {
        if (A.length == 0) {
            return 0;
        }

        int maxherepre = A[0];
        int minherepre = A[0];
        int maxsofar = A[0];
        int maxhere, minhere;

        for (int i = 1; i < A.length; i++) {
            maxhere = Math.max(Math.max(maxherepre * A[i], minherepre * A[i]), A[i]);
            minhere = Math.min(Math.min(maxherepre * A[i], minherepre * A[i]), A[i]);
            maxsofar = Math.max(maxhere, maxsofar);
            maxherepre = maxhere;
            minherepre = minhere;
        }
        return maxsofar;
    }


//test
    public int max1(int[] A)
    {

        int premax= A[0];
        int premin = A[0];
        int max_so_far = A[0];

        for(int i=1;i<A.length;i++)
        {
            int k =Math.max( Math.max(premax*A[i],premin*A[i]),A[i]);
            int l = Math.min(Math.min(premax*A[i],premin*A[i]),A[i]);
            max_so_far = Math.max(k,l);
            premax =k;
            premin=l;
        }
        return max_so_far;





    }
    public static void main(String args[])
    {
        int[] array = {-2,0,1,4,-2,-3,6,2};
        maxproductsubArray obj = new maxproductsubArray();
      int result=  obj.max(array);
        System.out.println(result);

    }
}
