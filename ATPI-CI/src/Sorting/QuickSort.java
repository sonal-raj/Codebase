package Sorting;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 20/11/13
 * Time: 12:54
 * To change this template use File | Settings | File Templates.
 */
public class QuickSort {
    // Program to implement the quick sort algorithm (in place - without any extra space)

    public static void quicksort(int[] data, int start, int end)
    {
       if(data.length<2)
           return;

        int pindex = (start+end)/2;
        int pivot = data[pindex] ;
        swap(data, pindex, end);

        int l=0, r=end-1;
        while(l<r)
        {
            while(data[l]<=pivot)
                l++;
            while(data[r]>=pivot)
                r--;
            swap(data, l, r);
        }

        //put pivot in right place
        swap(data, pivot, l);

        quicksort(data, start, l-1);
        quicksort(data, l+1, end);
    }

    public static void swap(int[] data, int a, int b)
    {
        int temp = data[a];
        data[a]=data[b];
        data[b] = temp;
    }

    public static void main(String[] args)
    {
        int[] a = {3,5,6,4,7,9,8,1,0,2};
        quicksort(a,0,a.length-1);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]);
    }

}
