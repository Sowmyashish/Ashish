import java.util.HashMap;

/**
 * Created by ashishsowmya on 8/17/18.
 */
public class forSum {

//    private int count0(int[] A,int[] B,int[] C,int[] D)
//    {
//        int count1=0;
//        for(int i=0;i<A.length;i++)
//        {
//            for(int j=0;j<A.length;j++)
//            {
//                for(int k=0;k<A.length;k++)
//                {
//                    for(int l=0;l<A.length;l++)
//                    {
//                        if(A[i]+B[j]+C[k]+D[l] ==0)
//                        {
//                            count1 = count1+1;
//                        }
//                    }
//                }
//            }
//        }
//        return count1;
//    }

    HashMap<Integer, Integer> map = new HashMap<>();
//    private int count2(int[] A,int[] B,int[] C,int[] D)
//    {
//        for(int i=0;i<A.length;i++)
//        {
//            for(int j=0;j<A.length;j++)
//            {
//                int sum = C[i] + D[j];
//                map.put(sum,map.getOrDefault(sum,0)+1);
//            }
//        }
//
//int count=0;
//        for(int k=0;k<A.length;k++)
//        {
//            for(int l=0;l<A.length;l++)
//            {
//                int result  = (-1)*(A[k] + B[l] );
//                if(map.containsKey(result))
//                {
//                    count = count+1;
//                }
//            }
//        }
//        return count;
//    }

    public int sum(int[] A,int[] B,int[] C, int[] D)
    {
        int count=0;
        for(int i=0;i<A.length;i++)
        {
            for(int j=0;j<B.length;j++)
            {
                int sum = A[i] + B[j];
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }
        for(int k=0;k<C.length;k++)
        {
            for(int l=0;l<D.length;l++)
            {
                int sum = -1 *(C[k] + D[l]);
                if(map.containsKey(sum))
                {
                    count = count+map.get(sum);
                }
            }
        }

        return count;
    }


    public static void main(String args[])
    {
            forSum obj = new forSum();
            int A[] ={1,2};
            int B[] = {-2,-1};
            int C[]={-1,2};
            int D[]={0,2};
          // int result=obj.count0(A,B,C,D);
           int result = obj.sum(A,B,C,D);
           System.out.println(result);
    }
}
