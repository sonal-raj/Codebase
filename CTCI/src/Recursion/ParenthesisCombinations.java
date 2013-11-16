package Recursion;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 16/11/13
 * Time: 04:42
 * To change this template use File | Settings | File Templates.
 */
public class ParenthesisCombinations {
    /**
     * Implement an algorithm to print all valid (e g , properly opened and closed) combi-
     nations of n-pairs of parentheses
     EXAMPLE:
     input: 3 (e g , 3 pairs of parentheses)
     output: ()()(), ()(()), (())(), ((()))
     */
        public static void printPar(int count)
        {
            char[] str = new  char[count*2];
            int l=count;
            int r=count;
            printPar(l,r,str,0);
        }
        public static void printPar(int l, int r, char[] str, int index)
        {
            if(l<0 || r<1)
                return;
            if(l==0 && r==0)
            {
                System.out.println(str);//A string has been found
            }
            else
            {
                if(l>0) //if a left bracket remains
                {
                    str[index] = '(';
                    printPar(l-1,r,str,index+1);
                }
                if(r>0) //if a right bracket remains
                {
                    str[index]=')';
                    printPar(l,r-1,str,index+1);
                }
            }
        }
        public static void main(String[] args)
        {
            printPar(3);
        }

}

