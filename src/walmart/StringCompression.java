package walmart;

/**
 * Created by ashishsowmya on 6/24/19.
 */
public class StringCompression
{
    public int Compression(char[] chars)
    {
        int j=0;
        int count=1;
        for(int i=1;i<=chars.length;i++)
        {
            while(i !=j)
            {
                if(chars[i]!=chars[j])
                {
                    if(count != 1)
                    {
                        char temp = (char)(count + '0');
                        j++;
                        chars[j] = temp;
                        j++;
                        count=1;
                    }

                }
                else
                {
                    count++;
                    break;
                }

            }

        }
        return j;

    }


    public int compress(char[] chars)
    {
        int i=0;int currentIndex=0;
        //i will be keep on moving
        while( i < chars.length)
        {
            int count =0;
            char currentChar = chars[i];

            while(i < chars.length && chars[i] == currentChar)
            {
                    i++;
                    count++;
            }
            chars[currentIndex++] = currentChar;
            if(count != 1)
            {
                for(char c : Integer.toString(count).toCharArray())
                    chars[currentIndex++] = c;


            }

        }
       return currentIndex;

     }
    public static void main(String[] args)
    {
        char[] new_array = {'a','a','b','b','c','c','c'};
        StringCompression obj = new StringCompression();
      int result=  obj.compress(new_array);
        System.out.println(result);
    }
}
