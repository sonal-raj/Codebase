package Moderate;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 17/11/13
 * Time: 18:25
 * To change this template use File | Settings | File Templates.
 */
public class TicTacToeWin {
    /**
     * Design an algorithm to figure out if someone has won in a game of tic-tac-toe
     */
    public boolean checkRow(int[][] board, int row)
    {
        int Player = board[row][0];
        if(Player==0)
            return false;
        for(int i = 1; i<board.length;i++)
            if(board[row][i]!=Player)
                return false;
        return true;
    }

    public boolean checkColumn(int[][] board, int col)
    {
        int Player = board[0][col];
        if(Player==0)
            return false;
        for(int i=1;i<board.length;i++)
            if(board[i][col]!=Player)
                return false;
        return true;
    }

    public boolean checkDiags(int[][] board)
    {
        boolean ret = true;
        //leading diagonal
        int Player = board[0][0];
        for(int i=0;i<board.length;i++)
            if(board[i][i]!=Player)
            {
                ret = false;
                break;
            }
        if(ret==true)
            return true;

        //check the opposite diagonal
        ret = true;
        int N = board.length-1;
        Player = board[0][N];
        for(int i=1;i<=N;i++)
            if(board[i][N-i]!=Player)
            {
                ret = false;
                break;
            }

        if(ret == true)
            return true;
        return false;
    }
    public boolean hasWon(int[][] board)
    {
        int N = board.length;
        //let 0=empty, 1=Player1 and 2=Player2
        int winner = 0;
        //Check Row and Column and Diagonal
        for(int i=0;i<N;i++)
        {
            boolean r = checkRow(board,i);
            if(r==true)
                return true;
            boolean c = checkColumn(board,i);
            if(c==true)
                return true;
        }
        if(checkDiags(board)==true)
            return true;

        return false;
    }
}
