/**
 * Created by ashishsowmya on 10/25/18.
 */
public class buyAndSell1 {


    public int buy(int[] a)
    {

        int buy =-1;
        int index=-1;
        int sell=0;
        boolean found = false;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i] < a[j])
                {
                    buy = a[i];
                    index =i;
                   found = true;
                }
                if(found== true)
                {
                    break;
                }

            }
            if(found == true)
            {
                break;
            }

        }
        if(found == false)
        {
            return 0;
        }

        for(int i = index;i<a.length;i++)
        {
            for(int j=index+1;j<a.length;j++)
            {
                if(a[i] < a[j])
                {
                    sell =j;
                }
            }
        }

        return sell+1;
    }




    public int buy1(int[] prices){
       if(prices.length ==0 || prices.length <2)
       {
           return 0;
       }
       int maxDifference = 0;
       int min_so_far =prices[0];

       for(int i=1;i<prices.length;i++)
       {
           if(prices[i] > min_so_far)
           {
               maxDifference = Math.max(maxDifference,prices[i]-min_so_far);
           }
           else
           {
               min_so_far = prices[i];
           }
       }
       return maxDifference;





//        if (prices.length == 0) {
//            return 0 ;
//        }
//        int max = 0 ;
//        int sofarMin = prices[0] ;
//        for (int i = 0 ; i < prices.length ; ++i) {
//            if (prices[i] > sofarMin) {
//                max = Math.max(max, prices[i] - sofarMin) ;
//            } else{
//                sofarMin = prices[i];
//            }
//        }
//        return  max ;
    }
     static public void main(String args[])
    {
        buyAndSell1 obj = new buyAndSell1();
        int[] a= {8,4,1,2,6,4};
        int buy=obj.buy1(a);
        System.out.println(buy);
    }
}
