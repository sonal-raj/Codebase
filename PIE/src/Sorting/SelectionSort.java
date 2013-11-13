package Sorting;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 10/11/13
 * Time: 11:51
 * To change this template use File | Settings | File Templates.
 */
public class SelectionSort {

    public void selectionSort(int[] arr, int start)
    {
        if(start<arr.length-1)
        {
            swap(arr, start, findMin(arr, start));
            selectionSort(arr, start+1);
        }
    }

    public void swap(int[] arr, int start, int end)
    {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public int findMin(int[] arr, int start)
    {
        int min = arr[++start];
        for(int i=start+1;i<=arr.length;i++)
        {
            if(arr[i]<min)
                min=arr[i];
        }
        return min;
    }

}
