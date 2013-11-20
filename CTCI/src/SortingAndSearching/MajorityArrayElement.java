package SortingAndSearching;

import java.util.Hashtable;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 20/11/13
 * Time: 13:39
 * To change this template use File | Settings | File Templates.
 */
public class MajorityArrayElement {
    /**
     * How do you find the majority element in an array when it exists? The majority is an element
     that occurs for more than half of the size of the array.
     For example, the number 2 in the array {1, 2, 3, 2, 2, 2, 5, 4, 2} is the majority element because it appears five
     times and the size of the array is 9.
     */

    public static int majority(int[] data)
    {
        int majority = 0;
        Hashtable<Integer, Integer> table= new Hashtable<Integer, Integer>();
        for(int i=0;i<data.length;i++)
        {
            if(table.containsKey(data[i]))
                table.put(data[i], table.get(data[i])+1);
            else
                table.put(data[i], 1);
        }

        for(int i =0;i<data.length;i++)
        {
            if(table.get(data[i])>=(data.length/2))
                return data[i];
        }
        return -1;
    }
}
