package Hard;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 18/11/13
 * Time: 11:47
 * To change this template use File | Settings | File Templates.
 */
public class Count2sInNumber {
    /**
     * Write a method to count the number of 2s between 0 and n
     */

    public static int count2s(int n)
    {
        //base case
        if(n==0)
            return 0;

        //break into first digit and remainder
        int power=1;
        while(10*power<n)
            power*=10;
        int first = n/10;
        int remainder = n%10;

        //Count number of 2's due to first digit
        int num2s = 0;
        if(first>2)
            num2s = num2s+power;
        else
            num2s = num2s+remainder+1;

        //count 2s from the other digits recursively
        int num2sother = power*count2s(power-1)+count2s(remainder);

        //return the total two's
        return num2sother;
    }
}
