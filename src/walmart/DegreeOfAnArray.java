package walmart;
import java.util.*;
/**
 * Created by ashishsowmya on 6/22/19.
 */
public class DegreeOfAnArray
{

    public int degree(int[] nums)
    {
        int degree = Integer.MIN_VALUE;
        int res = Integer.MAX_VALUE;
        HashMap<Integer,int[]> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
                if(!map.containsKey(nums[i]))
                {
                    map.put(nums[i],new int[]{1,i,i});
                }
                else
                {
                    int[] temp= map.get(nums[i]);
                    temp[0] = temp[0]+1;
                    temp[2] = i;
                }
        }

        for(int[] temp:map.values())
        {
            if(temp[0] > degree)
            {
                degree = temp[0];
                res = temp[2]-temp[1]+1;
            }
            else if(temp[0] == degree)
            {
                res= Math.min(res,temp[2]-temp[1]+1);
            }
        }
        return res;
    }

    public static void main(String[] args)
    {
        int[] nums ={1,2,2,3,1};
        DegreeOfAnArray degree = new DegreeOfAnArray();
        int result = degree.degree(nums);
        System.out.println(result);
    }
}
