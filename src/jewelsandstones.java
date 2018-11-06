import java.util.HashMap;

/**
 * Created by ashishsowmya on 10/4/18.
 */
public class jewelsandstones {

//    public int numJewelsInStones(String J, String S) {
//
//        int count=1;
//        int result=0;
//        HashMap<Character,Integer> map = new HashMap<>();
//        for(int i=0;i<S.length();i++)
//        {
//            if(map.containsKey(S.charAt(i)))
//            {
//                map.put(S.charAt(i),map.get(S.charAt(i))+1);
//            }
//            else
//            {
//                map.put(S.charAt(i),count);
//            }
//        }
//
//        for(int i=0;i<J.length();i++)
//        {
//            if(map.containsKey(J.charAt(i)))
//            {
//                result = result + map.get(J.charAt(i));
//            }
//        }
//return result;
//    }


    public int j(String J,String S)
    {

        int count=0;
        for(int i=0;i<S.length();i++)
        {
            if(J.indexOf(S.charAt(i))!=-1)
            {
                count++;
            }
        }
        return count;
    }

    public static void main(String args[])
    {
        jewelsandstones obj = new jewelsandstones();
        System.out.println(obj.j("aA","aAAbbbb"));

    }
}
