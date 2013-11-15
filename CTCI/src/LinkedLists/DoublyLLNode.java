package LinkedLists;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 12/11/13
 * Time: 19:55
 * To change this template use File | Settings | File Templates.
 */
public class DoublyLLNode<T> {
    private T data; //data stored
    private DoublyLLNode next, prev; //pointers to next and prev
    //constructor
    public DoublyLLNode(T val)
    {
        data = val;
    }
    //get the next pointer
    public DoublyLLNode next()
    {
        return next;
    }
    //get the previous pointer
    public DoublyLLNode prev()
    {
        return prev;
    }
    //get the value of data
    public T value()
    {
        return data;
    }
    //set the data
    public void setData(T val)
    {
        data = val;
    }
    //set the next pointer
    public void setNext(DoublyLLNode n)
    {
        next = n;
    }
    //set the prev pointer
    public void setPrev(DoublyLLNode p)
    {
        prev = p;
    }
}
