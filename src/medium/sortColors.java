package medium;

/**
 * Created by ashishsowmya on 10/4/18.
 */
public class sortColors {

    public void sort(int[] nums) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                count0++;
            } else if (nums[i] == 1) {
                count1++;
            } else if (nums[i] == 2) {
                count2++;
            }
        }
        for (int i = 0; i < count0; i++) {
            nums[i] = 0;
        }
        for (int i = count0 ; i < count0 + count1; i++) {
            nums[i] = 1;
        }
        for (int i = count0 + count1; i < count0 + count1 + count2; i++)
        {
            nums[i] =2;
        }
    }


    public static void main(String args[])
    {
        sortColors obj = new sortColors();
        int a[] = {0,1,0,2,2,1};
        obj.sort(a);

        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+"\t");
        }
    }
}
