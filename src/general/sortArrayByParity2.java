package general;

/**
 * Created by ashishsowmya on 10/19/18.
 */
public class sortArrayByParity2 {

    public int[] sort(int[] a)
    {
        int even=0;
        int odd =1;
        int new_array[] = new int[a.length];

        if(a.length ==0)
        {
            return new_array;
        }

        for(int i=0;i<a.length;i++)
        {
            if( (a[i]&1) == 0)
            {
                new_array[even] = a[i];
                even+=2;
            }
            else
            {
                new_array[odd] = a[i];
                odd+=2;
            }
        }
        return new_array;
    }

    public static void main(String args[])
    {
        sortArrayByParity2 obj = new sortArrayByParity2();
        int[] a={4,2,5,7};
        int[] result = obj.sort(a);
        for(int i=0;i<result.length;i++)
        {
            System.out.println(result[i]);
        }
    }
}
