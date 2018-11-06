/**
 * Created by ashishsowmya on 4/22/18.
 */
public class Temperature {
    private int value;
    private char c;
    int celsius,fahreinheit;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }


    //contructors
    public Temperature()
    {

    }

    public Temperature(int value)
    {
       setValue(value);
    }
    public Temperature(char c)
    {
        setC(c);
    }

    public Temperature(int value,char c)
    {
        setValue(value);
        setC(c);
    }

    public int celsius(int value)
    {
            celsius = (5*(value-32))/9;
            return celsius;
    }
    public int fahreinheit(int value)
    {
        fahreinheit =(9*(c/5)) +32;
        return fahreinheit;
    }





    public static void main(String args[])
    {
        Temperature obj = new Temperature(10);
        //System.out.println(obj.getValue());
        int c =obj.fahreinheit(obj.getValue());
        System.out.println(c);


    }
}
