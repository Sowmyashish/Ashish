package general;

/**
 * Created by ashishsowmya on 10/4/18.
 */
public class sortArraybyParity {

    public int[] sort(int[] A)
    {
        int[] B = new int[A.length];
        int even=0;
        int odd = A.length-1;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]%2 == 0)
            {
                B[even] = A[i];
                even++;
            }
            else
            {
                B[odd] = A[i];
                odd--;
            }
        }
        return B;
    }

    public static void main(String args[])
    {
        sortArraybyParity obj = new sortArraybyParity();
        int[] c = {1,2,4,3,7,5,6};
        int[] D = obj.sort(c);
        for(int i=0;i<D.length;i++)
        {
            System.out.println(D[i]);
        }

    }
}
