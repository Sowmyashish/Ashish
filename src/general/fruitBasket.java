package general;

import java.util.HashMap;

/**
 * Created by ashishsowmya on 2/26/19.
 */
public class fruitBasket
{
    public int totalFruit(int[] tree)
    {
      if(tree.length == 0 || tree == null)
      {
          return 0;
      }
        HashMap<Integer,Integer> map = new HashMap<>();
        int result =0;
        int i=0;
        for(int j = 0;j<tree.length;++j)
        {
            map.put(tree[j],map.getOrDefault(tree[j],0)+1);
            while(map.size() >2)
            {
                map.put(tree[i],map.get(tree[i]-1));
                if(map.get(tree[i]) ==0)
                {
                    map.remove(tree[i]); //when you continuesly iterate and decrement the first hash value and
                      //atlast when u delete it, the size of the hashmap becomes 1
                }
                i++;
            }
            result = Math.max(j-i+1,result);
        }
        return result;

    }
}
