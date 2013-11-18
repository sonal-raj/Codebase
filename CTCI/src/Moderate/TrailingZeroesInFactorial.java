package Moderate;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 17/11/13
 * Time: 18:54
 * To change this template use File | Settings | File Templates.
 */
public class TrailingZeroesInFactorial {
    /**
     * Write an algorithm which computes the number of trailing zeros in n factorial
     */

    public static int factZeroes(int n)
    {
        int count = 0;
        if(n<0)
            return 0;
        for(int i = 5; (n/i)>0; i*=5)
            count = count+(n/i);
        return count;
    }
}
