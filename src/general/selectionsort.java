package general;

/**
 * Created by ashishsowmya on 3/19/19.
 */
public class selectionsort
{
    public void selection(int[] a)
    {
        for(int i=0;i<a.length;i++)
        {
            int j=i+1;
            while(j < a.length)
            {
                if(a[i] > a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                j++;
            }
        }
    }

    public static void main(String args[])
    {
        selectionsort obj = new selectionsort();
        int[] arr = {5,2,4,6,1,3,8};
        obj.selection(arr);
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
