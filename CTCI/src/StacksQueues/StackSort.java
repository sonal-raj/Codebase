package StacksQueues;
import com.sun.org.apache.xalan.internal.xsltc.compiler.util.StringStack;

import java.util.*;
/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 13/11/13
 * Time: 16:45
 * To change this template use File | Settings | File Templates.
 */
public class StackSort {
    /*
        Write a program to sort a stack in ascending order  You should not make any assump-
        tions about how the stack is implemented  The following are the only functions that
        should be used to write this program: push | pop | peek | isEmpty
     */
    private Stack<Integer> stack = new Stack<Integer>();
    private Stack<Integer> temp = new Stack<Integer>();
    public void sortStack()
    {
        while(!stack.isEmpty())
        {
            int buffer = stack.pop();
            if(temp.isEmpty())
                temp.push(buffer);
            else
            {
                while(temp.peek()>buffer)
                    stack.push(temp.pop());
                temp.push(buffer);
            }
        }
        //copy back into original stack to sort ascending
        while(!temp.isEmpty())
            stack.push(temp.pop());
    }

}
