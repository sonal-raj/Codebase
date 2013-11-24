package Trees;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 20/11/13
 * Time: 17:38
 * To change this template use File | Settings | File Templates.
 */
public class SubTree {
    /**
     * Given two binary trees, please check whether one is a substructure of the other.
     */
     boolean hasSubtree(BSTNode root1, BSTNode root2)
     {
         boolean result = false;

         if(root1!=null && root2!=null)
         {
             if(root1.value()== root2.value())
                 result = doesTree1HaveTree2(root1, root2);
             if(!result)
                 result = doesTree1HaveTree2(root1.left(), root2);
             if(!result)
                 result = doesTree1HaveTree2(root1.right(), root2);
         }
         return result;
     }

    public boolean doesTree1HaveTree2(BSTNode root1, BSTNode root2)
    {
         if(root1==null)
             return false;
        if(root2==null)
            return false;
        if(root1.value()!=root2.value())
            return false;
        return doesTree1HaveTree2(root1.left(), root2.left())
                && doesTree1HaveTree2(root1.right(), root2.right());
    }
}
