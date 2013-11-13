package ArraysAndStrings;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 09/11/13
 * Time: 18:55
 * To change this template use File | Settings | File Templates.
 */
public class RemoveChars {

    public static String removeCharsFromString(String str, String remove)
    {
        char[] s = str.toCharArray();
        char[] m = remove.toCharArray();
        boolean[] flag = new boolean[128]; //since ascii string is given ; auto initialize to false
        int i,src,dest;
        //set remove flags to true
        for(i=0;i<remove.length();i++)
        {
            flag[m[i]]=true;
        }
        //copy characters if not flagged
        dest=0;
        for(src=0;src<str.length();src++)
        {
            if(!flag[s[src]])
            {
                s[dest++]=s[src];
            }
        }
        return new String(s,0,dest);
    }
}
