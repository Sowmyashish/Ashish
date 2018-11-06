/**
 * Created by ashishsowmya on 5/4/18.
 */
public class Test {

    public static void main(String[] args)
    {

        int a[] = new int[] { 12, 94, 23, 56, 23, 78, 113 };
int count=0;
        int max = a[0];
        int index = 0;

        for (int i = 0; i < a.length; i++)
        {
            if (max < a[i])
            {count++;
                max = a[i];
                index = i;
            }
        }

        System.out.println("Index position of Maximum value in an array is  :  " + index);
        System.out.println(count);
    } }

