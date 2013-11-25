package Recursion;

import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 20/11/13
 * Time: 21:37
 * To change this template use File | Settings | File Templates.
 */
public class PermutationArraySets {
    /**
     * There are n arrays. A permutation is generated when an element is selected from each array.
     How do you generate all permutations of n arrays?
     For example, permutations for the 3 arrays {1, 2}, {3, 4}, {5, 6} are: {1, 3, 5}, {1, 3, 6}, {1, 4, 5}, {1, 4, 6}, {2, 3, 5},
     {2, 3, 6}, {2, 4, 5}, and {2, 4, 6}.
     */
     void permute(ArrayList<int[]> arrays)
     {
         Stack<Integer> permutation = new Stack<Integer>();
         permuteCore(arrays, permutation);
     }

    void permuteCore(ArrayList<int[]> arrays, Stack<Integer> permutation)
    {
        if(permutation.size()==arrays.size()) //one from each array
        {
            System.out.println(permutation);
            return;
        }
        int[] array = arrays.get(permutation.size());
        for(int i=0;i<array.length;i++)
        {
            permutation.push(array[i]);
            permuteCore(arrays, permutation);
            permutation.pop();
        }
    }
}
