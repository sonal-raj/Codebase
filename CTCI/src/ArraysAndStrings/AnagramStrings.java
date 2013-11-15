package ArraysAndStrings;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 12/11/13
 * Time: 11:49
 * To change this template use File | Settings | File Templates.
 */
public class AnagramStrings {

    //Logic 1: sort both arrays and check for the equality of the two O(n log n)

    /*Logic 2: Check equality of Length in both the arrays
               Traverse String1 -> store in a hashmap<char, count> / or array of 256 in ASCII
               Traverse String2 -> store in another Hashmap<char,count> / or Array of 256 in ASCII
               Compare the 2 Hashmaps / arrays
               O(n)

      Logic 3: Check equality of length in bth the arrays
               Traverse String1 -> Store in a Hashmap<char,count>
               Traverse String2 -> Decrement Char count in hashmap
               Check for null cases in the Hashmap
               O(n)
     */
    public static boolean isAnagram(String s1, String s2)
    {
        if(s1.length()!=s2.length())
            return false;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        HashMap<Character,Integer> map = new HashMap<Character, Integer>();
        //pass 1
        for(int i=0;i<s1.length();i++)
            if(map.containsKey(c1[i]))
                map.put(c1[i],map.get(c1[i])+1);
            else
                map.put(c1[i],1);

        //pass2
        for(int i=0;i<s2.length();i++)
            if(!map.containsKey(c2[i]))
                return false;
            else
                map.put(c2[i],map.get(c2[i])-1);

        //pass3
        for(int i=0;i<s1.length();i++)
            if(map.get(c1[i])!=0)
                return false;
        return true;
    }

}
