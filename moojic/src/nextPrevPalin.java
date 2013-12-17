import java.util.Scanner;
import java.lang.*;
import java.math.BigInteger;

public class nextPrevPalin {

    public static String findNextPalindrome(String number) {
        BigInteger integer = new BigInteger(number);
        String nextNum;
        do {
            integer = integer.add(BigInteger.ONE);
            nextNum = (integer).toString();
            //System.out.println(nextNum);
        } while(!isPalindrome(nextNum));
        return nextNum;
    }

    public static String findPrevPalindrome(String number) {
        BigInteger integer = new BigInteger(number);
        String nextNum;
        do {
            integer = integer.subtract(BigInteger.ONE);
            nextNum = (integer).toString();
            //System.out.println(nextNum);
        } while(!isPalindrome(nextNum));
        return nextNum;
    }

    public static boolean isPalindrome(String number) {
        return number.equals(new StringBuilder(number).reverse().toString());
    }

    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        while(s.hasNextLine())
        {
            String[] temp = s.nextLine().split(" ");
            int a = Integer.parseInt(temp[0]);
            BigInteger b = new BigInteger(temp[1]);
            if((a & 1)==0)
            {   //even case
                System.out.println(findNextPalindrome(b.toString()));
            }
            else if((a & 1)==1)
            {   //odd case
                System.out.println(findPrevPalindrome(b.toString()));
            }

        }
    }
}
