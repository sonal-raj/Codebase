package BitManipulation;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 15/11/13
 * Time: 13:01
 * To change this template use File | Settings | File Templates.
 */
public class BitChanges {

    /**
     Write a function to determine the number of bits required to convert integer A to
     integer B
     Input: 31, 14
     Output: 2
     */

    public int minBitChanges(int m, int n)
    {
        int countBits = 0;
        //count the number of ones in m XOR n
        for(int i = m^n; i>0; i=i>>1)
            if((i & 1)==1)
                countBits++;
        return countBits;
    }
}
