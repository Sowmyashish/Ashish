/**
 * Created by ashishsowmya on 6/17/18.
 */
public class mergeSortedArrays {

    private void merge(int nums1[],int m,int nums2[], int n ) {

        if (n == 0)
            return;

        int mi = m - 1;
        int ni = n - 1;

        for (int i = (m + n - 1); i >= 0; i--)
        {
            if (mi < 0 || (ni >= 0 && (nums1[mi] < nums2[ni])))
            {
                nums1[i] = nums2[ni];
                ni--;
            }
            else
            {
                nums1[i] = nums1[mi];
                mi--;
            }
        }
    }




    public static void main(String args[])
    {
        int a[] = {2,4,5,6};
        int b[] ={3,7};
        int  m=a.length-1;
        int  n = b.length-1;
        mergeSortedArrays obj = new mergeSortedArrays();
        obj.merge(a,m,b,n);



    }
}
