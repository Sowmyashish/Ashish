package general;
import java.util.*;

/**
 * Created by ashishsowmya on 2/10/19.
 */
public class keysandrooms
{
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] seen = new boolean[rooms.size()];
        seen[0] = true;
        Stack<Integer> stack = new Stack();
        stack.push(0);

        //At the beginning, we have a todo list "stack" of keys to use.
        //'seen' represents at some point we have entered this room.
        while (!stack.isEmpty()) { // While we have keys...
            int node = stack.pop(); // Get the next key 'node'
            for (int nei: rooms.get(node)) // For every key in room # 'node'...
                if (!seen[nei]) { // ...that hasn't been used yet
                    seen[nei] = true; // mark that we've entered the room
                    stack.push(nei); // add the key to the todo list
                }
        }

        for (boolean v: seen)  // if any room hasn't been visited, return false
            if (!v) return false;
        return true;
    }

    public static void main(String args[])
    {
        keysandrooms obj = new keysandrooms();
        List list = new ArrayList();
//        int[][] a  ={  {1,3}, {3,0,1},{2},{0}};
//        for (int[] array : a) {
//            //This will add int values into the new list
//            // and that list will added to the main list
//            list.add(Arrays.asList(array));
//        }
        List<List<Integer>> outerList = new ArrayList<>();
//        outerList.add(Arrays.asList(1,0));
//        obj.canVisitAllRooms(outerList);
         list.add(1);
         list.add(2);
         list.add(3);


outerList.add(list);
        obj.canVisitAllRooms(outerList);

    }
}
