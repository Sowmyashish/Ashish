package general;

import javax.jnlp.IntegrationService;

/**
 * Created by ashishsowmya on 6/21/19.
 */
public class IncrementTrailorNumeric
{
//    public String add(String str)
//    {
//        int length;
//        String s ="";
//        String result ="";
//        String finalR ="";
//        int a =1;
//        int i = str.length()-1;
//
//
//        for( i=str.length()-1;i>=0;i--)
//        {
//            if(!Character.isDigit(str.charAt(str.length()-1)))
//            {
//                return str+a;
//            }
//
//            if(!Character.isDigit(str.charAt(i)))
//            {
//
//               s=  str.substring(i+1,str.length());
//               a = Integer.valueOf(s)+1;
//               break;
//            }
//
//        }
//        result = str.substring(0,i+1);
//        finalR = result+a;
//
//
//        return  finalR;
//    }


    public String test(String str)
    {
        if(str.length()==0) return ""+1;
        int result=0;
        String s="";
        for(int i=str.length()-1;i>=0;i--)
        {
            if(!Character.isDigit(str.charAt(i)))
            {
                s = str.substring(0,i+1)+(result+1);
                break;
            }
            else
            {
                result = result*10+str.charAt(i)-'0';

            }
        }
            return s;
    }

    public static void main(String[] args)
    {
        IncrementTrailorNumeric obj = new IncrementTrailorNumeric();
        String str = "string";
       String s= obj.test(str);
        System.out.println(s);
    }
}
