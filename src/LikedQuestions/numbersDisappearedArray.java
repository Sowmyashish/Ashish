package LikedQuestions;
import java.util.*;

/**
 * Created by ashishsowmya on 10/30/18.
 */
public class numbersDisappearedArray {

    public List<Integer> findDisappearedNumbers(int[] nums)
    {
        int[] temp_array = new int[nums.length+1];
        List<Integer> list = new LinkedList<>();

        if(nums.length ==0)
        {
            return list;
        }

        for(int i=0;i<nums.length;i++)
        {
            int index = nums[i];
            temp_array[index] = temp_array[index] +1;
        }

        for(int count=1;count<temp_array.length;count++)
        {
            if(temp_array[count] == 0)
            {
                list.add(count);
            }
        }
        return list;
    }


    public static void main(String args[])
    {
        numbersDisappearedArray obj = new numbersDisappearedArray();
        int[] a = {4,3,2,7,8,2,3,1};
       List<Integer> list= obj.findDisappearedNumbers(a);

       for(int i=0;i<list.size();i++)
       {
           System.out.println(list.get(i));
       }
    }

    }
