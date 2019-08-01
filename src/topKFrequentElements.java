/**
 * Created by ashishsowmya on 6/5/18.
 */

import java.util.*;

public class topKFrequentElements {

    public List<Integer> topKFrequent(int[] nums, int k) {
        //count the frequency for each element
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num: nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }else{
                map.put(num, 1);
            }
        }

        //get the max frequency
        int max = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            max = Math.max(max, entry.getValue());
        }

        //initialize an array of ArrayList. index is frequency, value is list of numbers
        ArrayList<Integer>[] arr = (ArrayList<Integer>[]) new ArrayList[max+1];
        for(int i=1; i<=max; i++){
            arr[i]=new ArrayList<Integer>();
        }

        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int count = entry.getValue();
            int number = entry.getKey();
            arr[count].add(number);
        }

        List<Integer> result = new ArrayList<Integer>();

        //add most frequent numbers to result
        for(int j=max; j>=1; j--){
            if(arr[j].size()>0){
                for(int a: arr[j]){
                    result.add(a);
                    //if size==k, stop
                    if(result.size()==k){
                        break;
                    }
                }
            }
        }

        return result;
    }


    public List<Integer> topK(int[] nums, int k)
    {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int temp: nums)
        {
            if(map.containsKey(temp))
            {
                map.put(temp,map.get(temp)+1);
            }
            else
            {
                map.put(temp,1);
            }
        }


        int maxCount =0;
        int maxValueInMap=(Collections.max(map.values()));
        System.out.println(maxValueInMap);





        return list;




    }


    public List<Integer> topKFrequenttest(int[] nums, int k) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        PriorityQueue<Map.Entry> pq;
        for(int temp: nums)
        {
            if(map.containsKey(temp))
            {
                map.put(temp,map.get(temp)+1);
            }
            else
            {
                map.put(temp,1);
            }
        }

        pq=new PriorityQueue<>(new Comparator<Map.Entry>() {
            @Override
            public int compare(Map.Entry o1, Map.Entry o2) {
                return (int) o2.getValue() - (int) o1.getValue();
            }
        });

        pq.addAll(map.entrySet());

        for(int i=0;i<k;i++)
        {
           Map.Entry a= pq.poll();
           list.add((int)a.getKey());
        }

        return list;

    }




    public static void main(String args[])
{
    topKFrequentElements obj = new topKFrequentElements();
    int a[]={1,1,1,2,2,3};
    int k =2;
  // List list= obj.topK(a,k);
    List list = obj.topKFrequenttest(a,k);
   for(int i=0;i<list.size();i++)
   {
       System.out.println(list.get(i));
   }
   // obj.topKFrequent(a,k);
}
}
