package LinkedLists;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 12/11/13
 * Time: 20:19
 * To change this template use File | Settings | File Templates.
 */
public class NthToLastElement {

    public static int NthToLast(SinglyLLNode<Integer> head, int n) throws Exception
    {
        if(head==null)
            throw new Exception("List is Empty!!");

        SinglyLLNode<Integer> fastCar = head;
        SinglyLLNode<Integer> slowCar = head;
        int counter = 1;
        while(counter++<=n)
        {
            if(fastCar.next()==null)
                throw new Exception("List insufficient!!");
            fastCar = fastCar.next();
        }
        while(fastCar.next()!=null)
        {
            fastCar = fastCar.next();
            slowCar = slowCar.next();
        }
        return slowCar.value();
    }
}
