/**
 * Created by ashishsowmya on 4/23/18.
 */
public class fakeCoin {

    int A=0,B=0,C=0;
    public boolean fake(int[] a)
    {
        int n = a.length;
        int count=0;
        int position=0;

        if(n==1)
        {
            System.out.println(a[0] +" is fake coin");
            return true;
        }
        if(n==2)
        {
            if(a[0]>a[1]){
                System.out.println(a[0] +" is fake coin");
            }
            else{
                System.out.println(a[1] +" is fake coin");
            }
            return true;
        }

        //if n is divisible by 3
        if(n%3 == 0)
        {
            count = count+1;
            int firstLength = (n/3)-1;
             for(int i=0;i<=firstLength;i++)
             {
                  A = A + a[i];
             }
            System.out.println("Weight Of First set of Pile "+A);

             int middleLength = (n/3)+(firstLength);

            for(int i=firstLength+1;i<=middleLength;i++)
            {
                B = B + a[i];
            }
            System.out.println("Weight Of Second set of Pile "+B);

            for(int i=middleLength+1;i<= n-1;i++)
            {
                C = C+ a[i];
            }
            System.out.println("Weight Of Third set of Pile "+C);


            int b[];
            if(A>B)
            {
                b = new int[firstLength+1];
                for(int i=0;i<=firstLength;i++)
                {
                    b[i] = a[i];
                }

                boolean flag = fake(b);
                return flag;
            }
            else if(B>C)
            {
                b = new int[firstLength+1];
                int j=0;
                for(int i=firstLength+1;i<=middleLength;i++)
                {
                    b[j] = a[i];
                    j=j+1;
                }

                boolean flag = fake(b);
                return flag;
            }
            else if(C>A)
            {
                b = new int[firstLength+1];
                int j=0;
                for(int i=(middleLength+1);i<=(n-1);i++)
                {
                    b[j] = a[i];
                    j=j+1;
                }

                boolean flag = fake(b);
                return flag;
            }

            return false;
        }
        if(n%3 == 1)
        {
            int lastElement = a[n-1];
            int subArray[];
            subArray = new int[n-1];
            for(int i=0;i<=n-2;i++)
            {
                subArray[i]=a[i];
            }
            boolean flag = fake(subArray);
            if(!flag){
                System.out.println(lastElement +" is fake coin pile at "+(n)+" position");
                return true;
            }
            return flag;
        }
        else if(n%3 == 2)
        {
            int lastElement = a[n-1];
            int lastButOneElement = a[n-2];
            int subArray[];
            subArray = new int[n-2];
            for(int i=0;i<=n-3;i++)
            {
                subArray[i]=a[i];
            }
            boolean flag = fake(subArray);
            if(!flag){
                if(lastButOneElement>lastElement){
                    System.out.println(lastButOneElement +" is fake coin pile at "+(n-1)+" position");
                }
                else{
                    System.out.println(lastElement +" is fake coin pile at "+(n)+" position");
                }
                return true;
            }
            return flag;
        }
        return false;
    }

    public static void main(String args[])
    {
        int[] A={100,100,100,100,100,100,100,100,100,100,100,100,100,101};
        fakeCoin obj = new fakeCoin();
        boolean flag = obj.fake(A);
        if(!flag){
            System.out.println("Fake coin doesn't exists");
        }

    }

}
