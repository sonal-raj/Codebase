package Hard;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 18/11/13
 * Time: 04:41
 * To change this template use File | Settings | File Templates.
 */
public class AddWithoutOperators {
    /**
     * Write a function that adds two numbers  You should not use + or any arithmetic op-
     * erators
     */
    public int add(int a, int b)
    {
        if(b==0)
            return a;
        int sum = a^b;
        int carry = (a & b)<<1;
        return add(sum, carry);
    }
}
