package Sorting;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 10/11/13
 * Time: 12:06
 * To change this template use File | Settings | File Templates.
 */
public class InsertionSort {

    public void  insertionSort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            int val = arr[i];
            for(int j =0;j<i;j++)
            {
                if(val<arr[j])
                {
                    System.arraycopy(arr,j,arr,j+1,i-j);
                    arr[i]=val;
                    break;
                }
            }
        }
    }
}
