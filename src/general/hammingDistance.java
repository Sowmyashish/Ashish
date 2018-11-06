package general;

/**
 * Created by ashishsowmya on 10/4/18.
 */
public class hammingDistance {

    int count=0;
    public int distance(int x,int y)
    {
//        int a = x^y;
//        while(count < 32)
//        {
//          count= count+ (a&1);
//
//            a>>>=1;
//            if(a == 0)
//            {
//                return count;
//            }
//        }
//        return count;

  return  Integer.bitCount(x^y);
    }


    public static void main(String args[])
    {
        int x=1;
        int y=4;
        hammingDistance obj = new hammingDistance();
        System.out.println(obj.distance(x,y));
    }
}
