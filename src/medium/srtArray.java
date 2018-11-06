package medium;

/**
 * Created by ashishsowmya on 9/24/18.
 */
public class srtArray {


    public void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }


    public static void main(String[] args) {
        srtArray obj = new srtArray();
        int x[] = {2, 4, 3, 1, 2,-9};
        obj.sort(x);
    }
    }
