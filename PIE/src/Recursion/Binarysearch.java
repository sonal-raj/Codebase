package Recursion;
import java.util.*;
/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 10/11/13
 * Time: 00:27
 * To change this template use File | Settings | File Templates.
 */

//Perform binary search on sorted array

public class Binarysearch {

    public int BinarySearchIterative(int[] arr, int target) throws Exception
    {
        int low=0, high=arr.length;
        int mid;
        if(low>high)
            throw new Exception("Range is reversed!!");
        while(true)
        {
            if(low==high && arr[low]!=arr[high])
                throw new Exception("Element not in Array!!");
            else if(arr[low]>arr[high])
                throw new Exception("Array not sorted!!!");

            //operations to find element
            mid = low+(high-low)/2;
            if(arr[mid]==target)
                return mid;
            else if(target<arr[mid])
                high=mid-1;
            else if (target>arr[mid])
                low=mid+1;
        }
    }

    public int BinarySearchRecursive(int[] arr, int target, int low, int high) throws Exception
    {
        //special cases
        if(low>high)
            throw new Exception("Limits Reversed!");
        else if(low==high && arr[low]!=arr[high])
            throw new Exception("Element not in array!!");
        if(arr[low]>arr[high])
            throw new Exception("Array not sorted!!!");

        //operations to recurse
        int mid = low+(high-low)/2;
        if(arr[mid]==target) //base case
            return mid;
        else if(target<arr[mid])
            return BinarySearchRecursive(arr, target, low, mid-1);
        else if(target>arr[mid])
            return BinarySearchRecursive(arr, target, mid+1, high);

        return 0;
    }
}
