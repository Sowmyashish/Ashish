/**
 * Created by ashishsowmya on 5/29/18.
 */
public class countPrime {

//    public int primeCount(int n)
//    {
//        int count=0;
//        boolean[] flag=new boolean[n];
//        for(int i=2;i<n;i++)
//        {
//           if(flag[i] == false)
//           {
//               count++;
//               for(int j=2;i*j<n;j++)
//                   flag[i*j]=true;
//           }
//
//        }
//
//
//
//        return count;
//    }



    public int primeCount(int n)
    {
        int count=0;
        boolean[] flag = new boolean[n];

        for(int i=2;i<n;i++)
        {
            if(flag[i] == false)
            {
                count++;
                for(int j=2;i*j <n;j++)
                {
                    flag[i*j] = true;
                }
            }

        }

        return count;
    }

    public static void main(String args[])
    {

        countPrime obj = new countPrime();
      int a=  obj.primeCount(3);

        System.out.println(a);
    }
}
