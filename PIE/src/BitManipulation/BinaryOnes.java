package BitManipulation;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 11/11/13
 * Time: 16:42
 * To change this template use File | Settings | File Templates.
 */
public class BinaryOnes {
    public int oneCountEasy(int n)
    {
        int count = 0;
        int mask = 1;
        while(n!=0)
        {
            if((n & mask)==1)
                count++;
            n = n>>>1;
        }
        return count;
    }

    public int oneCountBetter(int n)
    {
        int count = 0;
        while(n!=0)
        {
            n = n&(n-1);
            count++;
        }
        return count;
    }
}
