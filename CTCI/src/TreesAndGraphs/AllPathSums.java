package TreesAndGraphs;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 15/11/13
 * Time: 01:51
 * To change this template use File | Settings | File Templates.
 */
public class AllPathSums {
    /*
        You are given a binary tree in which each node contains a value   Design an algorithm
        to print all paths which sum up to that value   Note that it can be any path in the tree
        - it does not have to start at the root
     */

    public void findSum(BSTNode head, int sum, ArrayList<Integer> buffer,int level)
    {
        if(head==null)
            return;
        int temp = sum;
        buffer.add(head.value());
        for(int i=level;i>-1;i--)
        {
            temp = temp-buffer.get(i);
            if(temp==0)
                print(buffer, i, level);
        }
        ArrayList<Integer> c1 = (ArrayList<Integer>) buffer.clone();
        ArrayList<Integer> c2 = (ArrayList<Integer>) buffer.clone();
        findSum(head.left(), sum, c1, level+1);
        findSum(head.right(), sum, c2, level+1);
    }
    public void print(ArrayList<Integer> buffer, int i2, int level)
    {
        for(int i = i2;i<=level;i++)
            System.out.print(buffer.get(i)+" ");
        System.out.println();
    }
}
