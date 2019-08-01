/**
 * Created by ashishsowmya on 4/2/18.
 */
public class moveZero {

    public void zero(int[] A)
    {
        for(int i=0;i<A.length-1;i++)
        {
            if(A[i] == 0)
            {
                int b =A[i];
                int c = A.length-1;
               for(int j=i;j<A.length-1;j++)
               {
                   int a = A.length - 1;
                   A[j] = A[j + 1];
               }

                  A[c] =b;
            }
        }
        for(int i=0;i<A.length;i++)
        {
            System.out.println(A[i]);
        }
    }


    public void pushZeros(int arr[],int n)
    {

        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] != 0)
                arr[count++] = arr[i];
        }
        while(count<n)
        {
           arr[count++] =0;
        }

    }


    public static void main(String args[])
    {
        int A[] = new int[]{0,2,3,4,0,5};
        moveZero mv= new moveZero();
        mv.pushZeros(A,A.length);
        for(int i=0;i<A.length;i++)
        {
            System.out.println(A[i]);
        }
    }

}
