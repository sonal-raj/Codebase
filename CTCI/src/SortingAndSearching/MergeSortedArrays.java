package SortingAndSearching;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 16/11/13
 * Time: 18:21
 * To change this template use File | Settings | File Templates.
 */
public class MergeSortedArrays {
    /**
     * You are given two sorted arrays, A and B, and A has a large enough buffer at the end
       to hold B  Write a method to merge B into A in sorted order
     */

    public void merge(int[] a, int[] b, int m, int n)
    {
        int k = m+n-1; //last index of the first array
        int i = m-1; //last element of first array
        int j = n-1; //last element of the second array

        while(i>0 && j>0)
            {if(a[i]>b[j])
                {
                    a[k--]=a[i--];
                }
            else
                {
                    a[k--]=b[j--];
                }
            }
            if(j>0)
                a[k--]=b[j--];
    }
}

