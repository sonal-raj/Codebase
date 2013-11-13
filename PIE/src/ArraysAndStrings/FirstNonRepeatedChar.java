package ArraysAndStrings;
import java.util.*;
/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 09/11/13
 * Time: 18:26
 * To change this template use File | Settings | File Templates.
 */
public class FirstNonRepeatedChar {

    public static char firstNonRepeated(String s)
    {
        HashMap<Character, Integer> charmap = new HashMap<Character, Integer>();
        int i, length;
        Character c;
        length = s.length();

        for(i=0;i<length;i++)
        {
            c=s.charAt(i);
            if(charmap.containsKey(c))
            {
                charmap.put(c, charmap.get(c)+1);
            }
            else
                charmap.put(c,1);
        }
        //check for first non repeated character
        for(i=0;i<length;i++)
        {
            if(charmap.get(s.charAt(i))==1)
            {
               return s.charAt(i);
            }
        }
        return '\0';
    }
}
