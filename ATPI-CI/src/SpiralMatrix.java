/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 20/11/13
 * Time: 18:08
 * To change this template use File | Settings | File Templates.
 */
public class SpiralMatrix {
    /**
     * Please print a matrix in spiral order, clockwise from outer rings to inner rings. For example, the
     matrix below is printed in the sequence of 1, 2, 3, 4, 8, 12, 16, 15, 14, 13, 9, 5, 6, 7, 11, 10.
     1   2   3   4
     5   6   7   8
     9   10  11  12
     13  14  15  16
     */
    int R=3;
    int C=6;
    void spiralPrint(int m, int n, int a[][])
    {
        int i, k = 0, l = 0;

    /*  k - starting row index
        m - ending row index
        l - starting column index
        n - ending column index
        i - iterator
    */

        while (k < m && l < n)
        {
        /* Print the first row from the remaining rows */
            for (i = l; i < n; ++i)
            {
                System.out.print(a[k][i]+" ");
            }
            k++;

        /* Print the last column from the remaining columns */
            for (i = k; i < m; ++i)
            {
                System.out.print( a[i][n-1]);
            }
            n--;

        /* Print the last row from the remaining rows */
            if ( k < m)
            {
                for (i = n-1; i >= l; --i)
                {
                    System.out.print(a[m-1][i]);
                }
                m--;
            }

        /* Print the first column from the remaining columns */
            if (l < n)
            {
                for (i = m-1; i >= k; --i)
                {
                    System.out.print(a[i][l]);
                }
                l++;
            }
        }
    }

    /* Driver program to test above functions */
    int main()
    {
        int a[][] = { {1,  2,  3,  4,  5,  6},
        {7,  8,  9,  10, 11, 12},
        {13, 14, 15, 16, 17, 18}};

        spiralPrint(R, C, a);
        return 0;
    }
}
