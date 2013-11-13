// Using Dynamic Programming
//O(n^3)

import java.io.*;

public class MatrixChain
{
    protected static int[][] m;
    protected static int[][] s;
    public static int matrixChainOrder(int[] p)
    {
        int n = p.length-1; //number of matrices
        m = new int[n][n];
        s = new int[n][n];
        //multiplication of matrix with itself costs zero
        for(int i=0;i<n;i++)
        {
            m[i][i]=0;
        }
        for (int ii = 1; ii < n; ii++) {
            for (int i = 0; i < n - ii; i++) {
                int j = i + ii;
                m[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int q = m[i][k] + m[k+1][j] + p[i]*p[k+1]*p[j+1];
                    if (q < m[i][j]) {
                        m[i][j] = q;
                        s[i][j] = k;
                    }
                }
            }
        }
        return m[0][n-1];

    }

    public static void printOptimalParenthesizations() {
        boolean[] inAResult = new boolean[s.length];
        printOptimalParenthesizations(s, 0, s.length - 1, inAResult);
    }
    public static void printOptimalParenthesizations(int[][]s, int i, int j,  /* for pretty printing: */ boolean[] inAResult) {
        if (i != j) {
            printOptimalParenthesizations(s, i, s[i][j], inAResult);
            printOptimalParenthesizations(s, s[i][j] + 1, j, inAResult);
            String istr = inAResult[i] ? "_result " : " ";
            String jstr = inAResult[j] ? "_result " : " ";
            System.out.println(" A_" + i + istr + "* A_" + j + jstr);
            inAResult[i] = true;
            inAResult[j] = true;
        }
    }
    public static void main(String[] args)
    {
        //int p[] = {40, 20, 30, 10, 30};
        int[] arr = {10, 20, 30};
        int size = arr.length;

        System.out.println("Minimum number of multiplications is : "+ matrixChainOrder(arr));
    }
}