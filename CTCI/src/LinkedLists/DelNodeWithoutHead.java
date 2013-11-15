package LinkedLists;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 12/11/13
 * Time: 20:38
 * To change this template use File | Settings | File Templates.
 */
public class DelNodeWithoutHead {

    public static void deleteNode(SinglyLLNode<Integer> node)
    {
        if(node==null || node.next()==null)
            return;
        while(node.next()!=null)
        {
            node.setValue(node.next().value());
            node = node.next();
            if(node.next().next()==null)
                node.setNext(null);
        }

    }
}
