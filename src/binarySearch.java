import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.lang.Integer.*;

/**
 * Created by Sowmya on 4/22/18.
 */
public class binarySearch {

    int count=0;
    int count1=0;
    class Node
    {
        int key;
        Node left,right;
        public Node(int item) {
            key = item;
            left = right = null;
        }
    }Node root;


    public binarySearch()
    {
        root =null;
    }

    public Node insert_new_node(Node root, int key)
    {

        if(root == null)
        {
            root = new Node(key);
            return root;
        }
        else if(key<root.key)
        {
            root.left = insert_new_node(root.left,key);

        }
        else if(key > root.key)
        {
            root.right = insert_new_node(root.right,key);
        }
        return root;
    }


    public void insert (int key)
    {
        root = insert_new_node(root, key);
    }


    public boolean Search(ArrayList<Integer> array,int left,int right,int searchElelemt) {

        boolean flag = false;
        if (right >= left) {
            int median = left + (right - left) / 2;
            if (array.get(median) == searchElelemt) {
                flag = true;

            }
            if(left == right && flag == false)
            {
                System.out.println("Count is" +count);
                flag = false;
                return false;
            }

            else if (searchElelemt < array.get(median)) {
              count=  count+1;

                return Search(array, left, median - 1, searchElelemt);

            } else if (searchElelemt > array.get(median)) {
                count=  count+1;

                return Search(array, median + 1, right, searchElelemt);
            }
        }
        System.out.println("Count is " + count);
        return flag;
        }



    public boolean searchInterpolation(ArrayList<Integer> ar,int low,int high,int searchElement)
        {
            boolean flag = false;
            if (low <= high)
            {

                int v= searchElement;
                int medianInterpolation = (int) Math.ceil( low + (((high-low) /
                        (ar.get(high)-ar.get(low)))*(v - ar.get(low))));

//                int temp = v - ar.get(low);
//                int diff = (high-low);
//                int ardiff = ar.get(high) - ar.get(low);
//
//                int medianInterpolation = low + ((temp*diff)/ardiff);

//                if(medianInterpolation >ar.get(ar.size()-1))
//                {
//                    flag = false;
//                    return false;
//                }

                if(searchElement == ar.get(medianInterpolation))
                {
                    flag  = true;

                }
                else if(searchElement < ar.get(medianInterpolation))
                {
                    count1 = count1+1;
                  return  searchInterpolation(ar,low,medianInterpolation-1,v);
                }
                else if(searchElement > ar.get(medianInterpolation))
                {
                    count1 =count1+1;
                    return searchInterpolation(ar,medianInterpolation+1,high,v);
                }
            }
            System.out.println("Count is "+count1);
            return flag;
        }



    void inorder()  {
        inorderRec(root);
    }

