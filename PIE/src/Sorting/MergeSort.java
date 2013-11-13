package Sorting;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 10/11/13
 * Time: 13:47
 * To change this template use File | Settings | File Templates.
 */
public class MergeSort {

    public int[] mergeSort(int[] arr)
    {
        //base case of recursion
        if(arr.length<2)
            return arr;

        //divide array into two subarrays
        int mid = arr.length/2;
        int[] left = new int[mid];
        int[] right = new int[arr.length-mid];

        System.arraycopy(arr,0,left,0,mid);
        System.arraycopy(arr,mid+1,right,0,arr.length-mid);

        //sort the sub arrays and merge the results
        mergeSort(left);
        mergeSort(right);

        return merge(arr,left,right);
    }

    public int[] merge(int[] dest, int[] left, int[] right)
    {
        int dind = 0, lind = 0, rind = 0;

        //copy till both arrays have elements
        while(lind<left.length && rind<right.length)
        {
            if(left[lind]<right[rind])
                dest[dind++]=left[lind++];
            else
                dest[dind++]=right[rind++];
        }
        //copy remaining elements of any of the arrays
        while(lind<left.length)
            dest[dind++]=left[lind++];
        while(rind<right.length)
            dest[dind++]=right[rind++];

        return dest;
    }
}
