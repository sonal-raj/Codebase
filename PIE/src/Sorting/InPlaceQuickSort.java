package Sorting;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 11/11/13
 * Time: 00:06
 * To change this template use File | Settings | File Templates.
 */
public class InPlaceQuickSort {

    public void inPlaceQuickSort(int[] array, int left, int right)
    {
        int pivotValue = array[(left+right)/2];
        int i = left;
        int j = right;

        //swaps the mismatched values from bth sides
        while(i<j)
        {
            //Find leftmost value greater than or equal to pivot
            while(array[i]<pivotValue)
                i++;

            //Find rightmost value less than or equal to pivot
            while(array[j]>pivotValue)
                j--;

            //if both are in wrong order then swap them
            if(i<=j)
            {
                swap(array, i, j);
                i++;
                j--;
            }

            //apply to the remaining array
            if(left<j)
                inPlaceQuickSort(array, left, j);
            if(i<right)
                inPlaceQuickSort(array, i, right);
        }
    }

    public void swap(int[] array, int i, int j)
    {
        int temp=array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
