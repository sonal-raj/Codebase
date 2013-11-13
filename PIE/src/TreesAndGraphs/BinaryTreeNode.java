package TreesAndGraphs;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 09/11/13
 * Time: 00:24
 * To change this template use File | Settings | File Templates.
 */
public class BinaryTreeNode {
    private BinaryTreeNode left, right;
    private int value;

    public BinaryTreeNode(BinaryTreeNode left, BinaryTreeNode right, int data)
    {
        this.left=left;
        this.right=right;
        this.value=data;
    }
    public BinaryTreeNode getLeft() {return left;}
    public  BinaryTreeNode getRight() {return right;}
    public int getData() {return value;}
    public void setLeft(BinaryTreeNode l) {left=l;}
    public  void setRight(BinaryTreeNode r) {right=r;}

}
