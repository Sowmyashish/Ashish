package general;
import java.util.*;

/**
 * Created by ashishsowmya on 10/19/18.
 */
public class selfDividingNumbers {

    public List<Integer> selfDividingNumbers1(int left, int right) {
        List<Integer> li = new LinkedList<>();

        for (int i = left; i <= right; i++)
        {

               int number = i;
                boolean flag = false;
                while (number != 0)
                {

                    int remainder = number % 10;
                    number = number / 10;

                    if (remainder != 0 && i % remainder == 0)
                    {
                        flag = true;
                    }
                    else
                    {
                        flag = false;
                        break;
                    }
                }
                if (flag == true)
                {
                    li.add(i);

                }
        }

            return li;
        }


    public static void main(String args[])
    {
        selfDividingNumbers obj = new selfDividingNumbers();
        int left=1;
        int right=22;
        List<Integer> li = obj.selfDividingNumbers1(left,right);
        for(int i=left;i<right-1;i++)
        {
            System.out.println(li.get(i));
        }
    }

    }
