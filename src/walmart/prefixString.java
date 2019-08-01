package walmart;
import java.util.*;

/**
 * Created by ashishsowmya on 7/3/19.
 */
public class prefixString
{
    StringBuilder sb = new StringBuilder();
   List<String> list = new LinkedList<>();
   int count=0;
    public List<String> li(String word)
    {
        list.add(word);
        Collections.sort(list);
        return list;
    }

    public boolean check(StringBuilder sb,char ch)
    {
           for(String str:list)
           {

               int index = str.indexOf(ch);
               if(index != str.length()-1)
               {
                   sb.append(ch);
                   return false;
               }
               else
               {
                   String sub = str.substring(0,index);
                 String sub2=  sb.toString();
                 if(sub.equals(sub2)) return true;
                 for(int i=0;i<sub.length();i++)
                 {
                     if(sub.charAt(i) != sub2.charAt(i))
                         return false;
                     else
                         count++;
                     if(count == sub.length())
                     {
                         return true;
                     }

                 }

               }

           }
           return false;
    }



    public boolean check1(StringBuilder sb,char ch)
    {
        for(String str:list)
        {
            if(str.indexOf(ch)==-1)
            {
                continue;
            }
            else
            {
                int index = str.indexOf(ch);
                if(index == str.length()-1)
                {
                    String subString1 = str.substring(0,index);
                    String String2 = sb.toString();
                    String new_string =  String2.substring(sb.length()-index,sb.length());
                    if(subString1.equals(new_string))
                    {
                        sb.append(ch);
                        return true;
                    }

                }
                else
                {
                    sb.append(ch);
                }
            }
        }
        return false;
    }


    HashSet<String> set = new HashSet<>();
    public prefixString()
    {
        list.add("abc");
        list.add("def");
        list.add("g");
        list.add("a");
        Collections.sort(list);

    }


  public boolean isCheck(StringBuilder sb,char ch)
  {

      sb.append(ch);
      String str = sb.toString();
      if(set.contains(str))
      {
          return true;
      }
      else
      {
         // sb.append(ch);
      }
      return false;
  }



    public static void main(String[] args)
    {
        prefixString obj = new prefixString();
        StringBuilder sb = new StringBuilder();
        boolean a=  obj.check1(sb,'a');
        System.out.println(a);
        boolean b = obj.check1(sb,'b');
        System.out.println(b);
        boolean c = obj.check1(sb,'c');
        System.out.println(c);
        boolean d = obj.check1(sb,'d');
        System.out.println(d);
        boolean e = obj.check1(sb,'e');
        System.out.println(e);
        boolean f = obj.check1(sb,'f');
        System.out.println(f);

    }
}
