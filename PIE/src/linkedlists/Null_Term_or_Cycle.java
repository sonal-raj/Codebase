package linkedlists;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 08/11/13
 * Time: 23:40
 * To change this template use File | Settings | File Templates.
 */
public class Null_Term_or_Cycle {

    public boolean hasCycle(SinglyLLNode<Integer> head)
    {
        SinglyLLNode<Integer> tortoise=head, hare=head;
        while(tortoise!=null && hare!=null)
        {
            hare = hare.next();
            if(hare==tortoise)
                return true;
            if(hare==null)
                return false;
            hare=hare.next();
            if(hare==tortoise)
                return true;
            tortoise=tortoise.next();
        }
        return false;
    }
}
