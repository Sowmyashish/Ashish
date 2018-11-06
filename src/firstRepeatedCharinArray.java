/**
 * Created by ashishsowmya on 9/28/18.
 */
public class firstRepeatedCharinArray {
    public char taskarray() {
        char array1[] = {'a', 'b', 'c', 'd', 'e', 'c'};
        char a = ' ';


        for (int i = 0; i < array1.length; i++)
        {
            for (int j = i + 1; j < array1.length; j++)
            {
                if (array1[i] == array1[j]) {
                  a= array1[i];

                }

            }
        }
        return a;

    }


    public char repeat()

    {
        char[] ch = {'a', 'a', 'c', 'd', 'e', 'c'};
        char result= ' ' ;
        for (int i = 0; i < ch.length; i++) {
            int j;
            for (j = 0; j < ch.length; j++)
                if (i != j && ch[i] == ch[j])
                    break;
            if (j == ch.length)
                result =ch[i];
        }
return result;

    }



    public char repeat1() {

        char[] line = {'a', 'a', 'c', 'd', 'e', 'c'};


        Character c = null;
        int strLength = line.length;

        for (int i = 0; i < strLength; i++) {

            int flag = 0;
            for (int j = 0; j < strLength; j++) {
                if (line[i] == line[j] && i != j) {
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                c = line[i];
                break;
            }

        }
        return c;

    }
    public static void main (String args[]){
            firstRepeatedCharinArray obj=new firstRepeatedCharinArray();
          char result=  obj.taskarray();
            System.out.println(result);


           char a= obj.repeat1();
           System.out.println(a);
        }
}
