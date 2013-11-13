package Recursion;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 10/11/13
 * Time: 01:24
 * To change this template use File | Settings | File Templates.
 */
public class Combinations {

    /*
                For each letter from input start position to end of input string
                    Append the letter to the output string
                    Print letters in output string
                If the current letter isn’t the last in the input string
                    Generate remaining combinations starting at next position with
                    iteration starting at next letter beyond the letter just selected
                Delete the last character of the output string
     */

    private StringBuilder out = new StringBuilder();
    private final String in;
    public Combinations( final String str ){ in = str; }
    public void combine() { combine(0); }

    private void combine(int start)
    {
        for(int i=0;i<in.length()-1;i++)
        {
            out.append(in.charAt(i));
            System.out.println(out);
            //using loop partitioning= removing condition and last iteration
            combine(i+1);
            out.setLength(out.length()-1);
        }
        out.append(in.charAt(in.length()-1)); //append last letter
        System.out.println(out);
        out.setLength(out.length()-1);
    }

}
