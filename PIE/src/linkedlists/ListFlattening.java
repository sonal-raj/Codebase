package linkedlists;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 08/11/13
 * Time: 22:50
 * To change this template use File | Settings | File Templates.
 */
public class ListFlattening {

    public void flattenList(DoublyLLNode<Integer> head, DoublyLLNode<Integer> tail)
    {
        DoublyLLNode<Integer> curNode = head;
        /*
        while(curNode.hasChild())
        {
            append(curNode.child(), tail);
            curNode = curNode.right();
        }
        */

    }

    public void append(DoublyLLNode<Integer> child, DoublyLLNode<Integer> tail)
    {
        DoublyLLNode<Integer> curNode;

        tail.setRight(child);
        child.setLeft(tail);
        //find new tail
        for(curNode=child;curNode.right()!=null;curNode=curNode.right());
        //set new tail
        tail=curNode;
    }
}
