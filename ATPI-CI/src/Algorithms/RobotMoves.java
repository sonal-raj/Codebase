package Algorithms;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 20/11/13
 * Time: 15:30
 * To change this template use File | Settings | File Templates.
 */
public class RobotMoves {

    /**
     *   A robot starts at cell (0, 0) of a grid with m rows and n columns. It can move to the left, right,
     up, and down, and moves one cell for a step. It cannot enter cells where the digit sum of the row index and
     column index are greater than a given k.
     For example, when k is 18, the robot can reach cell (35, 37) because 3+5+3+7=18. However, it cannot reach cell
     (35, 38) because 3+5+3+8=19 and that is greater than k. How many cells can the robot reach?
     */
    public int movingCount(int threshold, int rows, int cols)
    {
        boolean visited[][] = new boolean[rows][cols]; //already initialized to false;

        int count = movingCountCore(threshold, rows, cols, 0, 0, visited);

        return count;
    }

    public int movingCountCore(int threshold, int rows, int cols, int row, int col, boolean[][] visited)
    {
        int count = 0;
        if(check(threshold, rows, cols, row, col, visited))
        {
            visited[row][col] = true;
            count = 1+movingCountCore(threshold, rows, cols, row, col-1, visited)+
                    movingCountCore(threshold, rows, cols, row, col+1, visited)+
                    movingCountCore(threshold, rows, cols, row-1, col, visited)+
                    movingCountCore(threshold, rows, cols, row + 1, col, visited);
        }
        return count;
    }

    public boolean check(int threshold, int rows, int cols, int row, int col, boolean[][] visited)
    {
        if(row>=0 && row<rows && col>=0 && col<cols && sumDigits(row)+sumDigits(col)<=threshold && !visited[row][col] )
            return true;
        return false;
    }

    public int sumDigits(int number)
    {
        int sum=0;
        while(number>0)
        {
            sum+=(number%10);
            number/=10;
        }
        return sum;
    }

}
