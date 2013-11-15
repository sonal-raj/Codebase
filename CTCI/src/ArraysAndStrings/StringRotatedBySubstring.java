package ArraysAndStrings;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 12/11/13
 * Time: 19:41
 * To change this template use File | Settings | File Templates.
 */
public class StringRotatedBySubstring {
    public static boolean isRotated(String s1, String s2)
    {
        s2 = s2+s2;
        if(isSubstring(s1,s2))
            return true;
        else
            return false;
    }
    public static boolean isSubstring(String s1, String s2)
    {
        //provide implementation
        return true;
    }
    public static void main(String[] args)
    {
        String s1="apple";
        String s2="pleap";
        isRotated(s1, s2);
    }
}
