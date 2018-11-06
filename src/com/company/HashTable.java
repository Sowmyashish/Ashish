package com.company;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.StringTokenizer;

/**
 * Created by ashishsowmya on 6/11/17.
 */
public class HashTable {

    public static void main(String args[])
    {
        Hashtable<String, String> ht =
                new Hashtable<String, String>();
        Enumeration enum1;
        String str;


        ht.put("1","madhu");
        ht.put("2","Kaveri");
        ht.put("3","soms");
        ht.put("4","Lathu");

        enum1 = ht.keys();
while(enum1.hasMoreElements())
{

    str = (String)enum1.nextElement();
    System.out.println( "keys are" + str);
    System.out.println("names" + ht.get(str));
}



    }


}
