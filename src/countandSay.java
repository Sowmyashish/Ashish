/**
 * Created by ashishsowmya on 11/9/18.
 */
public class countandSay
{
    public String countAndSay(int n)
    {
        if( n==1)
            return "1";

        StringBuilder curr = new StringBuilder("1");
        StringBuilder previous;
        int count;
        char say;
        for(int i=1;i<n;i++)
        {
            previous = curr;
            curr = new StringBuilder();
            say = previous.charAt(0);
            count=1;
            for(int j=1;j<previous.length();j++)
            {
                if(say != previous.charAt(j))
                {
                    curr.append(count).append(say);
                    count=1;
                    say = previous.charAt(j);

                }
                else
                count++;
            }
            curr.append(count).append(say);
        }
        return curr.toString();
    }

    public static void main(String args[])
    {
        countandSay obj = new countandSay();
      String str=  obj.countAndSay(4);
        System.out.println(str);
    }


}
