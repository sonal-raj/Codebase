package LinkedLists;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 12/11/13
 * Time: 19:49
 * To change this template use File | Settings | File Templates.
 */
public class SinglyLLNode<T> {
    private T data;
    private SinglyLLNode next;
    //constructor
    public SinglyLLNode(T datum)
    {
        data = datum;
    }
    //get the value stored
    public T value()
    {
        return data;
    }
    //get the next element pointed to
    public SinglyLLNode<T> next()
    {
        return next;
    }
    //set the value of the node
    public void setValue(T val)
    {
        data=val;
    }
    //get the next pointer
    public void setNext(SinglyLLNode n)
    {
        next = n;
    }
}
