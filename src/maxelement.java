/**
 * Created by ashishsowmya on 5/4/18.
 */
public class maxelement {
    public void max(int a[])
    {
        int max=a[0];
        int count=0;
        for(int i=0;i<a.length;i++)
        {

                if(a[i] > max)
                {

                    max = a[i];
                    count++;
                }

            }
        System.out.println(max);
        System.out.println(count);
        }



    public static void main(String args[])
    {
        maxelement obj = new maxelement();
        int a[]={17,3,8,9,10};
        obj.max(a);
    }
}
