package TreesAndGraphs;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 13/11/13
 * Time: 17:03
 * To change this template use File | Settings | File Templates.
 */
public class BSTNode {
    private int data;
    private BSTNode left, right, parent;
    public BSTNode(int n)
    {
        data = n;
        left = null;
        right = null;
        parent = null;
    }
    public int value()  {return data;}
    public BSTNode left() {return left;}
    public BSTNode right() {return right;}
    public void setLeft(BSTNode n) {left = n;}
    public void setRight(BSTNode n) {right = n;}
    public BSTNode parent() {return parent;}
}
