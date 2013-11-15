package ArraysAndStrings;

import java.util.HashMap;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 12/11/13
 * Time: 02:01
 * To change this template use File | Settings | File Templates.
 */
public class RemoveDuplicateChars {

    //Removing with additional Data Structure  O(n)

    public void removeWithDS(char[] c)
    {
        if((c.length<2)||(c==null))
            return;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i = 0;i<c.length;i++)
        {
            if(map.containsKey(c[i]))
            {
                System.arraycopy(c,i+1,c,i,c.length-i+1);
                i--;
            }
            else
                map.put(c[i],1);
        }
    }

    //To remove duplicate characters without using additional Buffers O(n^2)

    public void removeWithoutDS(char[] c)
    {
        if((c==null)||(c.length<2))
            return;
        int tail = 1;
        for(int i=0;i<c.length;i++)
        {   int j;
            for(j = i+1;j<c.length;j++)
            {
                if(c[i]==c[j])
                {
                    System.arraycopy(c,j+1,c,j,c.length-j+1);
                    j--;
                }
            }

        }
    }

}
