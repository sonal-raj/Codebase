package Trees;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 20/11/13
 * Time: 18:00
 * To change this template use File | Settings | File Templates.
 */
public class MirroredTree {
    /**
     * Given a binary tree, how do you get its mirrored tree?
     */
     public void mirrorRecursively(BSTNode root)
     {
         if(root==null)
             return;
         if(root.left()==null && root.right()==null)
             return;

         BSTNode temp = root.left();
         root.setLeft(root.right());
         root.setRight(temp);

         if(root.left()!=null)
             mirrorRecursively(root.left());
         if(root.right()!=null)
             mirrorRecursively(root.right());
     }
}
