package TreesAndGraphs;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 15/11/13
 * Time: 00:51
 * To change this template use File | Settings | File Templates.
 */
public class IsSubtreeOf {
    /*
        You have two very large binary trees: T1, with millions of nodes, and T2, with hun-
        dreds of nodes   Create an algorithm to decide if T2 is a subtree of T1
     */
    public boolean containsTree(BSTNode t1, BSTNode t2)
    {
        if(t2==null)
            return true; //empty tree is always a subtree
        else
            return subTree(t1, t2);
    }

    public boolean subTree(BSTNode r1, BSTNode r2)
    {
        if(r1==null)
            return false; //big tree empty and small tree still not found
        //if roots match, check the remaining tree
        if(r1.value()==r2.value())
        {
            if(matchTree(r1,r2))
                return true;
        }
        //if no match yet, either left match or right match
        return (subTree(r1.left(),r2) || subTree(r1.right(),r2));
    }

    public boolean matchTree(BSTNode r1, BSTNode r2)
    {
        if(r1==null && r2==null)
            return true; //both trees empty at same time
        if(r1==null || r2==null)
            return false; //one tree has ended before the other
        if(r1.value()!=r2.value())
            return false;

        return((matchTree(r1.left(),r2.left()) && matchTree(r1.right(),r2.right())));
    }
}
