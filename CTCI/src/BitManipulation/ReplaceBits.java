package BitManipulation;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 15/11/13
 * Time: 03:39
 * To change this template use File | Settings | File Templates.
 */
public class ReplaceBits {
    /*
        You are given two 32-bit numbers, N and M, and two bit positions, i and j  Write a
        method to set all bits between i and j in N equal to M (e g , M becomes a substring of
        N located at i and starting at j)
        EXAMPLE:
        Input: N = 10000000000, M = 10101, i = 2, j = 6
        Output: N = 10001010100
     */
    public static int updateBits(int n, int m, int i, int j)
    {
        //All 1's
        int max=~0;
        //All 1's till j followed by zero
        int left = max-((1<<j)-1);
        //All 1's after i
        int right = (1<<i)-1;
        //Create the mask for space od replacement
        int mask = left|right;
        //And mask with space to make the required bits empty and then insert m
        return ((mask & n)|(m<<i));
    }
}
