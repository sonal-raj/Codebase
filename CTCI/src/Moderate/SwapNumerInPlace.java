package Moderate;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 17/11/13
 * Time: 18:22
 * To change this template use File | Settings | File Templates.
 */
public class SwapNumerInPlace {

    /**
     * Write a function to swap a number in place without temporary variables
     */

    public static void swap(int a, int b)
    {
        //method 1
        a = a+b;
        b = a-b;
        a = a-b;
        //method 2
        a = a^b;
        b = a^b;
        a = a^b;
    }
}
