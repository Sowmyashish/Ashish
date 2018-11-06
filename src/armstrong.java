/**
 * Created by ashishsowmya on 8/23/18.
 */
public class armstrong {

    int result =0;
    public void arm(int a)
    {
        int temp=a;
        while(temp > 0)
        {

            int remainder = temp%10;
            result = result+ remainder*remainder*remainder;
            temp = temp/10;
        }
        if(result == a)
        {
            System.out.println("armstrong");
        }

    }

    public static void main(String args[])
    {
        armstrong obj = new armstrong();
        int a=153;
        obj.arm(a);



    }

}
