package linkedlists;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 08/11/13
 * Time: 19:48
 * To change this template use File | Settings | File Templates.
 */
public class SinglyLLOperations {

    public SinglyLLNode<Integer> insertInFront(SinglyLLNode<Integer> head,int data)
    {
        SinglyLLNode<Integer> temp= new SinglyLLNode<Integer>(data);
        temp.setNext(head);
        return temp; //which is the new head
    }

    public SinglyLLNode<Integer> find(SinglyLLNode<Integer> head,int n)
    {
        //check for end of list to avoid null reference exception
        SinglyLLNode<Integer> temp = head;
        while(temp.value()!=n && temp!=null)
        {
            temp = temp.next();
        }
        return temp;
    }

    public void insert(SinglyLLNode<Integer> head, SinglyLLNode<Integer> after,  int data)
    {
        SinglyLLNode<Integer> temp = head;
        while(temp!=null)
        {
            if(temp==after)
            {
                SinglyLLNode<Integer> t = new SinglyLLNode<Integer>(data);
                t.setNext(temp.next());
                temp.setNext(t);
            }
        }
    }
    public SinglyLLNode<Integer> delete(SinglyLLNode<Integer> head,SinglyLLNode<Integer> node)
    {
        SinglyLLNode<Integer> temp = head;
        while(temp.next()!=node && temp!=null)
        {
            temp = temp.next();
        }
        if(temp!=null)
        {
            SinglyLLNode<Integer> toDel = temp.next();
            temp.setNext(toDel.next());
            return toDel;
        }
        return null;
    }

    public void deleteList(SinglyLLNode<Integer> head)
    {
        while(head!=null)
        {
            SinglyLLNode<Integer> temp = head;
            head.setNext(head.next());
        }
    }


    public static void main(String[] args)
    {
        //ensure head changes effectively
        //head = insertInFront(head, newData);
    }
}
