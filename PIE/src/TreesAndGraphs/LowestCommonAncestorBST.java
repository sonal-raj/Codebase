package TreesAndGraphs;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 09/11/13
 * Time: 14:25
 * To change this template use File | Settings | File Templates.
 */
public class LowestCommonAncestorBST {

    public Integer LCA(BinaryTreeNode root, int value1, int value2)
    {
        while(root!=null)
        {
            int val = root.getData();
            if(value1<val && value2<val)
                root=root.getLeft();
            else if(value1>val && value2>val)
                root=root.getRight();
            else
                return root.getData();
        }
        return null;
    }
}