    // this function prints the elements in increasing order: left root right
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
          //  System.out.println(root.key);
            inorderRec(root.right);
        }
    }




    public boolean Searchfloat(ArrayList<Float> array,int left,int right,double searchElelemt) {

        boolean flag = false;
        if (right >= left) {

            int median = left + (right - left) / 2;

            if (array.get(median) == searchElelemt) {
                flag = true;

            }
            if(left == right && flag == false)
            {
                flag = false;
                return false;
            }

            else if (searchElelemt < array.get(median)) {
                count=  count+1;

                return Searchfloat(array, left, median - 1, searchElelemt);

            } else if (searchElelemt > array.get(median)) {
                count=  count+1;

                return Searchfloat(array, median + 1, right, searchElelemt);
            }
        }
        System.out.println("Count is "+count);
        return flag;
    }


    public boolean searchfloatInterpolation(ArrayList<Float> ar,int low,int high,double searchElement)
    {
        boolean flag = false;
        if (low <= high)
        {

            double v= searchElement;
            int medianInterpolation = (int) Math.ceil( low + (((high-low) /
                    (ar.get(high)-ar.get(low)))*(v - ar.get(low))));

//            if(medianInterpolation >ar.get(ar.size()-1))
//            {
//                flag = false;
//                return false;
//            }

            if(searchElement == ar.get(medianInterpolation))
            {
                flag  = true;

            }
            else if(searchElement < ar.get(medianInterpolation))
            {
                count1 = count1+1;
                return  searchfloatInterpolation(ar,low,medianInterpolation-1,v);
            }
            else if(searchElement > ar.get(medianInterpolation))
            {
                count1 =count1+1;
                return searchfloatInterpolation(ar,medianInterpolation+1,high,v);
            }
        }
        System.out.println("count is "+count1);
        return flag;
    }




    public static void main(String args[])
{
    ArrayList<String > numberList = new ArrayList<>();
    try
    {
        InputStream file = new FileInputStream("/Users/ashishsowmya/Desktop/lor engg.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(file));
        String sCurrentLine;//Contents of each line in a string is stored in arraylist


        //3 Arraylists for 3 datasets
        ArrayList<Integer> ar = new ArrayList<Integer>(2000);
        ArrayList<Integer> ar0 = new ArrayList<Integer>(2000);
        ArrayList<Float> ar2 = new ArrayList<Float>(2000);

        while ((sCurrentLine = br.readLine())!= null)
        {
            if(sCurrentLine!=null)
            {
                String strArray[] = sCurrentLine.split("\t");
                //1st column
                if(strArray !=null && strArray[0] != null ) {
                    Integer value1 = Integer.parseInt(strArray[0]);
                    if(value1 != null)
                    {
                        ar0.add(value1);
                    }
                }


                //2nd column
                if(strArray!=null && strArray[1]!=null)
                {
                    Integer value = Integer.parseInt(strArray[1]);
                    if(value != null){
                        ar.add(value);
                    }
                }


                //3rd column
                if(strArray != null && strArray[2] !=null)
                {

                   float value3=0;
                   value3 = Float.valueOf(strArray[2]);
                   if(value3 != 0)
                   {
                       ar2.add(value3);
                   }
                }
            }
        }
        br.close();


        //creating binary tree for column1 and inserting elements from arraylist(ar0) with median as root
        binarySearch obj1 = new binarySearch();
        int arraylength0 = (ar0.size()-1)/2;
        double median0 = ar.get(arraylength0);
        obj1.insert((int)median0);
        for(int i=0;i<=ar0.size()-1;i++)
        {
            obj1.insert(ar0.get(i));
        }
        obj1.inorder();



        //creating binary tree for column2 and inserting elements from arraylist(ar) with median as root
        binarySearch obj = new binarySearch();

        int arraylength = (ar.size()-1)/2;
        double median = ar.get(arraylength);
        obj.insert ( (int)median);
        for(int i=0;i<=ar.size()-1;i++)
        {
            obj.insert(ar.get(i));
        }
        obj.inorder();


        //   creating tree for column3 and inserting elements from arraylist(ar2) with median as root
        binarySearch obj2 = new binarySearch();
        int arraylength2 =(int) (ar2.size()-1)/2;
        double median2 =ar2.get(arraylength2);
        obj2.insert((int)median2);
        for(int i=0;i<ar2.size()-1;i++) {
            double arrayValue = ar2.get(i);
            obj2.insert((int) arrayValue);
        }






        //binary search method return true if found else return false or column1
        int left0 = 0;
        int right0 = ar0.size()-1;
        //boolean flag0 = obj1.Search(ar0,left0,right0,2000);
       // System.out.println(flag0);

        //interpolation search method: return true if found else return false for column1
        int low0=0;
        int high0 = ar0.size()-1;
       // boolean flag01 = obj1.searchInterpolation(ar0,low0,high0,2000);
       // System.out.println(flag01);



        //binary search method and return flag(true or false) for column2

        int right = ar.size();
        int left =0;
         boolean flag= obj.Search(ar,left,right,1232);
         System.out.println(flag);


        //interpolation search method and return flag(true or false)
        int low = 0,high = ar.size()-1;
        boolean flag1 = obj.searchInterpolation(ar,low,high,1232);
        System.out.println(flag1);



        //binary and interpolation search for column3

        int left2 = 0;
        int right2 = ar2.size()-1;
      //  boolean flag2 = obj.Searchfloat(ar2,left2,right2, 0.036778096);
       // System.out.println(flag2);


        int low2=0;
        int hight2 = ar2.size()-1;
       // boolean flag02 = obj.searchfloatInterpolation(ar2,low,high,0.036778096);
        //System.out.println(flag02);



    } catch (IOException e)
    {
        System.out.println("No such file exists");
    }
}

}
