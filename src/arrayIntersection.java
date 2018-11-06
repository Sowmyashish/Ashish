import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.*;

/**
 * Created by ashishsowmya on 5/9/18.
 */
public class arrayIntersection {
    int  count=0;

    public void intersection(int []a,int []b)
    {
        HashSet<Integer> set = new HashSet<>();


        List<Integer> myList = new ArrayList<>();


        for(int i=0;i<a.length;i++)
        {
            if(set.contains(a[i]))
            {

            }
            else
            {
                set.add(a[i]);
            }
        }
        for(int j=0;j<b.length;j++)
        {
            if(set.contains(b[j]))
            {
                myList.add(b[j]);
            }
        }

        for(int k=0;k<myList.size();k++)
        {
            System.out.println(myList.get(k));
        }
    }



    public int[] inter(int a[],int b[])
    {
        ArrayList<Integer> myList = new ArrayList<Integer>();
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<b.length;j++)
            {
                if(a[i]==b[j])
                {
                    if(!myList.contains(a[i])) {
                        myList.add(a[i]);
                    }
                }

            }
        }
        int[] res = new int[myList.size()];
        for(int i = 0; i<res.length; i++){
            res[i] = (Integer)myList.get(i);
        }
        return res;

    }



    public int[] hashmap(int[] a,int b[])
    {

        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i=0;i<a.length;i++)
        {
            if(map.containsKey(a[i]))
            {
                count = map.get(a[i]);
                count=count+1;
                map.put(a[i], count);
                System.out.println(count);
            }
            else
            {
                map.put(a[i],1);
            }
        }

        for(int i=0;i<b.length;i++)
        {
            if(map.get(b[i])>1)
            {
                if(map.containsKey(b[i]))
                {
                    map.put(b[i],map.get(b[i]-1));
                }
                else
                {
                    map.remove(b[i]);
                }
                list.add(a[i]);
            }
            else
            {

            }
        }

        int[] result= new int[map.size()];

       for(int i:list)
       {
           result[i] =list.get(i);
       }

return result;
    }




    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i: nums1){
            if(map.containsKey(i)){
                map.put(i, map.get(i)+1);
            }else{
                map.put(i, 1);
            }
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i: nums2){
            if(map.containsKey(i)){
                if(map.get(i)>1){
                    map.put(i, map.get(i)-1);
                }else{
                    map.remove(i);
                }
                list.add(i);
            }
        }

        int[] result = new int[list.size()];
        int i =0;
        while(i<list.size()){
            result[i]=list.get(i);
            i++;
        }

        return result;
    }
    public static void main(String args[])
    {
        arrayIntersection obj = new arrayIntersection();
        int a[] = {1,1};
        int b[] ={1,1};
       int[] resul= obj.intersect(a,b);
       for(int i=0;i<resul.length;i++)
       {
           System.out.println(resul[i]);
       }



    }
}
