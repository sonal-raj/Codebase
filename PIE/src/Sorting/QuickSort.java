package Sorting;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 10/11/13
 * Time: 13:21
 * To change this template use File | Settings | File Templates.
 */

public class QuickSort {
    public int[] quickSort(int[] arr)
    {
        if(arr.length<2)
            return arr;

        int pivotIndex = arr.length/2;
        int pivot = arr[pivotIndex];

        //find number of elements less than the pivot
        int leftCount=0;
        for(int i=0;i<arr.length;i++)
            if(arr[i]<pivot)
                leftCount++;
        //create left and right arrays
        int left[] = new int[leftCount];
        int right[] = new int[arr.length-leftCount-1];

        //find left and right subarrays
        int l = 0, r = 0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==pivot)
                continue;
            if(arr[i]<pivot)
                left[l++]=arr[i];
            else
                right[r++]= arr[i];
        }

        //sort the subArrays
        left = quickSort(left);
        right = quickSort(right);

        //merge arrays and pivot back into original array
        System.arraycopy(left,0,arr,0,left.length);
        arr[left.length]=pivot;
        System.arraycopy(right,0,arr,left.length+1,right.length);

        return arr;
    }
}
