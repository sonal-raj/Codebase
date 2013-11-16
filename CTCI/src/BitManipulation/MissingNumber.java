package BitManipulation;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 15/11/13
 * Time: 13:50
 * To change this template use File | Settings | File Templates.
 */
public class MissingNumber {
    /**
     *  An array A[1   n] contains all the integers from 0 to n except for one number which is
     missing   In this problem, we cannot access an entire integer in A with a single opera-
     tion   The elements of A are represented in binary, and the only operation we can use
     to access them is “fetch the jth bit of A[i]”, which takes constant time   Write code to
     find the missing integer   Can you do it in O(n) time?
     */
    public int findMissing(ArrayList<BitInteger> input, int column)
    {
        if(column<0) //base case and error condition
            return 0;
        ArrayList<BitInteger> oddIndices = new ArrayList<BitInteger>();
        ArrayList<BitInteger> evenIndices = new ArrayList<BitInteger>();
        for(BitInteger t:input)
        {
            if(t.fetch(column)==0)
                evenIndices.add(t);
            else
                oddIndices.add(t);
        }
        if(oddIndices.size()>=evenIndices.size())
            return (findMissing(evenIndices,column-1))<<1|0;
        else
            return (findMissing(oddIndices, column-1))<<1|1;

    }

}

//Custom BitInteger class
class BitInteger {
    public static int INTEGER_SIZE;
    private boolean[] bits;
    public BitInteger() {
        bits = new boolean[INTEGER_SIZE];
    }
    /* Creates a number equal to given value. Takes time proportional
     * to INTEGER_SIZE. */
    public BitInteger(int value){
        bits = new boolean[INTEGER_SIZE];
        for (int j = 0; j < INTEGER_SIZE; j++){
            if (((value >> j) & 1) == 1) bits[INTEGER_SIZE - 1 - j] = true;
            else bits[INTEGER_SIZE - 1 - j] = false;
        }
    }

    /** Returns k-th most-significant bit. */
    public int fetch(int k){
        if (bits[k]) return 1;
        else return 0;
    }

    /** Sets k-th most-significant bit. */
    public void set(int k, int bitValue){
        if (bitValue == 0 ) bits[k] = false;
        else bits[k] = true;
    }

    /** Sets k-th most-significant bit. */
    public void set(int k, char bitValue){
        if (bitValue == '0' ) bits[k] = false;
        else bits[k] = true;
    }

    /** Sets k-th most-significant bit. */
    public void set(int k, boolean bitValue){
        bits[k] = bitValue;
    }

    public void swapValues(BitInteger number) {
        for (int i = 0; i < INTEGER_SIZE; i++) {
            int temp = number.fetch(i);
            number.set(i, this.fetch(i));
            this.set(i, temp);
        }
    }

    public int toInt() {
        int number = 0;
        for (int j = INTEGER_SIZE - 1; j >= 0; j--){
            number = number | fetch(j);
            if (j > 0) {
                number = number << 1;
            }
        }
        return number;
    }
}