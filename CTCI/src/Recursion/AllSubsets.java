package Recursion;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 15/11/13
 * Time: 21:54
 * To change this template use File | Settings | File Templates.
 */
public class AllSubsets {
    /**
     * Write a method that returns all subsets of a set
     */
    ArrayList<ArrayList<Integer>> getSubset(ArrayList<Integer> set)
    {
        ArrayList<ArrayList<Integer>> allsubsets = new ArrayList<ArrayList<Integer>>();
        int max = 1<<set.size(); //calculating 2^n
        for(int i=0;i<max;i++)
        {
            ArrayList<Integer> subset = new ArrayList<Integer>();
            int k = i;
            int index =0;
            while(k>0)
            {
                if((k&1)>0)
                    subset.add(set.get(index));
                k>>=1;
                index++;
            }
            allsubsets.add(subset);
        }
        return allsubsets;
    }
}
