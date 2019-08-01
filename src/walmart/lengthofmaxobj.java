package walmart;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by ashishsowmya on 6/20/19.
 */
public class lengthofmaxobj
{


    //using stream but takes 0(nlogn) as we are using sort method internally
    public int length(List<Integer> li)
    {
        List<Integer> list = li.stream().sorted( (a,b)-> b.compareTo(a)).collect(Collectors.toList());

        return list.get(0).toString().length();

    }


    public int lengthBruteForce(List<Integer> li)
    {
        int max = Integer.MIN_VALUE;

        for(int i=0;i<li.size();i++)
        {
            max = Math.max(max, li.get(i).toString().length());
        }
        return max;
    }

    public int length1(List<Integer> li)
    {
        if(li.size() ==1) return li.get(0);

        int max = Integer.MIN_VALUE;
        for(int i:li)
        {
            max = Math.max(max,i);
        }

        int size = String.valueOf(max).length();
        return size;
    }

    public static void main(String args[])
    {
        List<Integer> li = new LinkedList<>();
        li.add(10);
        li.add(20);
        li.add(209090884);
        li.add(500999994);
        li.add(8);
        lengthofmaxobj obj  = new lengthofmaxobj();
        int result = obj.length(li);
        System.out.println(result);

    }
}
