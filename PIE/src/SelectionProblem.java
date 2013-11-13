/**
 * Selectio problem : Selecting the nth smallest element from an unordered, unsorted collection of n smallest elements
 * User: sonalraj
 * Date: 06/11/13
 * Time: 00:11
 */
import java.io.*;
import java.util.Random;

public class SelectionProblem {
    public static void select(int[] S, int k)
    {
        Integer L[] = new Integer[S.length];
        Integer E[] = new Integer[S.length];
        Integer G[] = new Integer[S.length];
        //Generate a random pivot
        Random rand = new Random();
        int pivot = rand.nextInt(S.length);

    }
}
