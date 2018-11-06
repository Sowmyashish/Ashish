/**
 * Created by ashishsowmya on 10/14/18.
 */
public class climbingStairs {


    public int climbStairs(int n)
    {
        if( n <= 0)
            return 0;
         if(n == 1)
            return 1;
         if(n==2)
            return 2;


         int result =0;
         int f1 =2;
         int f2=1;
         for(int i=3;i<=n;i++)
         {
             result = f1 + f2;
             f2 = f1;
             f1 = result;

         }
            return result;
    }


    public static void main(String args[])
    {
            climbingStairs obj = new climbingStairs();
            int result = obj.climbStairs(3);
        System.out.println(result);
    }
}
