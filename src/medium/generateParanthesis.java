package medium;
import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by ashishsowmya on 9/18/18.
 */
public class generateParanthesis {
    public List<String> generateParenthesis(int n) {
        ArrayList<String> result = new ArrayList<String>();
        dfs(result, "", n, n);
        return result;
    }
    /*
    left and right represents the remaining number of ( and ) that need to be added.
    When left > right, there are more ")" placed than "(". Such cases are wrong and the method stops.
    */
    public void dfs(ArrayList<String> result, String s, int left, int right){
        if(left > right)
            return;

        if(left==0&&right==0){
            result.add(s);
            return;
        }

        if(left>0){
            dfs(result, s+"(", left-1, right);
        }

        if(right>0){
            dfs(result, s+")", left, right-1);
        }
    }


    public static void main(String args[])
    {
        generateParanthesis obj = new generateParanthesis();
     List<String> str= obj.generateParenthesis(3);

     for(int i=0;i<3;i++)
     {
         System.out.println(str.get(i));
     }

    }


}
