package Algorithms;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 20/11/13
 * Time: 16:01
 * To change this template use File | Settings | File Templates.
 */
public class CoinChangeProblem {
    /**
     * Please implement a function that gets the minimal number of coins with values v1, v2, …, vn, to
     make change for an amount of money with value t. There are an infinite number of coins for each value vi.
     For example, the minimum number of coins to make change for 15 out of a set of coins with values 1, 3, 9, 10 is
     3. We can choose two coins with value 3 and a coin with value 9. The number of coins for other choices should be
     greater than 3.
     */

     public int getMinCount(int total, int[] coins)
     {
         int[] counts = new int[total+1];
         counts[0] = 0;

         int MAX = Integer.MAX_VALUE;

         for(int i=1;i<=total;i++)
         {
             int count = MAX;
             for(int j = 0;j<coins.length;j++)
             {
                 if((i-coins[j]>0) && count>counts[i-coins[j]])
                     count = counts[i-coins[j]];
             }

             if(count<MAX)
                 counts[i]=count+1;
             else
                 counts[i] = MAX;
         }

         return counts[total];
     }
}
