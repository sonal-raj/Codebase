import java.util.Scanner;
import java.math.BigInteger;
/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 12/13/13
 * Time: 10:05 AM
 * To change this template use File | Settings | File Templates.
 */
public class FactorialZeroes {
    public static int factZeroes(int n)
    {
        int count = 0;
        if(n<0)
            return 0;
        for(int i = 5; (n/i)>0; i*=5)
            count = count+(n/i);
        return count;
    }

    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        while((t--)!=0)
        {
            int num = Integer.parseInt(s.nextLine());
            System.out.println(factZeroes(num));
        }
    }

}
