/**
 * Created by ashishsowmya on 10/3/18.
 */

import java.util.*;

public class pascalsTriangle {

    public  List<List<Integer>> pascal(int numRows)
    {
        List<List<Integer>> res = new LinkedList<>();

        for(int i=0;i<numRows;i++)
        {
            List<Integer> list = new LinkedList<>();
            for(int j=0;j<=i;j++)
            {
                if(j ==0 || i==j)
                {
                    list.add(1);
                }

                else if(!res.isEmpty())
                {
                   list.add(res.get(res.size()-1).get(j-1) + res.get(res.size()-1).get(j));
                }
            }
            res.add(list);
        }
        return res;
    }

public static void main(String args[])
{
    pascalsTriangle obj = new pascalsTriangle();
    List<List<Integer>> list = obj.pascal(3);

    for(int i=0;i<list.size();i++)
    {
        System.out.println(list.get(i));
    }
}


}
