package SortingAndSearching;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 20/11/13
 * Time: 13:24
 * To change this template use File | Settings | File Templates.
 */
public class TurningNumber {
    /**
     * A turning number is the maximum number in a unimodal array that increases and then
     decreases. Please write a function (or a method) that finds the index of the turning number in a unimodal array.
     For example, the turning number in the array {1, 2, 3, 4, 5, 10, 9, 8, 7, 6} is 10, so its index 5 is the expected
     output.
     */

    public static int turningNum(int[] data)
    {
        if(data.length<=2)
            return -1;

        int left = 0;
        int right = data.length-1;
        while(right>left+1)
        {
            int middle = (left+right)/2;
            if(middle==0 || middle==data.length-1)
                return -1;

            if(data[middle]>data[middle-1] && data[middle]>data[middle+1])
                return middle;
            else if(data[middle]>data[middle-1] && data[middle]<data[middle+1])
                left = middle;
            else
                right = middle;
        }

        return -1;
    }
}
