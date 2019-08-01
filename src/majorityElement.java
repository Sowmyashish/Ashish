import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by ashishsowmya on 4/20/18.
 */
public class majorityElement {

    //int count =1;
//    public void majority(int[] a)
//    {
//
//        HashMap<Integer,Integer> map = new HashMap<>();
//        for(int i=0;i<=a.length-1;i++)
//        {
//            if(map.containsKey(a[i]))
//            {
//                  count=  map.get(a[i]);
//                  count=count+1;
//                  map.put(a[i],count);
//                  if(count > (a.length)/2)
//                  {
//                      System.out.println(a[i]);
//                  }
//            }
//            else
//            {
//                map.put(a[i],count);
//            }
//        }
//    }


//    public int majorityElement(int[] nums)
//    {
//        int a = nums.length/2;
//        HashMap<Integer,Integer> map = new HashMap<>();
//
//        int result=0;
//        for(int i=0;i<nums.length;i++)
//        {
//            int count1=1;
//            if(map.containsKey(nums[i]))
//            {
//
//               count1 =  map.get(nums[i]);
//               count1 = count1+1;
//                map.put(nums[i],count1);
//                if(map.get(nums[i]) > (nums.length)/2)
//                {
//                    result= nums[i];
//               }
//            }
//            else
//            {
//                map.put(nums[i],count1);
//                if(map.get(nums[i]) > (nums.length)/2)
//                {
//                    result= nums[i];
//                }
//
//            }
//        }
//
//
//        return result;
//    }


    public int majorityElement(int[] nums)
    {
        int majority = nums[0];
        int count = 1;
        for(int i=1;i<nums.length;i++)
        {
            if(count ==0)
            {
                count++;
                majority = nums[i];
            }
            else if(majority == nums[i])
            {
                count++;
            }
            else
            {
                count--;
            }
        }


return majority;

    }


    public static void main(String args[])
    {
        majorityElement obj = new majorityElement();
        int []a= {2,3,3,3,3,2,5,4,3,3,3,2};
      int result=  obj.majorityElement(a);
        System.out.println(result);

    }
}
