/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 19/11/13
 * Time: 16:36
 * To change this template use File | Settings | File Templates.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Codes to calculate the number of Prime Numbers between 1 and N
 */
class SieveOfEratosthenes
{
    public static int getPrimes(int n)
    {
        boolean[] isPrime = new boolean[n+1];
        //make all numbers prime
        for(int i = 2;i<=n;i++)
            isPrime[i]=true;

        //if i is prime mark multiple of i as non-prime
        for(int i=2;i<=n;i++)
            if(isPrime[i])
                for(int j = 2;i*j<=n;j++)
                    isPrime[i*j]=false;

        //count primes or store them in another DS and return
        int count=0;
        for(int i=2;i<=n;i++)
            if(isPrime[i]==true)
                count++;

        return count;
    }

}
public class PrimeNumbers {


}
