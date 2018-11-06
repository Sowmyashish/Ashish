/**
 * Created by ashishsowmya on 6/15/18.
 */
public class minStack {
    int max=10;
   int[] stack = new int[max];
   int[] tempstack = new int[max];
   int bottom,tempbottom;
   int min;

    public minStack()
    {
        bottom=-1;
       tempbottom=-1;
    }
//
//    public void push(int x)
//    {
//        if(bottom == -1)
//        {
//            min = x;
//        }
//        if(bottom == max)
//        {
//            System.out.println("stack is full");
//        }
//        else
//        {
//            bottom = bottom+1;
//            stack[bottom] = x;
//
//        }
//        if(x <= min)
//        {
//            tempbottom = tempbottom +1;
//            tempstack[tempbottom] = x;
//            min=x;
//        }
//    }
//
//    public int min()
//    {
//        if(tempbottom ==-1)
//        {
//            return -1;
//        }
//        else
//        {
//            return tempstack[tempbottom];
//        }
//    }
//
//    public int top()
//    {
//        if(bottom ==-1)
//        {
//            return -1;
//        }
//        else
//        {
//           return stack[bottom];
//        }
//    }
//
//    public void pop()
//    {
//        if(bottom == -1)
//        {
//            System.out.println("Stack is empty");
//        }
//        else
//        {
//            int x = stack[bottom];
//            if(x == min())
//            {
//                bottom=bottom-1;
//                tempbottom = tempbottom-1;
//                System.out.println("popped elements is" +x);
//            }
//            else
//            {
//                System.out.println("popped elements is" +x);
//                bottom = bottom-1;
//            }
//
//
//
//
//
//        }
//    }
//    public void print()
//    {
//        System.out.println("Stack elements are");
//        for(int i=0;i<=bottom;i++)
//        {
//            if(stack[i] != 0)
//            System.out.println(stack[i]);
//        }
//    }
//
//    public void printMinimumstack()
//    {
//        System.out.println("Temporary stack elements are");
//        for(int j =0;j<=tempbottom;j++)
//        {
//            if(tempstack[j] !=0)
//                System.out.println(tempstack[j]);
//        }
//    }





    private void push(int x)
    {
        if(bottom == max)
        {
            System.out.println("Stack is full");
        }
        if(bottom ==-1)
        {
            bottom++;
            stack[bottom] =x;
            min = x;

        }
        else
        {
            bottom = bottom+1;
            stack[bottom] = x;
        }
        if(x <= min)
        {
            tempbottom = tempbottom+1;
            tempstack[tempbottom] = x;
            min =x;
        }
    }
 private void print()
 {
     System.out.println("Temporary stack elements are");
     for(int i=0;i<=tempbottom;i++)
     {
         System.out.println(tempstack[i]);
     }

     System.out.println("Stack elements are");
     for(int i=0;i<=bottom;i++)
     {
         System.out.println(stack[i]);
     }

 }


 private int top()
 {
     if(bottom == -1)
     {
         return -1;
     }
     else
     {

         return stack[bottom];
     }
 }




 private void pop()
 {
    int temp = stack[bottom];

    if(temp == min)
    {
        tempbottom=tempbottom-1;
        bottom = bottom-1;
        System.out.println("Popped element is" +temp);

    }
    else
    {
        bottom = bottom-1;
        System.out.println("Popped element is" +temp);
    }
 }





    public static void main(String args[])
    {
        minStack obj = new minStack();
         obj.push(50);
         obj.push(60);
         obj.print();
         obj.pop();

         obj.print();

//        obj.push(10);
//        obj.push(20);
//        obj.push(30);
//        obj.print();
//        obj.pop();
//        obj.push(40);
//        obj.push(50);
//        obj.push(2);
//        obj.print();
//
//        int top= obj.top();
//        int minimum= obj.min();
//        System.out.println("top element in the stack" +top);
//        System.out.println("minimum element is " +minimum);
//        obj.printMinimumstack();
//
//        obj.pop();
//        obj.pop();
//        obj.pop();
//        obj.print();
//        obj.printMinimumstack();
    }
}
