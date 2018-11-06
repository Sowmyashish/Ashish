/**
 * Created by ashishsowmya on 10/4/18.
 */
public class toLowerCase {

    public String toLower(String str)
    {
        char[] a = str.toCharArray();
        for(int i=0;i<str.length();i++)
        {
            if('A' <= a[i] && a[i] <= 'Z')
            {
                a[i] = (char)(a[i] - 'A' + 'a' );
            }
        }

        return new String(a);
    }

    public static void main(String args[])
    {
        String str = "HELLO";
        toLowerCase obj = new toLowerCase();
        String new_string = obj.toLower(str);
        System.out.println(new_string);
    }
}
