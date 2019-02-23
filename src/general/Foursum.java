package general;
import java.util.*;

/**
 * Created by ashishsowmya on 2/1/19.
 */
public class Foursum {
    public List<List<Integer>> fourSum(int[] nums,int target)
    {

        List<List<Integer>> outerList = new LinkedList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-3;i++)
        {
            if(i !=0 && nums[i] == nums[i-1] )
            {
                continue;
            }

            for(int j=i+1;j<nums.length-2;j++)
            {
                if( j != i+1 && nums[j] == nums[j-1])
                {
                    continue;
                }

                int left = j+1;
                int right = nums.length-1;

                while(left < right)
                {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    if(sum < target) left++;
                    else if(sum > target) right--;
                    else
                    {
                        List<Integer> innerList = new LinkedList<>();
                            innerList.add(nums[i]);
                            innerList.add(nums[j]);
                            innerList.add(nums[left]);
                            innerList.add(nums[right]);
                            outerList.add(innerList);
                            left++;
                            right--;
                            while(left < right && nums[left] == nums[left-1])
                            {
                                left++;
                            }

                            while(left < right && nums[right] == nums[right+1])
                            {
                                right--;
                            }

                    }


                }

            }
        }

        return outerList;
    }

    public static void main(String args[])
    {
        Foursum obj = new Foursum();
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        obj.fourSum(nums,target);
    }

}

////https://www.youtube.com/watch?v=bixvM1-28us
