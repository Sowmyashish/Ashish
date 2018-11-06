package com.company;

/**
 * Created by ashishsowmya on 6/14/17.
 */
public class rev {

    int result = 0;

//    public static int reverse(int num) {
//        int result = 0;
//        int dummy = num;
//        if (num < 0) {
//            result = -1;
//            num = Math.abs(num);
//        }
//
//        while (num != 0) {
//
//            int sum = 0;
//            int reverse;
//
//            reverse = num % 10;
//            result = result * 10 + reverse;
//            num = num / 10;
//
//        }
//
//        if (result == dummy) {
//            System.out.println("palindrome");
//        } else {
//            System.out.println("not a palindrome");
//        }
//        if (result == -1) {
//            result = result * -1;
//            return result;
//        }
//        return result;
//
//    }


    public static long Rev(int num) {
        int rev;
        long sum = 0;
        int flag=0;

        if (num < 0) {
            num = num * -1;
            flag =-1;

        }


        while (num != 0) {

            rev = num % 10;
            sum = sum * 10 + rev;
            num = num / 10;

        }
        if (flag == -1) {
            return -sum;
        }
        else
        {
            return sum;
        }


    }


        public static void main(String args[])
        {
            long res;
            //res = reverse(121);
            res = Rev(1534236469);
            System.out.println(""+res);
        }
    }


