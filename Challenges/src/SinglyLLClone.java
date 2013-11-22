import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 18/11/13
 * Time: 02:30
 * To change this template use File | Settings | File Templates.
 */
class SinglyLLNode<T>
{
    private T data;
    private SinglyLLNode<T> next;
    private SinglyLLNode<T> rand;

    public SinglyLLNode(T val)
    {
        data = val;
        next = null;
        rand = null;
    }
    public T value() {return data;}
    public SinglyLLNode<T> next() {return next;}
    public SinglyLLNode<T> rand() {return rand;}
    public void setNext(SinglyLLNode<T> n) {next = n;}
    public void setRand(SinglyLLNode<T> r) {rand = r;}
    public void setData(T val) {data = val;}
}

public class SinglyLLClone {
    /**
     * Clone a singly Linked lIst which has an additional random pointer to next, previous or self
     * #Approach
     * ==> use next pointers to normally clone the list without operating on rand pointers
     * ==> Store <PreviousNodeRef,NewNodeRef> pairs in a HashMap while traversing for copying
     * ==> update the pointers while traversing the new list from the HashMap
     */
    public SinglyLLNode<Integer> cloneList(SinglyLLNode<Integer> head)
    {
        //Dont ever fool me with null objects, its in my name!
        if(head==null)
            return null;

        //Simply Copy Elements based on Next pointer
        HashMap<SinglyLLNode<Integer>,SinglyLLNode<Integer>> map = new HashMap<SinglyLLNode<Integer>, SinglyLLNode<Integer>>();
        SinglyLLNode<Integer> newHead = null, temp = null, cursor=null, tmp=head;
        while(head!=null)
        {
            temp = new SinglyLLNode<Integer>(head.value());
            if(newHead==null)
            {
                newHead = temp;
                cursor = newHead;
                map.put(head,newHead);
            }
            else
            {
                cursor.setNext(temp);
                cursor = cursor.next();
                map.put(head, temp); //or map.put(head,cursor)
            }
            head = head.next();
        }

        cursor.setNext(null); //null terminate the final node

        //Traverse new list and change the Rand references
        head = tmp;      //restore the original head pointer
        tmp = newHead;   //store the newHead to return later
        while(newHead!=null)
        {
            SinglyLLNode<Integer> currRand = head.rand();
            SinglyLLNode<Integer> newRand = map.get(currRand);
            newHead.setRand(newRand);
            head = head.next();
            newHead = newHead.next();
        }

        newHead=tmp;
        return newHead;

    }
}
