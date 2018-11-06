package com.company;

/**
 * Created by ashishsowmya on 9/28/18.
 */
public class sumNoplus {

    public int sum(int x, int y)
    {
        int carry=0;
       if( x == 0)
       {
           return y;
       }
       else if(y ==0)
       {
           return x;
       }
       else
       {

           while( y!= 0)
           {
               carry = x &y;
               x = x ^y;
                y = carry<<1;
           }
       }
       return x;
    }

    public static void main(String args[])
    {
        sumNoplus obj = new sumNoplus();
        int x=3;
        int y=5;
       int resilt= obj.sum(x,y);
        System.out.println(resilt);
    }
}
