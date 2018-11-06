package general;

/**
 * Created by ashishsowmya on 10/19/18.
 */
public class roboOrigin {
    public boolean judgeCircle(String moves) {

        if(moves.length() ==0)
        {
            return true;
        }
        int x=0;
        int y=0;
        for(char c: moves.toCharArray())
        {

            switch(c)
            {
                case 'R': x++;
                break;
                case 'L': x--;
                break;
                case 'U': y++;
                break;
                case 'D':y--;
                break;
            }
//            if(moves.charAt(i) == 'R')
//            {
//                 position = position+1;
//            }
//            else if(moves.charAt(i) == 'L')
//            {
//                position = position-1;
//            }
//            else if(moves.charAt(i) == 'U')
//            {
//                position = position+2;
//            }
//            else if(moves.charAt(i) == 'D')
//            {
//                position = position-2;
//            }
        }

        return (x==0 && y==0);
    }


    public static void main(String args[])
    {
        roboOrigin obj = new roboOrigin();
        String str ="LR";
        Boolean result= obj.judgeCircle(str);
        System.out.println(result);
    }
}
