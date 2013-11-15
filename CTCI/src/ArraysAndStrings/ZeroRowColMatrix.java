package ArraysAndStrings;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 12/11/13
 * Time: 18:40
 * To change this template use File | Settings | File Templates.
 */
public class ZeroRowColMatrix {

    // If an element is zero its entire row and column become zero
    //Using Lesser Space
    public static void makeZero2(int[][] matrix, int n)
    {
        int[] rows = new int[matrix.length];
        int[] cols = new int[matrix[0].length];
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                if(matrix[i][j]==0)
                {
                    rows[i] = 1;
                    cols[j] = 1;
                }
        for(int i=0;i<n;i++)
            for(int j=0;j<n;j++)
                if(rows[i]==1 || cols[i]==1)
                    matrix[i][j]=0;

        printMatrix(matrix,n);
    }

    //Using More Space
    public static void makeZero(int[][] matrix, int n)
    {
        //traverse the matrix and save positions of the existing zeroes
        int index = 0;
        Integer[] zeropos = new Integer[2*n*n];
       for(int i=0;i<n;i++)
           for(int j =0;j<n;j++)
               if(matrix[i][j]==0)
               {
                   zeropos[index]=i;
                   zeropos[index+1]=j;
                   index=index+2;
               }
        zeropos[index]=-1;

        //traverse the storage array ad set rows and columns to 0
        index=0;
        while(zeropos[index]!=-1)
        {
            int i = zeropos[index];
            int j = zeropos[index+1];
            for(int ptr=0;ptr<n;ptr++)
                matrix[i][ptr]=0;
            for(int ptr=0;ptr<n;ptr++)
                matrix[ptr][j]=0;
            index=index+2;
        }
    }

    public static void printMatrix(int[][] matrix, int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                System.out.print(matrix[i][j]+" ");
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        int[][] matrix = {{1,2,0,4},{5,6,7,8},{9,10,11,12},{0,14,15,16}};
        printMatrix(matrix, 4);
        System.out.println();
        makeZero2(matrix, 4);
        printMatrix(matrix, 4);
    }
}
