package hard;

/**
 * Created by ashishsowmya on 11/2/18.
 */
public class missingPositive {

    public int firstMissingPositive(int[] A) {
        int n=A.length;
        if(n==0)
            return 1;
        int k=partition(A)+1;
        int temp=0;
        int first_missing_Index=k;
        for(int i=0;i<k;i++){
            temp=Math.abs(A[i]);
            if(temp<=k)
                A[temp-1]=(A[temp-1]<0)?A[temp-1]:-A[temp-1];
        }
        for(int i=0;i<k;i++){
            if(A[i]>0){
                first_missing_Index=i;
                break;
            }
        }
        return first_missing_Index+1;
    }

    public int partition(int[] A){
        int n=A.length;
        int q=-1;
        for(int i=0;i<n;i++){
            if(A[i]>0){
                q++;
                swap(A,q,i);
            }
        }
        return q;
    }



    public int firstMissing(int[] A)
    {
        if(A.length == 0)return 1;
        int temp=0;
        int range = range(A) +1;
        int missing = range;
        for(int i =0;i<range;i++)
        {
            temp = Math.abs(A[i]);
            if(temp <= range)
            {
                A[temp-1] = (A[temp-1] <0)?A[temp-1]:-A[temp-1];
            }
        }
        for(int j=0;j<range;j++)
        {
            if(A[j] > 0)
            {
                missing = j;
                break;
            }
        }
        return missing+1;
    }

    public int range(int[] A)
    {
        int currentPointer = -1;

        for(int i=0;i<A.length;i++)
        {
            if(A[i] >0)
            {
                 currentPointer++;
                swap(A,currentPointer,i);
            }
        }

        return currentPointer;

    }

    public void swap(int[] A, int i, int j){
        if(i!=j){
            A[i]^=A[j];
            A[j]^=A[i];
            A[i]^=A[j];
        }
    }


    public static void main(String args[])
    {
        missingPositive obj = new missingPositive();
        int[] a = {1,3,2,5,-3,8,-5,-6,6};
        int result = obj.firstMissing(a);
        System.out.println(result);
    }
}
