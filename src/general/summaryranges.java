package general;
import java.util.*;

/**
 * Created by ashishsowmya on 2/27/19.
 */
public class summaryranges
{
    public List<String> summaryRanges(int[] nums)
    {
        if(nums.length == 0) return new LinkedList<>();

        List<String> li = new LinkedList<>();
        if(nums.length ==1)
        {
            li.add(nums[0]+"");
        }
            int startIndex = nums[0];
        for(int i = 0;i<nums.length-1;i++)
        {
            if(nums[i]+1 != nums[i+1])
            {
                if(startIndex == nums[i])
                {
                    li.add(startIndex +"");
                    startIndex = nums[i+1];
                }
                else
                {
                    li.add(startIndex +"->"+nums[i]);
                    startIndex = nums[i+1];
                    if(i+1 == nums.length-1 && nums[i] != nums[i+1])
                    {
                        li.add(nums[i+1]+"");
                    }
                }

            }
            if(i +1 == nums.length-1 && nums[i]+1 == nums[i+1])
            {
                li.add(startIndex +"->"+nums[i+1]);
            }
            if(i+1 == nums.length-1 && nums[i] != nums[i+1])
            {
                if(!li.contains(nums[i+1]))
                li.add(nums[i+1]+"");
            }

        }
return li;
    }


    public List<String> summary(int[] nums)
    {
        if(nums.length ==0) return new LinkedList<>();
        List<String> li = new LinkedList<>();
        if(nums.length ==1)
        {
            li.add(nums[0]+"");
            return li;
        }

        for(int i=0;i<nums.length;i++)
        {
            int a = nums[i];
            while(i+1 < nums.length && nums[i]+1 == nums[i+1])
            {
                i++;
            }
            if(a != nums[i])
            {
                li.add(a+"->"+ nums[i]);
            }
            else
            {
                li.add(a+"");
            }
        }
        return li;
    }

    public static void main(String args[])
    {
        summaryranges obj = new summaryranges();
        int[] nums ={-1};
        List<String> li = obj.summary(nums);
        for(int i =0;i<li.size();i++)
        {
            System.out.println(li.get(i));
        }

    }
}
