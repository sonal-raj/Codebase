package TreesAndGraphs;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 14/11/13
 * Time: 03:31
 * To change this template use File | Settings | File Templates.
 */
public class IsBalancedTree {
    /*
        Implement a function to check if a tree is balanced  For the purposes of this question,
        a balanced tree is defined to be a tree such that no two leaf nodes differ in distance
        from the root by more than one
     */

    public boolean isBalanced(BSTNode root)
    {
        int min = minDepth(root);
        int max = maxDepth(root);
        if(Math.abs(max-min)>1)
            return false;
        else
            return true;
    }

    public int minDepth(BSTNode root)
    {
        if(root==null)
            return 0;
        else
            return 1+Math.min(minDepth(root.left()), minDepth(root.right()));
    }

    public int maxDepth(BSTNode root)
    {
        if(root==null)
            return 0;
        else
            return 1+Math.max(maxDepth(root.left()), maxDepth(root.right()));
    }
}
