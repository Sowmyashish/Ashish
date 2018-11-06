/**
 * Created by ashishsowmya on 9/18/18.
 */
public class testArchana {

    public void test(String s)
    {
        //replaces . with  " "

        String[] str = s.split("@",2);
        String str1 =str[0];
      str1=  str1.replace(".","");


      //ignores all the characters after "+" symbol
         

        System.out.println(str1);


    }


    public static void main(String args[])
    {
        testArchana obj = new testArchana();
        String s ="avar.i@horizon.csueastbay.edu";
        obj.test(s);
    }
}
