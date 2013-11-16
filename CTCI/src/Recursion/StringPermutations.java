package Recursion;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 16/11/13
 * Time: 04:33
 * To change this template use File | Settings | File Templates.
 */
public class StringPermutations {
    /**
     * Write a method to compute all permutations of a string
     */
    private String in;
    private StringBuilder out = new StringBuilder();
    private boolean[] used;

    public StringPermutations(String s)
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
            used[i] = true;
            permute();
            used[i] = false;
            out.setLength(out.length()-1);
        }
    }

}
