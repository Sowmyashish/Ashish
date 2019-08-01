package string;

import java.util.Stack;

/**
 * Created by ashishsowmya on 7/19/19.
 */
public class StringDecode
{
//    public String decode(String str)
//    {
//        StringBuilder sb = new StringBuilder();
//        StringBuilder sbSub = new StringBuilder();
//
//        int digit =0;
//        int i=0;
//        while(i < str.length())
//        {
//
//            if(Character.isDigit(str.charAt(i)))
//            {
//                digit = str.charAt(i)-'0';
//                i++;
//            }
//            else
//            {
//                if (str.charAt(i) == '[')
//                {
//                    i++;
//                    continue;
//                }
//                else if (str.charAt(i) == ']')
//                {
//
//                    String string = sbSub.toString();
//                    for (int k = 0; k < digit; k++)
//                    {
//                        sb.append(string);
//
//                    }
//                    sbSub.setLength(0);
//                    i++;
//                }
//
//                else
//                {
//                    sbSub.append(str.charAt(i));
//                    i++;
//                }
//            }
//
//        }
//        return sb.toString();
//        }


    public String decodeString(String s)
    {
       int index =0;
       String result ="";
       Stack<Integer> digitStack = new Stack<>();
       Stack<String> stringStack = new Stack<>();


       while(index < s.length())
       {
           int sum=0;
           if(Character.isDigit(s.charAt(index)))
           {
               while (Character.isDigit(s.charAt(index))) // if the digit is greater that 9 example 11 or 12 or 13
               {
                    sum = sum*10 + s.charAt(index)-'0';
                    index++;
               }
               digitStack.push(sum);
           }
           else if(s.charAt(index) == '[')
           {
               stringStack.push(result);
               result = "";
               index++;
           }
           else if(s.charAt(index) == ']')
           {
               StringBuilder sb = new StringBuilder(stringStack.pop()); // pop the previously stored character and store it in sb and donot
               int popDigit = digitStack.pop();                          //repeat the character, repeat the character present in result which is the character before ']'

               for(int i=0;i<popDigit;i++)
               {
                   sb.append(result);
               }
             result = sb.toString();
               index++;
           }
           else
           {
               result = result+ s.charAt(index);
               index++;

           }

       }
       return result;
    }



    public static void main(String[] args)
    {
       // String str = "3[a]2[bc]";
        String str="3[a2[c]]";
        StringDecode obj = new StringDecode();
        String result=  obj.decodeString(str);
        System.out.println(result);


    }
}

