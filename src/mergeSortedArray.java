/**
 * Created by ashishsowmya on 10/28/18.
 */
public class mergeSortedArray {
    public void merge(int A[], int m, int B[], int n)
    {

        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while( i >=0 && j >=0)
        {
            A[k--] = A[i] > B[j] ? A[i--]:B[j--];
        }

        while( j >0)
        {
            A[k--] = B[j--];
        }

    }


    public static void main(String args[])
    {
        mergeSortedArray obj = new mergeSortedArray();
        int[] A = {1,2,5,0,0,0};
        int[] B = {2,3,4};
        obj.merge(A,3,B,3);
        for(int i=0;i<A.length;i++)
        {
            System.out.println(A[i]);
        }
    }
}
