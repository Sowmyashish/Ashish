package general;

/**
 * Created by ashishsowmya on 10/19/18.
 */
public class peakIndexMountain
{
    public int peakIndexInMountainArray(int[] A)
    {
        int result =0;
        if(A.length >= 3 && A.length <= 10000 )
        {
            for(int i=0;i<A.length;i++)
            {
                if(A[i] > A[i+1])
                {
                    result =i;
                    return result;
                }
            }
        }
        return result;
    }

    //using mid

    public int peakIndexInMountainArray1(int[] a) {
        int low = 0;
        int high = a.length - 1;
        int pivotIndex = 0;

        while (low < high) {

            int mid = (low + high) / 2;

            if(a[mid] > a[mid+1] && a[mid] > a[mid-1] )
            {
                return mid;
            }
            else if(a[mid] > a[mid+1])
            {
                high = mid-1;
            }
            else if(a[mid] < a[mid+1])
            {
                low = mid+1;
            }

        }
        return pivotIndex;
    }

    public static void main(String args[])
    {
        peakIndexMountain obj = new peakIndexMountain();
        int[] a = {24,69,100,99,79,78,67,36,26,19};
        int result = obj.peakIndexInMountainArray1(a);
        System.out.println(result);
    }

}
