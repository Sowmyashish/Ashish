package medium;
import java.util.*;

/**
 * Created by ashishsowmya on 11/25/18.
 */


 class Interval
{
    int start;
    int end;
    Interval()
    {
        start= 0;
        end=0;
    }
    Interval(int s,int e)
    {
        start =s;
        end =e;
    }
}


public class mergeIntervals {

     public List<Interval> merge(List<Interval> interval)
     {
         if(interval.size() <=1)
             return interval;

         interval.sort((i1,i2)->Integer.compare(i1.start,i2.start));
          List<Interval> res = new LinkedList<>();
          int start = interval.get(0).start;
          int end = interval.get(0).end;
          for(Interval obj:interval)
          {
              if(obj.start <= end)
              {
                    end = Math.max(end,obj.end);
              }
              else
              {
                  res.add(new Interval(start,end));
                  start  = obj.start;
                  end = obj.end;
              }
          }
          res.add(new Interval(start,end));
          return res;
     }

     public static void main(String args[])
     {
         List<Interval> list = new LinkedList<>();
         mergeIntervals obj  = new mergeIntervals();
         list.add(new Interval(1,4));
         list.add(new Interval(2,3));
         list.add(new Interval(6,9));
         list.add(new Interval(10,11));
         obj.merge(list);

         for(int i=0;i<list.size();i++)
         {
             System.out.println(list.get(i).start + list.get(i).end);
         }


     }

}
