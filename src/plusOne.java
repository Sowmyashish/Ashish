/**
 * Created by ashishsowmya on 9/29/18.
 */
public class plusOne {

    public int[] plusOne(int[] digits)
    {
        int count=0;
        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i] < 9)
            {
               int result= digits[i];
               digits[i]= result +1;
               return digits;

            }
            else if(digits[i] == 9)
            {
              //  int result = digits[i];
                digits[i] =0;
                count = count+1;

            }

        }
        if(count == digits.length)
        {
            int[] dig = new int[digits.length+1];
            dig[0] = 1;
            return dig;
        }

        return digits;
    }

    public static void main(String args[])
    {
        int a[] = {1,2,9};
        plusOne obj = new plusOne();
      int result[] = obj.plusOne(a);
      for(int i=0;i<result.length;i++)
      {
          System.out.println(result[i]);
      }
    }
}
