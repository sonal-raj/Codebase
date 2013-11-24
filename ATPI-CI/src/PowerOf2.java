/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 19/11/13
 * Time: 19:56
 * To change this template use File | Settings | File Templates.
 */
public class PowerOf2 {
    public static boolean isPowerOf2(int a)
    {
        //subtacting 1 inverts the bits int the number if divisible by 2
        return (a & (a-1))==0?true:false;
    }
}
