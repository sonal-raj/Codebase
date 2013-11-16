package BitManipulation;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 15/11/13
 * Time: 12:16
 * To change this template use File | Settings | File Templates.
 */

public class NextWithSameOnes {
    /*
        Given an integer, print the next smallest and next largest number that have the same
        number of 1 bits in their binary representation
     */

    public boolean getBit(int n, int index)
    {
        return ((n&(1<<index))>0);
    }

    public int setBit(int n, int index, boolean b)
    {
        if(b) //if the inedx has to be made true (1)
        {
            return n|(1<<index);
        }
        else //if zero has to be set
        {
            int mask = ~(1<<index);
            return (n & mask);
        }
    }

    public int nextIntWithSameOnes(int n)
    {
        if(n<=0) return -1;

        int index = 0;
        int countOnes = 0;

        //Find the first one traversing right to left
        //while(getBit(n,index)!=1)
            index++;

        //Set the immediately following zero to one
        //while(getBit(n,index)!=0)
        {
            countOnes++;
            index++;
        }
        n = setBit(n, index, true);

        //Set the immediately preceeding one to zero
        index--;
        n = setBit(n, index, false);

        //Set the zeroes for pushing ones to the end
        //for(inr i = index-1;i>=countOnes;i--)
        //    n = setBit(n, i, false);

        //Push all remaining ones to the end
        for(int i = countOnes-1; i>=0; i--)
            n = setBit(n, i, true);

        return n;
    }

    public int prevIntWithSameOnes(int n)
    {
        if(n<=0) return -1;

        int index = 0;
        int countZeroes = 0;

        //find the first occurrence of zero
       // while(getBit(n,index)!=0)
            index++;

        //set the next one to zero
        //while(getBit(n, index)!=1)
        {
            index++;
            countZeroes++;
        }
        n = setBit(n, index, false);

        //set the prev zero to one
        index--;
        n = setBit(n, index, true);

        //set the ones
        for(int i = index-1; i>=countZeroes; i--)
            n = setBit(n, i, true);

        //set the zeroes
        for(int i = countZeroes-1; i>=0; i++)
            n = setBit(n, i, false);

        return n;
    }
}
