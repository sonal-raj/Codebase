package Moderate;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 17/11/13
 * Time: 19:10
 * To change this template use File | Settings | File Templates.
 */
public class MaxWithoutIf {
    /**
     *  Maximun of two number swithout using if-else
     */
    public int max(int a, int b)
    {
        int c = a-b;
        int k = (c>>31) & 0x1;
        return (a-k*c);
    }
}
