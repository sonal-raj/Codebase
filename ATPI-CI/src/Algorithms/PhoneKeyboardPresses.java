package Algorithms;

import java.util.Arrays;
/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 20/11/13
 * Time: 16:13
 * To change this template use File | Settings | File Templates.
 */
public class PhoneKeyboardPresses {
    /**
     * Please design an efficient algorithm to lay out cells on phone keyboards in order to minimize
     key presses.
     The current phone keyboard looks like the following layout:
     key 2: abc   key 3: def
     key 4: ghi   key 5: jkl   key 6: mno
     key 7: pqrs  key 8: tuv   key 9: wxyz
     */
    int MinKeyPress(int keys, int[] frequencies) {
        Arrays.sort(frequencies);

        int letters = frequencies.length;
        int presses = 0;

        // The last element has the highest frequency in
        // an increasingly sorted array
        for(int i = letters - 1; i >= 0; --i) {
            int j = letters - 1 - i;
            presses += frequencies[i] * (j / keys + 1);
        }

        return presses;
    }
}
