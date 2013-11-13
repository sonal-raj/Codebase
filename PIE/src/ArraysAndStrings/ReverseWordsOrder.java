package ArraysAndStrings;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 09/11/13
 * Time: 19:05
 * To change this template use File | Settings | File Templates.
 */
public class ReverseWordsOrder {
    private static String str = "Hello";
    private static char[] s = str.toCharArray();
    public static void reverse(int start, int end)
    {
        while(start<=end)
        {
            char temp = s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;end--;
        }
    }
    public static String reverseWordOrder()
    {
        //reverse the whole string once
        reverse(0,str.length()-1);
        //reverse each word
        int wstart=0,wend=0;
        for(int i=0;i<str.length();i++)
        {
            if(s[wend]!=' ')
                wend++;
            else
            {
                reverse(wstart,wend-1);
                wend++;
                wstart=wend;
            }
        }
        return s.toString();
    }
    public static void main(String[] args)
    {
        System.out.println(reverseWordOrder());
    }
}
