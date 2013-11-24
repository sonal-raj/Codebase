/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 19/11/13
 * Time: 19:47
 * To change this template use File | Settings | File Templates.
 */
public class CompareWithoutComparison {

    public static int min(int a, int b)
    {
        return a+((a-b)&((a-b)>>(31)));
    }

    public static int max(int a, int b)
    {
        return b+((a-b)&((a-b)>>(31)));
    }
}
