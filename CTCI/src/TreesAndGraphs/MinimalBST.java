package TreesAndGraphs;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 14/11/13
 * Time: 18:28
 * To change this template use File | Settings | File Templates.
 */
public class MinimalBST {

    /*
        Given a sorted (increasing order) array, write an algorithm to create a binary tree with
        minimal height
     */

    public BSTNode addToTree(int[] arr, int start, int end)
    {
        if(end<start)
            return null;
        int mid = (start+end)/2;
        BSTNode n = new BSTNode(arr[mid]);
        n.setLeft(addToTree(arr,start,mid-1));
        n.setRight(addToTree(arr,mid+1,end));
        return n;
    }
}
