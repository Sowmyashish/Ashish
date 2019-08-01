package general;

/**
 * Created by ashishsowmya on 6/1/19.
 */
public class threadExample implements Runnable
{
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println("child thread");
        }
    }

    public static void main(String args[])
    {
        threadExample t = new threadExample();
        Thread t1 = new Thread(t);
        t1.start();

        for(int i=0;i<10;i++)
        {
            System.out.println("main thread");
        }

    }
}
