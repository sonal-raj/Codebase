package linkedlists;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 08/11/13
 * Time: 19:41
 * To change this template use File | Settings | File Templates.
 */
public class DoublyLLNode<T> {
    private DoublyLLNode<T> left, right;
    private T data;

    public DoublyLLNode(T value)
    {
        data = value;
    }
    public DoublyLLNode<T> left()
    {
        return left;
    }
    public DoublyLLNode<T> right()
    {
        return right;
    }
    public T data()
    {
        return data;
    }
    public void setData(T value) {data = value;}
    public void setLeft(DoublyLLNode<T> l) {left=l;}
    public void setRight(DoublyLLNode<T> r) {right=r;}

}
