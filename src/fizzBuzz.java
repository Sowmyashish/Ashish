/**
 * Created by ashishsowmya on 4/2/18.
 */


import java.util.*;


public class fizzBuzz {
    int i=0;
    List<String> list = new LinkedList<>();
    public void calculate(int num)

    {
       for(int i=1;i<=num;i++)
       {
           if(i %3 == 0 && i%5 == 0)
           {
               System.out.println("FizzBuzz");
           }
           else if(i%5 == 0)
           {
               System.out.println("Buzz");
           }
           else if(i %3 == 0)
           {
               System.out.println("Fizz");
           }
           else
           {
               System.out.println(i);
           }

       }
    }


    public List<String> fizzBuzz(int n)
    {
        List<String> li = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            if(i %3 == 0 && i%5 ==0)
            {
                li.add("FizzBuzz");
            }
            else if(i %3 == 0)
            {
                li.add("Fizz");
            }
            else if(i%5 == 0)
            {
                li.add("Buzz");
            }
            else
            {
                li.add(String.valueOf(i));
            }

        }
        return li;
    }


    public List<String> fizzBuzzRecursion(int n)
    {
         i++;
         if( i %3 == 0 && i%5 ==0) list.add("fizzbuzz");
         else if(i%5 ==0 ) list.add("buzz");
         else if(i%3 ==0) list.add("fizz");
         else list.add(String.valueOf(i));
         if(i < n) fizzBuzzRecursion(n);

     return list;
    }

    public static void main(String args[])
    {
        fizzBuzz obj = new fizzBuzz();
       List<String> list=obj.fizzBuzzRecursion(15);
       for(int i=0;i<list.size();i++)
           System.out.println(list.get(i));

    }

}
