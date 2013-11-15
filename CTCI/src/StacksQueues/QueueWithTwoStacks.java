package StacksQueues;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 13/11/13
 * Time: 16:00
 * To change this template use File | Settings | File Templates.
 */
public class QueueWithTwoStacks {

    Stack<Integer> in = new Stack<Integer>();
    Stack<Integer> out = new Stack<Integer>();
    public int size()
    {
       if(!out.isEmpty())
           return out.size();
       else
           return in.size();

    }
    public void add(int n)
    {
        if(out.isEmpty())
           in.push(n);
        else
        {
            while(!out.isEmpty())
                in.push(out.pop());
            in.push(n);
        }
    }

    public int peek()
    {
        if(out.isEmpty())
        {
            while(!in.isEmpty())
                out.push(in.pop());
        }
        return in.peek();
    }

    public int remove()
    {
        if(out.isEmpty())
        {
            while(!in.isEmpty())
                out.push(in.pop());
        }
        return out.pop();
    }
}
