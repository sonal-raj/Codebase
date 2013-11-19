package Moderate;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 18/11/13
 * Time: 04:34
 * To change this template use File | Settings | File Templates.
 */
public class SumPairsInArray {
    /**
     * Design an algorithm to find all pairs of integers within an array which sum to a speci-
     fied value
     */

    public void findPairs(int[] arr, int sum)
    {
        //Read Array and store in Hashmap
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.containsKey(arr[i]))
                map.put(arr[i], map.get(arr[i])+1);
            else
                map.put(arr[i],1);
        }

        //Read the array again and find the complementary elements
        for(int i=0;i<arr.length;i++)
        {
            int compl = sum-arr[i];
            if(map.containsKey(compl))
                System.out.println(arr[i]+" "+compl+"\n");
        }
    }

    //can also be solved by sortin the array and finding element and its complement from opposite sides till front<back;
}
