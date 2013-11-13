package Recursion;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 10/11/13
 * Time: 01:43
 * To change this template use File | Settings | File Templates.
 */
public class TelephoneWords {

    /*
                If the current digit is past the last digit
                     Print the word because you’re at the end
                 Else
                      For each of the three digits that can represent the current digit
                           Have the letter represent the current digit
                           Move to next digit and recurse
                           If the current digit is a 0 or a 1, return
     */

    private static final int PHONE_NUMBER_LENGTH = 7;
    private final int [] phoneNum;
    private char[] result = new char[ PHONE_NUMBER_LENGTH ];
    public TelephoneWords ( int[] n ) { phoneNum = n; }
    public void printWords(){ printWords(0); }

    public void printWords(int currDigit)
    {
            if(currDigit==PHONE_NUMBER_LENGTH)
            {
                System.out.println(result);
                return;
            }
            for(int i=1;i<=3;i++)
            {
                result[i] = getCharKey(phoneNum[currDigit], i);
                printWords(currDigit+1);
                if(phoneNum[currDigit]==0 || phoneNum[currDigit]==1)
                    return;
            }
    }

    public char getCharKey(int key, int place)
    {
        switch(key)
        {
            case 1:
                return '1';
            case 2:switch(place)
            {
                case 1: return 'A'; 
                case 2: return 'B'; 
                case 3: return 'C'; 
            }
            case 3:switch(place)
            {
                case 1: return 'D'; 
                case 2: return 'E'; 
                case 3: return 'F'; 
            }
            case 4:switch(place)
            {
                case 1: return 'G'; 
                case 2: return 'H'; 
                case 3: return 'I'; 
            }
            case 5:switch(place)
            {
                case 1: return 'J'; 
                case 2: return 'K'; 
                case 3: return 'L'; 
            }
            case 6:switch(place)
            {
                case 1: return 'M'; 
                case 2: return 'N'; 
                case 3: return 'O'; 
            }
            case 7:switch(place)
            {
                case 1: return 'P'; 
                case 2: return 'R'; 
                case 3: return 'S'; 
            }
            case 8:switch(place)
            {
                case 1: return 'T'; 
                case 2: return 'U'; 
                case 3: return 'V'; 
            }
            case 9:switch(place)
            {
                case 1: return 'W'; 
                case 2: return 'X'; 
                case 3: return 'Y'; 
            }
            case 0:return '0'; 
        }
        return '\0';
    }
}
