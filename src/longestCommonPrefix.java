/**
 * Created by ashishsowmya on 6/14/18.
 */
public class longestCommonPrefix {


//    public  String longestCommonPrefix(String[] strs)
//    {
//        if(strs == null || strs.length == 0)    return "";
//        String pre = strs[0];
//        int i = 1;
//        while(i < strs.length){
//            while(strs[i].indexOf(pre) != 0)
//                pre = pre.substring(0,pre.length()-1);
//            i++;
//        }
//        return pre;
//
//    }
//
//
//
//    public String longestCommonPrefix1(String[] strs)
//    {
//        if(strs.length == 0)
//        {
//            return "";
//        }
//
//        StringBuilder sb = new StringBuilder();
//        for(int i=1;i<strs.length;i++)
//        {
//            char ch = strs[0].charAt(i);
//            for(String s :strs)
//            {
//                if(i >= s.length() || s.charAt(i) != ch)
//                {
//                    return sb.toString();
//                }
//
//                sb.append(ch);
//            }
//        }
//        return sb.toString();
//    }


public String prefix(String[] strs)
{
    String result ="";

    if(strs.length == 0)
    {
        return result;
    }
     for(int i=0;i< strs[0].length();i++)
     {
         char ch = strs[0].charAt(i);

         for(int j=0;j<strs.length;j++)
         {
             if(j>=strs[j].length() || strs[j].charAt(i)!= ch)
             {
                 return result;
             }

         }
         result = result + ch;
     }
    return result;
}

public String lcp(String[] str)
{
    if(str.length == 0 || str == null)
    {
        return "";
    }

    String longestcommon = str[0];

    for(int i=1;i<str.length;i++)
    {
        String currentString = str[i];
        int j=0;
        while(j<currentString.length() && j<longestcommon.length() && currentString.charAt(j) == longestcommon.charAt(j))
        {
            j++;
        }
        if( j ==0)
        {
            return " ";
        }
        else
        {
            longestcommon = longestcommon.substring(0,j);
        }
    }

    return longestcommon;
}


    public static void main(String args[])
    {
        String[] str = new String[3];
        str[0]="crrogd";
        str[1]="crrcgd";
        str[2]="crrrgd";

        longestCommonPrefix obj = new longestCommonPrefix();
        obj.lcp(str);
        String result = obj.prefix(str);
        System.out.println(result);
    }
}
