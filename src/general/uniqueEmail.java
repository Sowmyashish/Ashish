package general;

import java.util.HashMap;
import java.util.*;

/**
 * Created by ashishsowmya on 10/28/18.
 */
public class uniqueEmail {

    public int numUniqueEmails(String[] emails)
    {
        int count=0;
        int result = 0;
        HashMap<String,Integer> map =new HashMap<>();
          for(String str:emails)
          {

              String[] strSplit = str.split("@",2);
              String strLocal = strSplit[0];
              String strDomain = strSplit[1];
              strLocal= strLocal.replace(".","");

              String[] ignore = strLocal.split("\\+",2);
              String before  = ignore[0];
              String finalString =   before + strDomain;

              if(!map.containsKey(finalString))
              {
                  map.put(finalString,1);
              }
              else
              {
                count=  map.get(finalString);
                count++;
                map.put(finalString,count);

              }
          }

        return map.size();
    }

    public static void main(String args[])
    {
        uniqueEmail obj = new uniqueEmail();
        String[] str = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"};
      int result=  obj.numUniqueEmails(str);
        System.out.println(result);

    }
}
