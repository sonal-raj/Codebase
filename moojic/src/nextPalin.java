import java.util.*;
import java.lang.*;
import java.math.BigInteger;

class nextPalin
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        while((t--)!=0)
        {
            BigInteger n = new BigInteger(s.nextLine());
            System.out.println(findNextPalindrome(n.toString()));
        }
    }

    public static String findNextPalindrome(String number) {
        BigInteger integer = new BigInteger(number);
        BigInteger one1 = new BigInteger("1");
        String nextNum;
        do {
            integer = integer.add(BigInteger.ONE);
            nextNum = (integer).toString();
            System.out.println(nextNum);
        } while(!isPalindrome(nextNum));
        return nextNum;
    }

    public static boolean isPalindrome(String number) {
        return number.equals(new StringBuilder(number).reverse().toString());
    }
}


