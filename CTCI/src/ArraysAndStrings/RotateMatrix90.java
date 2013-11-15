package ArraysAndStrings;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 12/11/13
 * Time: 18:05
 * To change this template use File | Settings | File Templates.
 */
public class RotateMatrix90 {

    //By NOT using additional space
    public static void rotateMatrix90(int[][] matrix,int n)
    {
        //Step 1: Flip the matrix row wise
        for(int i=0;i<n;i++)    //rows
        {   int start = 0;
            int end = n-1;
            while(start<=end)
            {
                int temp = matrix[i][start];
                matrix[i][start] = matrix[i][end];
                matrix[i][end] = temp;
                start++;end--;
            }
        }
        printMatrix(matrix, n);
        System.out.println();
        //Step 2: Flip matrix over the diagonal
        int rowlength = n;
        for(int i=0;i<n;i++) //rows
        {
           for(int j=0;j<rowlength;j++)
           {
               int temp = matrix[i][j];
               matrix[i][j] = matrix[n-1-j][n-1-i];
               matrix[n-1-j][n-1-i] = temp;
           }
           rowlength--;
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
        int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printMatrix(matrix, 4);
        System.out.println();
        rotateMatrix90(matrix, 4);
        printMatrix(matrix, 4);
    }


}
