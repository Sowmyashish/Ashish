package walmart;
import java.util.List;
import java.util.*;

/**
 * Created by ashishsowmya on 7/18/19.
 */
public class fibonacci
{
    public List<Integer> fib(int n)
    {
        List<Integer> li = new LinkedList<Integer>();
        int i=2;
        int f1=0;
        int f2=1;
        int f3= f1+f2;
        li.add(f1);
        li.add(f2);
        while(i < n)
        {

            li.add(f3);
            f1 = f2;
            f2 = f3;
            f3= f1+f2;
            i++;
        }
        return li;
    }



    public static void main(String[] args)
    {
        fibonacci obj = new fibonacci();
        List<Integer> li=obj.fib(2);
        li.forEach(i-> System.out.println(i));


    }
}
