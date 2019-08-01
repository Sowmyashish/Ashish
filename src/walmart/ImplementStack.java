package walmart;

/**
 * Created by ashishsowmya on 6/21/19.
 */
public class ImplementStack
{
    int size=0;
    int top = -1;
    int[] nums;
    public ImplementStack(int size)
    {
        nums = new int[size];
        this.size = size;
    }

    public void push(int x)
    {
        if(!isFull())
        {
            top++;
            nums[top] =x;
        }
    }

    public int pop()
    {
        int a = nums[top--];
        return a;

    }
    public int peek()
    {
        return nums[top];

    }
    public int size()
    {
        return top+1;
    }
    public boolean isEmpty()
    {
        if(top ==-1) return true;
        return false;

    }
    public boolean isFull()
    {
        if(top == size) return true;
        return false;

    }

    public static void main(String[] args)
    {
        ImplementStack obj = new ImplementStack(10);
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.push(5);
        obj.push(6);
        obj.push(7);
        System.out.println(obj.size());
        System.out.println(obj.peek());
        System.out.println(obj.pop());
        System.out.println(obj.size());

    }
}
