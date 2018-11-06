/**
 * Created by ashishsowmya on 9/30/18.
 */
public class powerOfThree {

    public boolean three(int n)
    {
        boolean flag = false;
        if(n > 0 && n< Integer.MAX_VALUE && 1162261467%n ==0)
        {
            flag = true;
            return flag;
        }
        return flag;
    }

    public static void main(String args[])
    {
        powerOfThree obj = new powerOfThree();
       boolean result= obj.three(27);
        System.out.println(result);
    }
}
