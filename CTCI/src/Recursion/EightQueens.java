package Recursion;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 16/11/13
 * Time: 18:01
 * To change this template use File | Settings | File Templates.
 */
public class EightQueens {
    /**
     * Write an algorithm to print all ways of arranging eight queens on a chess board so
       that none of them share the same row, column or diagonal
     */

    private int ColumnForRow[] = new int[8];
    public boolean check(int row)
    {
        for(int i=0;i<row;i++)
        {
            int diff = Math.abs(ColumnForRow[i]-ColumnForRow[row]);
            if(diff==0 || diff==Math.abs(row-i)) return false;
        }
        return true;
    }

    public void placeQueens(int row)
    {
        if(row==8)
        {
            //printBoard();
            return;
        }
        for(int i=0;i<8;i++)
        {
            ColumnForRow[row] = i;
            if(check(row))
                placeQueens(row+1);
        }
    }
}
