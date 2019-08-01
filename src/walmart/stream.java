package walmart;
import java.util.stream.Collectors;
import java.util.List;
import java.util.*;

/**
 * Created by ashishsowmya on 7/19/19.
 */
public class stream
{
    public static void main(String[] args)
    {
        String str= "This sia eclipse random Eclipse ecliPse not a valid ECLIPSE sdfdsf sdfd".toLowerCase();

        List<String> list= Arrays.asList(str.split("\\s+"));
        int count=  list.stream().filter(i->i.equals("eclipse")).collect(Collectors.toList()).size();
        System.out.println(count);

       int coun1 = list.stream().map(i->i.equals("eclipse")).collect(Collectors.toList()).size();
        System.out.println("map count is"+coun1);

    }
}

