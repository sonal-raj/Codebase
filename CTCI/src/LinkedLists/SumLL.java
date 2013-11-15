package LinkedLists;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 12/11/13
 * Time: 20:58
 * To change this template use File | Settings | File Templates.
 */
public class SumLL {
    /*
        You have two numbers represented by a linked list, where each node contains a sin-
        gle digit   The digits are stored in reverse order, such that the 1’s digit is at the head of
        the list   Write a function that adds the two numbers and returns the sum as a linked
        list
        EXAMPLE
        Input: (3 -> 1 -> 5) + (5 -> 9 -> 2)
        Output: 8 -> 0 -> 8
     */

    //Without Additional Space
    public static SinglyLLNode<Integer> addLL2(SinglyLLNode<Integer> n1, SinglyLLNode<Integer> n2)
    {
        //trivial cases
        if(n1==null && n2==null) return null;
        else if(n1==null) return  n2;
        else if(n2==null) return n1;
        //
        int carry=0;
        SinglyLLNode<Integer> sum = null;
        SinglyLLNode<Integer> head = sum;
        while(n1!=null && n2!=null)
        {
            SinglyLLNode<Integer> temp;
            int t = (n1==null?0:n1.value())+(n2==null?0:n2.value())+carry;
            if(t>10)
            {
                temp = new SinglyLLNode<Integer>(t%10);
                carry=1;
            }
            else
            {
                temp = new SinglyLLNode<Integer>(t);
                carry=0;
            }
            sum.setNext(temp);
            sum = temp;
            n1 = (n1==null)?null:n1.next();
            n2 = (n2==null)?null:n2.next();
        }
        return head;

    }
    //With Additional Space
    public static SinglyLLNode<Integer> addLL(SinglyLLNode<Integer> n1, SinglyLLNode<Integer> n2)
    {
        int tens = 1;
        int num1=0, num2=0;
        //Get the first number
        while(n1!=null)
        {
            num1 = num1+(n1.value()*tens);
            tens = tens*10;
            n1 = n1.next();
        }
        //get the second number
        tens = 1;
        while(n2!=null)
        {
            num2+=(n2.value()*tens);
            tens*=10;
            n2 = n2.next();
        }
        //add the two numbers
        num1+=num2;
        //Represent digits of num1 as a linked list

        SinglyLLNode<Integer> sum = null;
        SinglyLLNode<Integer> head = sum;
        while(num1!=0)
        {
            if(sum==null)
                sum.setValue(num1%10);
            else
            {
                SinglyLLNode<Integer> temp = new SinglyLLNode<Integer>(num1%10);
                sum.setNext(temp);
                sum = temp;
            }
        }
        return head;
    }
}
