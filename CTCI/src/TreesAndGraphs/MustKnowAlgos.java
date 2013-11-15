package TreesAndGraphs;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 13/11/13
 * Time: 17:00
 * To change this template use File | Settings | File Templates.
 */
public class MustKnowAlgos {
    public int height(BSTNode root)
    {
        if(root==null)
            return 0;
        return Math.max(height(root.left()),height(root.right()));
    }

    public void inOrderRecurse(BSTNode root)
    {
        if(root!=null)
        {
            inOrderRecurse(root.left());
            System.out.print(root.value()+" ");
            inOrderRecurse(root.right());
        }
    }

    public void preOrderRecurse(BSTNode root)
    {
        if(root!=null)
        {
            System.out.print(root.value()+" ");
            preOrderRecurse(root.left());
            preOrderRecurse(root.right());
        }
    }

    public void postOrderRecurse(BSTNode root)
    {
        if(root!=null)
        {
            postOrderRecurse(root.left());
            postOrderRecurse(root.right());
            System.out.print(root.value()+" ");
        }
    }

    public void levelOrderIter(BSTNode root)
    {
        if(root==null)
            return;
        Queue<BSTNode> nodesQueue = new ArrayDeque<BSTNode>();
        int nodesInCurrLevel = 1;
        int nodesInNextLevel = 0;
        nodesQueue.add(root);
        while(!nodesQueue.isEmpty())
        {
            BSTNode curr = nodesQueue.peek();
            nodesQueue.remove();
            nodesInCurrLevel--;
            if(curr!=null)
            {
                System.out.print(curr.value()+" ");//Process this node data
                nodesQueue.add(curr.left());
                nodesQueue.add(curr.right());
                nodesInNextLevel+=2;
            }
            if(nodesInCurrLevel==0) //Process of a level stuff
            {
                System.out.println(); //process data after a level
                nodesInCurrLevel=nodesInNextLevel;
                nodesInNextLevel=0;
            }
        }
    }

    public void inorderIter(BSTNode root)
    {
        Stack<BSTNode> s = new Stack<BSTNode>();
        BSTNode curr = root;
        while(!s.empty() || curr!=null)
        {
            if(curr!=null)
            {
                //keep going down leftwards
                s.push(curr);
                curr = curr.left();
            }
            else
            {
                BSTNode temp = s.pop();
                System.out.print(temp.value());
                curr = curr.right();
            }

        }
    }

    public void preorderIter(BSTNode root)
    {
        Stack<BSTNode> s = new Stack<BSTNode>();
        s.push(root);
        while(!s.isEmpty())
        {
            //node
            BSTNode temp = s.pop();
            System.out.println(temp.value()+" ");
            //left and right
            if(temp.right()!=null)
                s.push(temp.right());
            if(temp.left()!=null)
                s.push(temp.left());
        }
    }

    public  void postorderIter(BSTNode root)
    {
        Stack<BSTNode> s = new Stack<BSTNode>();
        s.push(root);
        BSTNode prev = null;
        while(!s.isEmpty())
        {
            BSTNode curr = s.peek();
            //if traversing down the tree
            if(curr!=null || curr==prev.left() || curr==prev.right())
            {
                if(prev.left()!=null)
                    s.push(prev.left());
                else if (prev.right()!=null)
                    s.push(prev.right());
                else
                {
                    System.out.print(curr.value());
                    s.pop();
                }
            }
            //if traversing up from left
            else if(prev==curr.left())
            {
                if(curr.right()!=null)
                    s.push(curr.right());
                else
                {
                    System.out.print(curr.value()+" ");
                    s.pop();
                }
            }
            //if traversing up from right
            else if(prev==curr.right())
            {
                System.out.print(curr.value());
                s.pop();
            }

            prev = curr;

        }
    }

    public void DFS()
    {

    }

    public void BFS()
    {

    }
}
