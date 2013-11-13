import java.io.*;

public class patternMatching
{
    private static String T = "abacaabaccabacabaabb";
    private static String P = "abacab";

    public static void bruteForce()
    {
        int n = T.length();
        int m = P.length();
        for(int i=0;i<n-m;i++)
        {
            int j=0;
            while(j<m && (T.charAt(i+j)==P.charAt(j)))
                j=j+1;
            if (j==m)
                System.out.println("Pattern exists from index : "+(i));
        }
    }

    public static int boyerMoore()
    {
        int last[]=buildLast();
        int n = T.length();
        int m = P.length();
        int i = m-1;
        if(i>n-1)
        {
            System.out.println("Pattern longer than String !!");
            return -1;
        }
        int j = m-1;
        do
        {
            if(T.charAt(i)==P.charAt(j))
                if(j==0)
                {
                    System.out.println("Match Found at index : "+(i));
                    return i;
                }
                else
                {
                    i--;
                    j--;
                }
            else
            {
                i=i+m-Math.min(j,1+last[T.charAt(i)]);
                j=m-1;
            }
        }
        while(i<=(n-1));
        System.out.println("No pattern matched !!!");
        return -1;
    }
    public static int[] buildLast()
    {
        int last[]=new int[256];
        for(int i=0;i<last.length;i++)
            last[i]=-1;
        for(int i=0;i<P.length();i++)
            last[P.charAt(i)]=i;
        return last;
    }

    public static int knuthMorrisPrat()
    {
       // construct failure function f
        int f[] = computeFailure();
        int n = T.length();
        int m = P.length();
        int i = 0;
        int j = 0;
        while(i<n)
        {
            if(P.charAt(j)==T.charAt(i))
            {
                if (j==(m-1))
                {
                    System.out.println("Match Found by KMP at : "+(i-m+1));
                    return 1;
                }
                else
                {
                    i++;
                    j++;
                }
            }
            else
            {
                if(j>0) //not equal but have made progress
                    j=f[j-1];
                else
                    i=i+1;
            }
        }
        System.out.println("KMP did not find a match !!!");
        return -1;
    }

    public static int[] computeFailure()
    {
        int[] f = new int[P.length()];
        int m = P.length();
        int i=1;
        int j=0;
        f[0]=0;
        while(i<m)
        {
            if(P.charAt(i)==P.charAt(j))
            {
                f[i]=j+1;
                i++;
                j++;
            }
            else if(j>0)
                    j=f[j-1];
                else
                {
                    f[i]=0;
                    i++;
                }
        }
        return f;
    }


    public static void main(String[] args)
    {
          bruteForce();
          boyerMoore();
          knuthMorrisPrat();
    }
}