/**
 * Created by ashishsowmya on 4/2/18.
 */


import java.util.*;


public class fizzBuzz {
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

    public static void main(String args[])
    {
        fizzBuzz obj = new fizzBuzz();
        obj.calculate(15);
    }

}
