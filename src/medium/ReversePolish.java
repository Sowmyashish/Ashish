package medium;
import java.util.*;

/**
 * Created by ashishsowmya on 11/15/18.
 */
public class ReversePolish {

    Stack<Integer> stack= new Stack<>();
    public int reversenotation(String[] tokens)
    {
        for(String str:tokens)
        {
            if(str.equals("+"))
               stack.push(stack.pop()+stack.pop());
            else if(str.equals("*"))
                stack.push(stack.pop()*stack.pop());
            else if(str.equals("-"))
            {
                int b=stack.pop();
                int a=stack.pop();
                stack.push(a-b);
            }
            else if(str.equals("/"))
            {
                int b=stack.pop();
                int a=stack.pop();
               // stack.push( a>b?a/b:0);
                stack.push(a/b);
            }
            else
                stack.push(Integer.parseInt(str));

        }


        return stack.pop();
    }
    public static void main(String args[])
    {
        ReversePolish obj = new ReversePolish();
        String[] str =  {"-78","-33","196","+","-19","-","115","+","-","-99","/","-18","8","*","-86","-","-","16","/","26","-14","-","-","47","-","101","-","163","*","143","-","0","-","171","+","120","*","-60","+","156","/","173","/","-24","11","+","21","/","*","44","*","180","70","-40","-","*","86","132","-84","+","*","-","38","/","/","21","28","/","+","83","/","-31","156","-","+","28","/","95","-","120","+","8","*","90","-","-94","*","-73","/","-62","/","93","*","196","-","-59","+","187","-","143","/","-79","-89","+","-"};
      int result=  obj.reversenotation(str);
        System.out.println(result);
    }
}
