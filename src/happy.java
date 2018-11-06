import java.util.HashSet;

/**
 * Created by ashishsowmya on 5/10/18.
 */
public class happy {

    boolean result =false;
    int square=0;
    int remainder=0;
    public boolean isHappy(int n)
    {
        HashSet<Integer> set = new HashSet<>();

        while (n !=0 && n>0)
        {
            remainder = n % 10;
            square = square + remainder * remainder;
            n = n / 10;


            if( n == 0)
            {
                if(square == 1)
                {
                    return true;
                }
               else if(set.contains(square))

                {
                    result = false;
                    return result;
                }
                else
                {
                    set.add(square);
                    n = square;
                    square =0;
                }

            }


        }

        return result;
    }



    public static void main(String args[])
    {
        happy obj = new happy();
    boolean a=   obj.isHappy(3);
        System.out.println(a);
    }
}
