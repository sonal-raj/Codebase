package LinkedLists;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 12/11/13
 * Time: 20:00
 * To change this template use File | Settings | File Templates.
 */
public class RemoveDuplicates {

    //when additional buffer allowed
    public static void removeDupl(SinglyLLNode<Integer> head)
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        while(head.next()!=null)
        {
            int t = head.next().value();
            if(map.containsKey(t))
                head.setNext(head.next().next());
            else
                map.put(t,1);

            head = head.next();
        }
    }

    //when additional buffer not allowed
    public static void removeDupl2(SinglyLLNode<Integer> head)
    {
        SinglyLLNode<Integer> t1 = head;
        SinglyLLNode<Integer> t2 = head;
        while(t1!=null)
        {
            while(t2!=null)
            {
                if(t1.value()==t2.next().value())
                    t2.setNext(t2.next().next());
                t2 = t2.next();
            }
            t1 = t1.next();
        }
    }
}
