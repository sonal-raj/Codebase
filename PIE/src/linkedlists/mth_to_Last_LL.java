package linkedlists;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 08/11/13
 * Time: 21:18
 * To change this template use File | Settings | File Templates.
 */
public class mth_to_Last_LL {

    public int mthLast(SinglyLLNode<Integer> head, int m) throws Exception
    {
        if(head==null)
            throw new Exception("List is Empty");

        SinglyLLNode<Integer> car1=head;
        SinglyLLNode<Integer> car2=head;
        for(int i=0;i<m;i++)
        {
            if(car2.next()==null)
                throw new Exception("Size of List < m");
            car2.setNext(car2.next());
        }
        while(car2.next()!=null)
        {
            car1.setNext(car1.next());
            car2.setNext(car2.next());
        }
        return car1.value();
    }
}
