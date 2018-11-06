/**
 * Created by ashishsowmya on 6/12/18.
 */
public class sqrt {

    public void sqrtNumber(int a)
    {
        double temp;
        double sqrt = a/2;

        if(a == 0)
        {
            System.out.println(a);
        }
        if(a == 1)
        {
            System.out.println(1);
        }
        do{

            temp = sqrt;
            sqrt = (temp + (a/temp))/2;

       }while ((sqrt-temp)!=0 );
        System.out.println( Math.floor(sqrt));
    }

    public static void main(String args[])
    {
        int temporary =8;
        sqrt obj = new sqrt();
        obj.sqrtNumber(temporary);
    }
}
