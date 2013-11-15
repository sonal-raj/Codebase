package TreesAndGraphs;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 14/11/13
 * Time: 21:48
 * To change this template use File | Settings | File Templates.
 */
public class NextInOrder {
    /*
        Write an algorithm to find the ‘next’ node (e g , in-order successor) of a given node in
        a binary search tree where each node has a link to its parent
     */
    public BSTNode successor(BSTNode n)
    {
        if(n.right()!=null)
        {
            //leftmost of the right child is the successor
            BSTNode temp = n.right();
            while(temp.left()!=null)
            {
                temp = temp.left();
            }
            return temp;
        }
        //if no right child, go back to parent
        else
        {
            BSTNode P = n.parent();//since node has link to parent
            if(n == P.right())
                return P;
            else
                return successor(P);
        }
    }
}
