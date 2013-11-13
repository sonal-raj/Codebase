package linkedlists;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 08/11/13
 * Time: 19:31
 * To change this template use File | Settings | File Templates.
 */

public class SinglyLLNode<T>
{
    private T data;
    private SinglyLLNode<T> next;

    public SinglyLLNode(T value)
    {
        data=value;
    }
    public T value()
    {
        return data;
    }
    public SinglyLLNode<T> next()
    {
        return next;
    }
    public void setNext(SinglyLLNode<T> n)
    {
        next=n;
    }
    public void setValue(T val)
    {
        data=val;
    }
}
