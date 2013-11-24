import java.util.Stack;
/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 19/11/13
 * Time: 16:03
 * To change this template use File | Settings | File Templates.
 */

public class DFS {

    public boolean DFSRecurse(BinaryTree root, int searchFor)
    {
        if(root==null)
            return false;

        if(root.Value==searchFor)
            return true;

        return DFSRecurse(root.Left, searchFor)||DFSRecurse(root.Right, searchFor);
    }

    public boolean DFSIterative(BinaryTree root, int searchFor)
    {
        Stack<BinaryTree> nodeStack = new Stack<BinaryTree>();
        nodeStack.push(root);
        while(nodeStack.size()>0)
        {
            BinaryTree curr = nodeStack.pop();

            if(curr.Value == searchFor)
                return true;

            if(curr.Right!=null)
                nodeStack.push(curr.Right);

            if(curr.Left!=null)
                nodeStack.push(curr.Left);
        }
        return false;
    }
}
