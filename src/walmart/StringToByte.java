package walmart;

/**
 * Created by ashishsowmya on 6/30/19.
 */
public class StringToByte
{
    public void convert(String str)
    {
        byte[] byteArray = str.getBytes();
        System.out.println(byteArray);
    }

    public static void main(String[] args)
    {
        StringToByte obj = new StringToByte();
        obj.convert("hello");

    }
}
