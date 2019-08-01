package general;

/**
 * Created by ashishsowmya on 6/20/19.
 */
public class exception
{
    public int divide(int a,int b) throws ArithmeticException
    {
        return a/b;
    }


    public void dividethrow(int a,int b)
    {
        try{

            int c = a/b;
            throw new ArithmeticException("You shouldn't divide number by zero");
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Error: "+ex.getMessage());
        }


    }

    public static void main(String args[])
    {

        exception obj = new exception();

//        try {
//            obj.divide(2, 0);
//        }catch(ArithmeticException  e)
//      {
//          System.out.println("b cannot be 0");
//
//      }

        obj.dividethrow(2,0);
    }
}
