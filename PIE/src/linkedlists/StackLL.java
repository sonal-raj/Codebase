package linkedlists;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 08/11/13
 * Time: 20:26
 * To change this template use File | Settings | File Templates.
 */
public class StackLL<T> {

    private SinglyLLNode<T> top;
    private int size, currSize;

    public void push(SinglyLLNode<T> top, T data) throws Exception
    {
        if(currSize==size)
            throw new Exception("Stack Overflow");
        SinglyLLNode<T> temp = new SinglyLLNode<T>(data);
        if(top==null)
            top=temp;
        else
        {
            temp.setNext(top.next());
            top=temp;
        }
        currSize++;
    }

    public T pop(SinglyLLNode<T> top) throws Exception
    {
        if(currSize==0)
            throw new Exception("Stack Underflow!");
        T toReturn = top.value();
        top.setNext(top.next());
        currSize--;
        return toReturn;
    }

    public SinglyLLNode<T> top()
    {
        return top;
    }

    public SinglyLLNode<T> createStack(int n)
    {
        top=null;
        size = n;
        currSize=0;
        return top;
    }

    public void deleteStack(SinglyLLNode<T> top) throws Exception
    {
        while(top!=null)
            pop(top);
    }

}
