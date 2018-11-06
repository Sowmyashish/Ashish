/**
 * Created by ashishsowmya on 5/1/18.
 */
public class divideconquerlargest {

    int count=0;
    public int largestElement(int a[],int l,int r)
    {


        if(l == r)
        {
            count++;
            return l;
        }

        else
        {
            int middle = (l+r)/2;
            int left = largestElement(a,l,middle);
            int right = largestElement(a,middle+1,r);
//            if(a[left] > a[right])
//            {
//                return left;
//            }
//            else
//            {
//                return right;
//            }
            return  a[left]>a[right]?left:right;

        }
    }

    public static void main(String args[])
    {
        divideconquerlargest obj = new divideconquerlargest();
        int[] a = {17,3,8,9,13};
       int result=  obj.largestElement(a,0,4);
        System.out.println(result);
        System.out.println(obj.count);
    }
}
