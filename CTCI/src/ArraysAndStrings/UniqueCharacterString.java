package ArraysAndStrings;
import java.util.*;
/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 12/11/13
 * Time: 01:40
 * To change this template use File | Settings | File Templates.
 */
public class UniqueCharacterString {

    public static boolean hasUniqueChars(String s)
    {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        char[] c = s.toCharArray();
        //add to the hashmap
        for(int i =0; i<s.length();i++)
        {
            if(map.containsKey(c[i]))
                return false;
            else
                map.put(c[i],1);
        }
        return false;
    }

    public static boolean hasUniqCharsNoDS(String s)
    {
        //Sort the array and check for consecutine similar elements
        char[] c = s.toCharArray();
        Arrays.sort(c);
        for(int i=0;i<c.length;i++)
        {
            if(c[i]==c[i+1])
                return false;
        }
        return true;
    }
}
