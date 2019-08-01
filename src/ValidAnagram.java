/**
 * Created by ashishsowmya on 6/27/19.
 */
public class ValidAnagram
{
    public boolean isAnagram(String s, String t)
    {
        if(s.length() != t.length())
        {
            return false;
        }
        int[] new_array= new int[26];
        for(int i=0;i<s.length();i++)
        {
            int index = s.charAt(i)-'a';
            new_array[index] = new_array[index]+1;

            int index1 = t.charAt(i)-'a';
            new_array[index] = new_array[index]-1;
        }
        for(int i:new_array)
        {
            if(i != 0)
                return false;
        }
        return true;

    }
    public static void main(String[] args)
    {
        ValidAnagram obj = new ValidAnagram();
        String s = "a";
        String t = "b";
        boolean result = obj.isAnagram(s,t);
        System.out.println(result);
    }
}
