package Algorithms;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 20/11/13
 * Time: 13:50
 * To change this template use File | Settings | File Templates.
 */
public class StringPathBacktracking {
    /**
     * How do you implement a function to check whether there is a path for a string in a matrix of
     characters? It moves to left, right, up, and down in a matrix, and a cell for a step. The path can start from any cell
     in a matrix. If a cell is occupied by a character of a string on the path, it cannot be occupied by another character
     again.
     For example, the matrix below with three rows and four columns has a path for the string “bcced” (as highlighted
     in the matrix). It does not have a path for the string “abcb”, because the first “b” in the string occupies the “b” cell
     in the matrix, and the second “b” in the string cannot enter the same cell again.
     a b c e
     s f c s
     a d e e
     */

     public static boolean hasPath(char[][] matrix, int rows, int cols, char[] str)
     {
         if(matrix==null || rows<1 || cols<1 || str==null)
             return false;

         boolean[][] visited = new boolean[rows][cols];

         int pathLength = 0;
         for(int row = 0;row<rows;row++)
             for(int col=0;col<cols;col++)
                 if(hasPathCore(matrix, rows, cols, row, col, str, pathLength, visited))
                     return true;
         return false;
     }

    public static boolean hasPathCore(char[][] matrix, int rows, int cols, int row, int col, char[] str, int pathLength, boolean[][] visited)
    {
        if(str.length==pathLength)
            return true;

        boolean hasPath = false;
        if(row>=0 && row<rows && col>=0 && col<cols && matrix[row][col]==str[pathLength] && !visited[row][col])
        {
            ++pathLength;
            visited[row][col]=true;

            hasPath = hasPathCore(matrix, rows, cols, row, col-1, str, pathLength, visited) ||
                      hasPathCore(matrix, rows, cols, row-1, col, str, pathLength, visited) ||
                      hasPathCore(matrix, rows, cols, row, col+1, str, pathLength, visited) ||
                      hasPathCore(matrix, rows, cols, row+1, col, str, pathLength, visited);

            if(!hasPath)
            {
                --pathLength;
                visited[row][col]=false;
            }
        }

        return hasPath;
    }
}
