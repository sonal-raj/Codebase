/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 19/11/13
 * Time: 16:19
 * To change this template use File | Settings | File Templates.
 */
public class StringPermutations {
    public String in;
    public StringBuffer out = new StringBuffer();
    public boolean[] used;

    public StringPermutations(String s)
    {
        in = s;
        used = new boolean[s.length()];
    }

    public void recurse()
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
            recurse();
            used[i] = false;
            out.setLength(out.length()-1);
        }
    }
}
