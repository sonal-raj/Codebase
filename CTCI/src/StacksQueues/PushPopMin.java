package StacksQueues;
import java.util.*;
/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 13/11/13
 * Time: 12:15
 * To change this template use File | Settings | File Templates.
 */
class StackNodeLL
{
    private int data;
    private int min;
    StackNodeLL next;
    //constructor
    public StackNodeLL(int n)
    {
        data = n;
        min = n;
    }
    public int getData()
    {
        return data;
    }
    public int getMin()
    {
        return min;
    }
    public void setNext(StackNodeLL n)
    {
        next = n;
        if(n.min<this.min)
            min = n.min;
    }
    public void setData(int n)
    {
        data = n;
        if(data<next.min)
            min=data;
        else
            min=next.min;
    }
}
public class PushPopMin {
    // Push, Pop, and Min Operations in O(n)
    /*
        Thought Log
        --------------------
        -use Linked List
        -each node has an additional field min which stores min value upto that node
        -calling min() returns min value of top node
        -can use an array, in which case additional array required for storing corresponding min
     */
    public static void push(StackNodeLL head,int n)
    {
        StackNodeLL temp = new StackNodeLL(n);
        temp.setNext(head.next);
        head=temp;
    }
    public static int pop(StackNodeLL head)
    {
        int val = head.getData();
        head = head.next;
        return val;
    }
    public static int min(StackNodeLL head)
    {
        return head.getMin();
    }
}
class PushPopMinEfficient
{
    // To save space and avoid consecutive duplicates, we store the min info in a
    // separate array or Stack whose top is always the min
    Stack<Integer> s = new Stack<Integer>();
    private Stack<Integer> min = new Stack<Integer>();
    public void push2(int n)
    {
        s.push(n);
        if(n<min.peek())
            min.push(n);
    }
    public int pop()
    {
        int val = s.pop();
        if(val == min.peek())
            min.pop();
        return val;
    }
    public int min()
    {
        return min.peek();
    }
}
