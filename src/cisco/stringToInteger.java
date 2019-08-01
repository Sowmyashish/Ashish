package Cisco;

/**
 * Created by ashishsowmya on 10/10/18.
 */
public class stringToInteger {
    //basic
    //https://stackoverflow.com/questions/14831638/why-the-ascii-value-of-a-digit-character-is-equal-to-the-value-plus-0
    //atoi: ascii to integer

//easy
    //Integer.parseInt("123"); ----> output: 123
    //https://www.youtube.com/watch?v=lJy5GhKYHl0

int number=0;
double result=0;
int startIndex=0;
boolean isNegative=false;
    public int atoi(String str) {
        str = str.trim();

        if(str.length() == 0)
        {
            return 0;
        }
        if(str.charAt(0) == '+' || str.charAt(startIndex) == '-')
        {
            startIndex++;
        }
        if(str.charAt(0) == '-')
        {
            isNegative = true;
        }

        for (int i = startIndex; i < str.length(); i++) {

            if(str.charAt(i) < '0' || str.charAt(i) >9)
            {
                break;
            }
            number = (int) (str.charAt(i) - '0');
            result = result * 10 + number;

        }
        if(isNegative == true)
        {
            result = -result;
        }

        if(result > Integer.MAX_VALUE)
        {
            return Integer.MAX_VALUE;
        }
        if(result < Integer.MIN_VALUE)
        {
            return Integer.MIN_VALUE;
        }

        return (int)result;
    }
    public static void main(String args[])
    {
        stringToInteger obj = new stringToInteger();
        int result= obj.atoi("+");
        System.out.println(result);
    }

//https://www.youtube.com/watch?v=lJy5GhKYHl0
}
