package BitManipulation;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 15/11/13
 * Time: 13:27
 * To change this template use File | Settings | File Templates.
 */
public class SwapEvenOddBits {
    /**
     *  Write a program to swap odd and even bits in an integer with as few instructions as
         possible (e g , bit 0 and bit 1 are swapped, bit 2 and bit 3 are swapped, etc)
     */
    public int swapBits(int n)
    {
        return (((n & 0xAAAAAAAA)>>1)|((n & 0x55555555)<<1));
    }
}
