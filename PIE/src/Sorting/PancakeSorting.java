package Sorting;
import java.util.*;
/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 11/11/13
 * Time: 00:39
 * To change this template use File | Settings | File Templates.
 */
public class PancakeSorting {

    public void pancakeSorting(int[] cakesize)
    {
        int bottom = 0;
        int top = cakesize.length-1;
        int lar = bottom; //position to insert the flipper

        while(bottom<(top-1))
        {
            //find flip position i.e. one with the largest element
            for(int i = bottom+1;i<=top;i++)
                if(cakesize[i]>cakesize[lar])
                    lar = i;
            //flip to get the largest on top
            flip(cakesize, lar, top);

            //flip to get the largest to correct place
            flip(cakesize, ++bottom, top);
        }

        //handle the last 2 pancakes
        if(cakesize[top]>cakesize[top-1])
        {
            int temp = cakesize[top];
            cakesize[top] = cakesize[top-1];
            cakesize[top-1] = temp;
        }
    }

    public void flip(int[] a, int start, int end)
    {
        while(start<=end)
        {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
}
