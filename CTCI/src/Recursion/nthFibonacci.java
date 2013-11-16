package Recursion;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 15/11/13
 * Time: 20:08
 * To change this template use File | Settings | File Templates.
 */
public class nthFibonacci {

    public int nthFiboRecur(int n)
    {
        if(n==0)
            return 0;
        if(n==1)
            return 1;
        else  if(n>1)
            return nthFiboRecur(n-1)+nthFiboRecur(n-2);
        else
            return -1;

    }

    public int nthFiboIter(int n)
    {
        if(n==0) return 0;
        if(n==1) return 1;
        int prev = 0;
        int pprev = 1;
        int fibo = 0;
        for(int i=1;i<n-2;i++)
        {
            fibo = prev+pprev;
            pprev = prev;
            prev = fibo;
        }
        return fibo;
    }
}
