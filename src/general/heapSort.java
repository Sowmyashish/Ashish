package general;

/**
 * Created by ashishsowmya on 10/12/18.
 */
public class heapSort {

    public int[] heap;
    public int maxSize;
    public int size;
    public heapSort(int maxSize)
    {
       heap= new int[maxSize];
       this.maxSize = maxSize;
       this.size = 0;
       heap[0] = Integer.MAX_VALUE;

    }

    private int parent(int pos)
    {

        return pos/2;
    }

    private int leftChild(int pos)
    {
        return 2*pos;
    }

    private int rightChild(int pos)
    {
        return (2*pos)+1;
    }
    public void insert(int a)
    {

     //starts from index 1, therefore ++size
        heap[++size] = a;
        int current =size;
          while(heap[current] > heap[parent(current)])
          {
              swap(current,parent(current));
          }
    }
    public void swap(int childPosition,int parentPosition)
    {
         int temp;
         temp =  heap[childPosition];
         heap[childPosition] = heap[parentPosition];
         heap[parentPosition] = temp;

    }

    public void remove()
    {

    }
    public void print()
    {
        for(int i=0;i<heap.length;i++)
        {
            System.out.println(heap[i]);
        }
    }


    public static void main(String args[])
    {
        heapSort obj = new heapSort(6);
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(5);
        obj.insert(25);
        obj.print();
    }

}
