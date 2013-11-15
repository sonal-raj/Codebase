package ArraysAndStrings;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 12/11/13
 * Time: 01:56
 * To change this template use File | Settings | File Templates.
 */
public class ReverseString {
    //To reverse a CStyle string
    public String reverseString(String s)
    {
        char[] c = s.toCharArray();
        int start=0;
        int end = c.length-1;
        //swap values from both end till the pointers cross
        while(start<=end)
        {
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start++;
            end--;
        }
        return c.toString();

    }
}
