package medium;

/**
 * Created by ashishsowmya on 2/10/19.
 */
public class containerWith
{
    public int maxArea(int[] height)
    {
        if(height.length <= 1)
            return 0;

        int left =0;
        int right =height.length-1;
        int max =0;
        while(left < right)
        {
            int min = Math.min(height[left],height[right]);
            int distance = right-left;
            max = Math.max(max,distance*min);
            if(height[left] < height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
return max;
    }

    public static void main(String args[])
    {
        int[] height = {1,8,6,2,5,4,8,3,7};
        containerWith obj = new containerWith();
       int result= obj.maxArea(height);
        System.out.println(result);
    }
}








//https://www.youtube.com/watch?v=K8SF4YadH0Q