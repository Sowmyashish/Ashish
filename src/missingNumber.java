/**
 * Created by ashishsowmya on 5/8/18.
 */
public class missingNumber {
    int sum=0;
    int missingNumber=0;

    public int missingNumber(int[] nums) {
        int length = nums.length;

        int sumOfIntegers = (length * (length + 1)) / 2;
        for (int i = 0; i < length; i++) {
            sum = sum + nums[i];
        }
        missingNumber = sumOfIntegers - sum;
        return missingNumber;
    }



    public int missing1(int[] nums)
    {
        int xor =0;
        int i=0;
        for( i=0;i<nums.length;i++)
        {
            xor = xor^i^nums[i];
        }
        return xor^i; //here length is 3, when i is 3, it comes out of loop, but we need to calculate for 3 also. theefore calculte at
        //the end
    }

    public static void main(String args[])
    {
        int a[] ={3,0,1};
        missingNumber obj = new missingNumber();
   //  int result= obj.missingNumber(a);
        int result = obj.missing1(a);
        System.out.println(result);
    }
}
