package SortingAndSearching;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 16/11/13
 * Time: 21:03
 * To change this template use File | Settings | File Templates.
 */
public class MatrixSearch {
    /**
     * Given a matrix in which each row and each column is sorted, write a method to find
     an element in it
     */

    public boolean search(int[][] m, int x, int M, int N)
    {
        int row = 0;
        int col = N-1;
        while(row<M && col>0)
        {
            if(m[row][col]==x)
                return true;
            else if(m[row][col]>x)
                col--;
            else
                row--;
        }
        return false;
    }
}
