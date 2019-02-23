package medium;

/**
 * Created by ashishsowmya on 6/11/18.
 */
public class productNoSelf {


//    public int[] product(int[] a) {
//        int[] temp = new int[a.length];
//        int result = 1;
//
//        for (int i = 0; i < a.length; i++) {
//            result = result * a[i];
//        }
//
//        for (int i = 0; i < a.length; i++) {
//            try {
//                temp[i] = result / a[i];
//            } catch (ArithmeticException e) {
//
//                System.out.println("Division by zero not Possible!");
//
//            }
//
//
//
//        }
//        return temp;
//    }


public int[] product(int[] nums)
{
//    int leng = nums.length;
//    int[] ret = new int[leng];
//    if(leng == 0)
//        return ret;
//    int runningprefix = 1;
//    for(int i = 0; i < leng; i++){
//        ret[i] = runningprefix;
//        runningprefix*= nums[i];
//    }
//    int runningsufix = 1;
//    for(int i = leng -1; i >= 0; i--){
//        ret[i] *= runningsufix;
//        runningsufix *= nums[i];
//    }
//    return ret;

    int[] new_Array = new int[nums.length];
    if(nums.length ==0)
    {
        return new_Array;
    }

    int prefix = 1;
    int suffix =1;

    for(int i=0;i<nums.length;i++)
    {
        new_Array[i] = prefix;
        prefix = prefix* nums[i]; // this value is used to store the previous value to the next place in the new array
    }

    for(int i=nums.length-1;i>=0;i--)
    {
        new_Array[i] = new_Array[i]*suffix;
        suffix = suffix*nums[i];
    }

    return new_Array;
}


    public static void main(String args[])
    {

        int a[] = {1,2,3,4};
        productNoSelf obj = new productNoSelf();
       int[] result= obj.product(a);
       for(int num = 0;num<result.length;num++)
       {
           System.out.println(result[num]);
       }

    }
}
