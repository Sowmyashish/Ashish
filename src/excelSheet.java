/**
 * Created by ashishsowmya on 4/5/18.
 */
public class excelSheet {

//    public int excelSheet(String s)
//    {
//        int result = 0;
//        for (int i = 0; i < s.length(); i++)
//        {
//           result= s.charAt(i) - 'A' ;
//           // result = result * 26 + (s.charAt(i) - 'A' + 1);
//        }
//        return result;
//    }

    public void test(String s)
    {
        int result =0;
        for(int i=0;i<s.length();i++)
        {
            result = result*26 + (s.charAt(i)-'A' +1);
            System.out.println(result);
        }
    }


    public static void main(String args[])
    {
        excelSheet e = new excelSheet();
    //  int a=  e.excelSheet("BA");
       // System.out.println(a);
        e.test("AB");
    }
}
