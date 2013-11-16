package TreesAndGraphs;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 14/11/13
 * Time: 23:28
 * To change this template use File | Settings | File Templates.
 */
public class LowestCommonNodeBST {

    /*
        Design an algorithm and write code to find the first common ancestor of two nodes
        in a binary tree  Avoid storing additional nodes in a data structure   NOTE: This is not
        necessarily a binary search tree
     */

    //IF IT IS A BINARY TREE
    public BSTNode LCA(BSTNode root, BSTNode n1, BSTNode n2)
    {
        while(root!=null)
        {
            int val = root.value();
            if(val<n1.value() && val<n2.value())
                root = root.right();
            else if(val>n1.value() && val>n2.value())
                root = root.left();
            else
                return root;
        }
        return null;
    }

    //IF IT IS NOT A BINARY TREE   (Here BSTNOde is used but it means a General node)

    static int TWO_NODES_FOUND = 2;
    static int ONE_NODE_FOUND = 1;
    static int NO_NODES_FOUND = 0;

    // Checks how many “special” nodes are located under this root
    public int covers(BSTNode root, BSTNode n1, BSTNode n2)
    {
        int ret = NO_NODES_FOUND;
        if(root==null)
            return ret;
        if(root==n1 || root==n2)
            ret+=1;
        ret+=covers(root.left(), n1, n2);
        if(ret==TWO_NODES_FOUND)
            return ret;
        return ret=ret+covers(root.right(),n1,n2);
    }
    public BSTNode commonAncestor(BSTNode root, BSTNode n1, BSTNode n2)
    {
        //The trivial Case
        if(n1==n2 && (root.left()==n2 || root.right()==n2))
            return root;
        //Check the left side
        int nodesFromLeft = covers(root.left(), n1, n2);
        if(nodesFromLeft==TWO_NODES_FOUND)
        {
            if(root.left()==n1 || root.left()==n2)
                return root.left();
            else
                return commonAncestor(root.left(), n1, n2);
        }
        if(nodesFromLeft==ONE_NODE_FOUND)
        {
            if(root==n1 || root==n2)
                return root;
        }
        //Check from the right side
        int nodesFromRight = covers(root, n1, n2);
        if(nodesFromRight==TWO_NODES_FOUND)
        {
            if(root.right()==n1 || root.right()==n2)
                return root.right();
            else
                return commonAncestor(root.right(), n1, n2);
        }
        if(nodesFromRight==ONE_NODE_FOUND)
        {
            if(root==n1 || root==n2)
                return root;
        }
        //If one node on either side
        if(nodesFromLeft==ONE_NODE_FOUND && nodesFromRight==ONE_NODE_FOUND)
            return root;
        else
            return null;
    }
}
