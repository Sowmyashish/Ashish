package general;
import com.sun.tools.corba.se.idl.InterfaceGen;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.*;

/**
 * Created by ashishsowmya on 6/19/19.
 */
public class java8
{
    public static void main(String args[])
    {
        List<Integer> li = new ArrayList<Integer>();
        li.add(0);
        li.add(51);
        li.add(23);
        li.add(3);
        li.add(4);
        li.add(35);

     // to print all the values in the list
             //  li.forEach((i)-> System.out.println(i));



        //to print all the list values
              // List<Integer> list= li.stream().collect(Collectors.toList());
             //  System.out.println(li);


       // to print even numbers

            //List<Integer> list1 = li.stream().filter(i->i%2 ==0).collect(Collectors.toList());
            //System.out.println(list1);

        //to perform some modification to the existing list, make use of map
            // List<Integer> add = li.stream().map(i->i+5).collect(Collectors.toList());
            //System.out.println(add);

        //to count number of pass students
//        Long count = li.stream().filter(i->i>=35).count();
//        System.out.println(count);



    //sorted order
     List<Integer> list=li.stream().sorted(  (a,b)->b.compareTo(a)).collect(Collectors.toList());
        System.out.println(list);







    }
}
