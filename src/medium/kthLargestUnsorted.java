package medium;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Created by ashishsowmya on 8/18/18.
 */
public class kthLargestUnsorted {

    public int largest(int a[],int k)
    {
        Arrays.sort(a);
        int flag = a[a.length-k];

        return flag;
    }

    public static void main(String args[])
    {
        kthLargestUnsorted obj = new kthLargestUnsorted();
        int a[] = {1,5,2,3,9,9,8};
       int result= obj.largest(a,2);
        System.out.println(result);
    }
}
