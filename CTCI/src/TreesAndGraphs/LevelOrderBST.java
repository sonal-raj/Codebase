package TreesAndGraphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 14/11/13
 * Time: 21:13
 * To change this template use File | Settings | File Templates.
 */
public class LevelOrderBST {

    /*
        Given a binary search tree, design an algorithm which creates a linked list of all the
        nodes at each depth (eg, if you have a tree with depth D, you’ll have D linked lists)
     */

    public static void levelOrderIter(BSTNode root)
    {
        if(root==null)
            return;
        Queue<BSTNode> nodes = new ArrayDeque<BSTNode>();
        int nodesInCurrLevel = 1;
        int nodesInNextLevel = 0;

        ArrayList<LinkedList<BSTNode>> lol = new ArrayList<LinkedList<BSTNode>>(); //to store the level lists
        LinkedList<BSTNode> list = new LinkedList<BSTNode>();
        list.add(root);
        lol.add(list);

        nodes.add(root);
        list=new LinkedList<BSTNode>();
        while(!nodes.isEmpty())
        {
            BSTNode curr = nodes.peek();
            nodes.remove();
            nodesInCurrLevel--;


            if(curr!=null)
            {
                list.add(curr); //process the current level node
                nodes.add(curr.left());
                nodes.add(curr.right());
                nodesInNextLevel+=2;
            }
            if(nodesInCurrLevel==0) //At the end of a level
            {
                lol.add(list); //Process end of level stuff
                list = new LinkedList<BSTNode>();
                nodesInCurrLevel = nodesInNextLevel;
                nodesInNextLevel=0;
            }
        }
    }

}
