package TreesAndGraphs;
import java.util.*;
/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 09/11/13
 * Time: 10:54
 * To change this template use File | Settings | File Templates.
 */
public class BinaryTreeOps {

    public int height(BinaryTreeNode n)
    {
        if(n==null)
            return 0;
        return 1+Math.max(height(n.getLeft()),height(n.getRight()));
    }

    public void preorderRecursion(BinaryTreeNode n)
    {
        if(n==null)
            return;
        System.out.println(n.getData());
        preorderRecursion(n.getLeft());
        preorderRecursion(n.getRight());
    }

    public void inorderRecursion(BinaryTreeNode n)
    {
        if(n==null)
            return;
        inorderRecursion(n.getLeft());
        System.out.println(n.getData());
        inorderRecursion(n.getRight());;
    }

    public void postorderRecursion(BinaryTreeNode n)
    {
        if(n==null)
            return;
        postorderRecursion(n.getLeft());
        postorderRecursion(n.getRight());
        System.out.println(n.getData());
    }

    public void preorderIteration(BinaryTreeNode n)
    {
        Stack<BinaryTreeNode> stack= new Stack<BinaryTreeNode>();
        stack.push(n);
        while(stack.size()>0)
        {
            BinaryTreeNode curr = stack.pop();
            System.out.println(curr.getData());
            BinaryTreeNode right = curr.getRight();
            if(right!=null)
                stack.push(right);
            BinaryTreeNode left = curr.getLeft();
            if(left!=null)
                stack.push(left);
        }
    }

    public void inorderIteration(BinaryTreeNode n)
    {
        Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
        BinaryTreeNode curr = n;
        while(stack.size()>0 || curr!=null)
        {
            if(curr!=null)
            {
                stack.push(curr);
                curr = curr.getLeft();
            }
            else
            {
                curr = stack.pop();
                System.out.println(curr.getData());
                curr = curr.getRight();
            }

        }
    }

    public void postorderIterative(BinaryTreeNode n)
    {
        if(n==null)
            return;
        Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
        stack.push(n);
        BinaryTreeNode prev = null;
        while(stack.size()>0)
        {
            //get the top element
            BinaryTreeNode curr = stack.peek();
            //check if traversing down;
            if(curr!=null || curr==prev.getLeft() || curr==prev.getRight())
            {
                if(curr.getLeft()!=null)
                    stack.push(curr.getLeft());
                else if(curr.getRight()!=null)
                    stack.push(curr.getRight());
                else
                {
                    System.out.println(curr.getData());
                    stack.pop();
                }
            }
            //check if traversing up from left
            else if(prev == curr.getLeft())
            {
                if(curr.getRight()!=null)
                    stack.push(curr.getRight());
                else
                {
                    System.out.println(curr.getData());
                    stack.pop();
                }
            }
            //check if traversing up fron right
            else if(prev==curr.getRight())
            {
                System.out.println(curr.getData());
                stack.pop();
            }

            prev = curr;
        }
    }

    public static BinaryTreeNode rotateRight( BinaryTreeNode oldRoot ){
        BinaryTreeNode newRoot = oldRoot.getLeft();
        oldRoot.setLeft( newRoot.getRight() );
        newRoot.setRight( oldRoot );
        return newRoot;
    }
}
