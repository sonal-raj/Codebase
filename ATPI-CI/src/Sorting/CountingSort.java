package Sorting;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 20/11/13
 * Time: 12:48
 * To change this template use File | Settings | File Templates.
 */
public class CountingSort {
    //given all elements appear in the range 1 to n, implement counting sort
    public static void countingSort(int[] data, int n)
    {
        int[] map = new int[n+1];
        //assign all to zero
        for(int i=0;i<n;i++)
            map[i]=0;

        //asssign the frequency of each element in data to map
        for(int i=0;i<data.length;i++)
            map[data[i]]++;

        //change the content of data into sorted data
        int index=0;
        for(int i=0;i<n;i++)
            for(int j=0;j<map[i];j++)
                data[index++]=i;
    }
}
