package Recursion;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 10/11/13
 * Time: 01:07
 * To change this template use File | Settings | File Templates.
 */
public class Permutations {

    /*
        ALGORITHM
        =====================================================================
                If you’re past the last position
            Print the string
            Return
        Otherwise
            For each letter in the input string
            If it’s marked as used, skip to the next letter
            Else place the letter in the current position
                Mark the letter as used
                Permute remaining letters starting at current position + 1
                Mark the letter as unused
        =====================================================================
     */
    private final String in;
    private StringBuilder out = new StringBuilder();
    private  boolean[] used;

    public Permutations(String s)
    {
        in = s;
        used = new boolean[s.length()];
    }

    public void permute()
    {
        if(in.length()==out.length())
        {
            System.out.println(out);
            return;
        }
        for(int i=0;i<in.length();i++)
        {
            if(used[i])
                continue;
            out.append(in.charAt(i));
            used[i]=true;
            permute();
            used[i]=false;
            out.setLength(out.length()-1);
        }
    }
}
