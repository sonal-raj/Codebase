package Moderate;
import java.util.Random;
/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 17/11/13
 * Time: 21:20
 * To change this template use File | Settings | File Templates.
 */
public class Random7with5 {
    /**
     * Method to generate randm numbers from 1 to 7 when method to generate rand 5 is available
     */
    public static int rand5()
    {
        Random rn = new Random();
        int min =1;
        int max = 5;
        return (min+rn.nextInt(max-min+1));
    }

    public static int rand7()
    {
        while(true)
        {
            int n = 5*(rand5()-1)+(rand5()-1); //a base 5 number that is larger
            if(n<21)
                return ((n%7)+1);
        }
    }
}
