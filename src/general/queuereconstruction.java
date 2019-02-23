package general;
import java.util.*;

/**
 * Created by ashishsowmya on 2/9/19.
 */
public class queuereconstruction
{
    public int[][] reconstructQueue(int[][] people)
    {
        Arrays.sort(people, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                if (a[0] != b[0]) return b[0] - a[0];
                else return a[1] - b[1];
            }
        });



        ArrayList<int[]> tmp = new ArrayList<>();
        for (int i = 0; i < people.length; i++) {
            int a = people[i][1];
            int[] b = people[i];
            tmp.add(a,b);
        }


        for(int i=0;i<tmp.size();i++)
        {
            System.out.println(tmp.get(i)[1]);
        }

        int[][] res = new int[people.length][2];
        for (int i = 0; i < tmp.size(); i++) {
            int a = tmp.get(i)[0];
            int b = tmp.get(i)[1];
            res[i][0] = tmp.get(i)[0];
            res[i][1] = tmp.get(i)[1];
        }
        return res;
    }


    public static void main(String args[])
    {
       ArrayList<int[][]> people = new ArrayList<>();
        int[][] array ={
                {7,0},
                {4,4},
                {7,1},
                {5,0},
                {6,1},
                {5,2}
        };

            people.add(array);
            queuereconstruction obj = new queuereconstruction();
            int[][] a = obj.reconstructQueue(array);



    }
}



