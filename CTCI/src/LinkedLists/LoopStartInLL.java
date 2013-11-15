package LinkedLists;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 12/11/13
 * Time: 21:53
 * To change this template use File | Settings | File Templates.
 */
public class LoopStartInLL {

    public static SinglyLLNode<Integer> findLoopStart(SinglyLLNode<Integer> head)
    {
        SinglyLLNode<Integer> slow = head, fast = head;
        while(slow!=null && fast!=null)
        {
            fast = fast.next();
            if(fast==slow) //single edge loop
                break;
            if(fast==null)
                return null;
            fast = fast.next();
            if(fast==slow)
                break;
            slow = slow.next();
        }
        slow = head;
        //where they meet is the start of the loop
        while(fast!=slow)
        {
            fast=fast.next();
            slow=slow.next();
        }
        return fast; //or slow
    }
}
