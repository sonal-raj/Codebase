package SortingAndSearching;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 16/11/13
 * Time: 20:46
 * To change this template use File | Settings | File Templates.
 */
public class StringSearchMod {
    /**
     * Given a sorted array of strings which is interspersed with empty strings, write a meth-
     od to find the location of a given string
     Example: find “ball” in [“at”, “”, “”, “”, “ball”, “”, “”, “car”, “”, “”, “dad”, “”, “”] will return 4
     Example: find “ballcar” in [“at”, “”, “”, “”, “”, “ball”, “car”, “”, “”, “dad”, “”, “”] will return -1
     */
    public int search(String[] s, String x, int l, int u)
    {
        while(l<=u)
            {
            //get the nearest lower non-empty element
            while((u<=l)&&(s[u]!=""))
                u--;
            //false case, if block was empty
            if(u<l)
                return -1;
            //Check otherwise
            int m = (l+u)>>1;
            while(s[m]!="")
                m++;

            int r = s[m].compareTo(x);
            if(r==0)
                return m;
            else if(r<0)
                l=m+1;
            else
                u=m-1;
            }
        return -1;
    }
}
