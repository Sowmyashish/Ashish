package medium;

/**
 * Created by ashishsowmya on 11/11/18.
 */
public class jumpGame {
    public boolean canJump(int A[])
    {
        int max=0;
        for(int i=0;i<A.length;i++)
        {
            if(i >max) return false; //this means you are at the same position and max is not increasing this means there occured 0
            max = Math.max(A[i]+i,max);
        }
return true;
    }


    public static void main(String args[])
    {
        int[] a = {2,3,1,1,4};
        jumpGame obj = new jumpGame();
        boolean result = obj.canJump(a);
        System.out.println(result);
    }
}
