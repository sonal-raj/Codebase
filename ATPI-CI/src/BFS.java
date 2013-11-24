import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 19/11/13
 * Time: 15:48
 * To change this template use File | Settings | File Templates.
 */
class BinaryTree
{
    public int Value;
    public BinaryTree Left;
    public BinaryTree Right;
    public BinaryTree(int n) {Value = n;}
    public BinaryTree getLeft() {return Left;}
    public BinaryTree getRight() {return Right;}
    public void setLeft(BinaryTree l) {Left = l;}
    public void setRight(BinaryTree r) {Right = r;}
}

public class BFS {

    public boolean BFS(BinaryTree root, int searchFor)
    {
        Queue<BinaryTree> queue = new ArrayDeque<BinaryTree>();
        queue.add(root);
        while(queue.size()>0)
        {
            BinaryTree curr = queue.remove();
            if(curr==null)
                 continue;
            queue.add(curr.getLeft());
            queue.add(curr.getRight());
            if(curr.Value == searchFor)
                return true;
        }
        return false;
    }

}
