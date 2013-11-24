package Trees;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 20/11/13
 * Time: 20:38
 * To change this template use File | Settings | File Templates.
 */
public class LevelOrder {
    /**
     * Please print a binary tree from its top level to bottom level, and print nodes at the same level
     from left to right.
     */
     public static void levelOrder(BSTNode root)
     {
         if(root==null)
             return;

         Queue<BSTNode> nodes = new ArrayDeque<BSTNode>();
         nodes.add(root);
         while(nodes.size()!=0)
         {
             BSTNode curr = nodes.remove();

             //process the node
             System.out.println(curr.value());

             if(curr.left()!=null)
                 nodes.add(curr.left());
             if(curr.right()!=null)
                 nodes.add(curr.right());
         }
     }

}
