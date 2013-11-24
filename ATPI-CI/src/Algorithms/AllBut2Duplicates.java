package Algorithms;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 20/11/13
 * Time: 16:32
 * To change this template use File | Settings | File Templates.
 */
class numbersOccuringOnce
{
    public int num1;
    public int num2;
}
public class AllBut2Duplicates {
    /**
     * Let’s assume all numbers except two occur twice in an array. How do you get those two
     numbers to occur only once in O(n) time and O(1) space?
     For example, only two numbers, 4 and 6, in the array {2, 4, 3, 6, 3, 2, 5, 5} occur once, and the others numbers
     occur twice. Therefore, the output should be 4 and 6.
     */

    //to check whether bit with indexNumber is 1
    public boolean isBit1(int num, int indexbit)
    {
        num=num>>indexbit;
        return (num&1)==1;
    }

    //find ist 1 bit from rightmost
    public int findFirstBit1(int num)
    {
        int indexbit = 0;
        while(((num&1)==0)&&indexbit<32)
        {
            num = num>>1;
            ++indexbit;
        }
        return indexbit;
    }

    //get the distinct numbers
    public void getDistinct(int num[], numbersOccuringOnce once)
    {
        if(num.length<2)
            return;

        int resultXOR = 0;
        for(int i = 0;i<num.length;i++)
            resultXOR^=num[i];

        int indexof1 = findFirstBit1(resultXOR);

        once.num1 = once.num2 = 0;
        for(int j = 0;j<num.length;j++)
        {
            if(isBit1(num[j], indexof1))
                once.num1^=num[j];
            else
                once.num2^=num[j];
        }
    }

}
