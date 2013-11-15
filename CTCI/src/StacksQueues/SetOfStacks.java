package StacksQueues;
import java.util.*;
/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 13/11/13
 * Time: 12:52
 * To change this template use File | Settings | File Templates.
 */
public class SetOfStacks {
    /*
        Thought Log
        --------------
        - Can use a master stack with each node pointing to individual stacks
        - Array would be better, as it provides random accessibility and faster creation
        - when size of a stack reaches capacity, we start new stack;
     */
    private int CAPACITY = 100;
    private StackNodeLL[] Set = new StackNodeLL[CAPACITY];
    private int top = 0, currSize = 0;
    public void push(int n)
    {
        if(Set[top]==null)
        {
            Set[top] = new StackNodeLL(n);
            currSize++;
        }
        else if(currSize==CAPACITY-1)
        {
            Set[top].setNext(null);
            top++;
            currSize=0;
            Set[top]=new StackNodeLL(n);
            currSize++;
        }
        else
        {
            StackNodeLL temp = new StackNodeLL(n);
            temp.setNext(Set[top]);
            Set[top]=temp;
            currSize++;
        }
    }
    public int pop()
    {
        if(top==0 && currSize==0)
            return -1;
        if(top==CAPACITY-1 && currSize==CAPACITY-1)
            return -1;
        int val = Set[top].getData();
        currSize--;
        Set[top]=Set[top].next;
        if(Set[top]==null)
        {
            top--;
            currSize=CAPACITY;
        }
        return val;
    }
    public int popAt(int index)
    {
        int temp = top;
        top = index;
        int val = pop();
        top = temp;
        return val;
        // Or we can shift elements from bottom of next stacks to top of prev.
        //also ArrayList of Stacks is a better alternative
    }
}
