/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 19/11/13
 * Time: 20:08
 * To change this template use File | Settings | File Templates.
 */
public class NQueens {

    private int N;
    private int ColumnInRow[];

    public NQueens(int n)
    {
        N=n;
        ColumnInRow = new int[N];
    }

    public boolean check(int row)
    {
        for(int i=0;i<row;i++)
        {
            int diff = Math.abs(ColumnInRow[i]-ColumnInRow[row]);
            if((diff==0)||(diff==Math.abs(i-row)))
                return false;
        }
        return false;
    }

    public void placeQueen(int row)
    {
        if(row==N)
        {
            //Print the Board
            return;
        }
        for(int i=0;i<N;i++)
        {
            ColumnInRow[row]=i;
            if(check(row))
                placeQueen(row+1);
        }
    }
}
