package walmart;

/**
 * Created by ashishsowmya on 6/21/19.
 */
public class FirstRepeatedandNonrepeated
{
    public char[] repeatingAndNon(String str)
    {
        char[] ch = new char[2];
        int[] new_array = new int[26];

        //inserting all the occurences
        for(int i=0;i<str.length();i++)
        {
            int a = str.charAt(i)-'a';
            new_array[a] = new_array[a]+1;
        }

        //non-repeated-> the index should be 1

        for(int i=0;i<str.length();i++)
        {
            int index= str.charAt(i)-'a';
            if(new_array[index] == 1)
            {

                ch[0] = str.charAt(i);
                break;

            }
        }

        //repeating
        for(int i=0;i<str.length();i++)
        {
            int index = str.charAt(i)-'a';
            if(new_array[index] > 1)
            {

                ch[1] = str.charAt(i);
                break;
            }

        }

        return ch;
    }

    public static void main(String args[])
    {
        FirstRepeatedandNonrepeated obj = new FirstRepeatedandNonrepeated();
       char[] ch=  obj.repeatingAndNon("JavaCoceptOftheDay".toLowerCase());

           System.out.println(ch);

    }
}
