package walmart;
import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by ashishsowmya on 6/21/19.
 */
public class RemoveDuplicatesFromList
{
    Set<Integer> set = new HashSet<>();

    public List<Integer> remove(List<Integer> li)
    {
        Queue<Integer> queue= new LinkedList<>();
            for(int i:li)
            {
                set.add(i);
            }
           List<Integer> list = new ArrayList<>(set);

            return list;
    }


    public List<Integer> remove1(List<Integer> li)
    {
      // List<Integer> list= li.stream().collect(Collectors.toSet()).stream().collect(Collectors.toList());
        List<Integer> list=   li.stream().distinct().collect(Collectors.toList());
        return list;
    }

    public static void main(String[] args)
    {
        RemoveDuplicatesFromList obj = new RemoveDuplicatesFromList();
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,8,3,5,3,7,5,6,7));
        List<Integer> li = obj.remove1(list);
        li.stream().forEach(i-> System.out.println(i));

    }

}
