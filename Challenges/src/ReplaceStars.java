import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 18/11/13
 * Time: 01:24
 * To change this template use File | Settings | File Templates.
 */

/**
 * Given a String with some * characters, replace them with 1/0 and print all possible combinations
 * ------------------------------------------------------------------------------------------------
 * #Approach
 * ==> Count the number of stars in str = n
 * ==> Generate all possible binary reps of numbers from 1 to n = ni
 * ==> replaceInString(ni)
 * ==> O(n)
 */

//Data Structure for Manipulating the Input
class StarData
{
    String s;
    int num_stars;
    int[] star_pos;
    public StarData(String str)
    {
        s = str;
        num_stars = 0;
        star_pos = new int[str.length()];
        //count the stars and set the positions
        int index=0;
        for(int i=0;i<s.length();i++)
        {
            if (s.charAt(i)=='*')
            {
                num_stars++;
                star_pos[index++]=i;
            }
        }
    }
}
public class ReplaceStars {
    public static void replaceWithBinary(String s, StarData star)
    {
        int n = 1<<star.num_stars, i, index;
        for(i=0;i<n;i++)
        {
            char[] c = star.s.toCharArray();
            index=0;
            int bit = 1<<star.num_stars - 1;
            while ( bit!=0 ) {
                if((i & bit)==0)
                    c[star.star_pos[index++]]='0';
                else
                    c[star.star_pos[index++]]='1';
                bit >>= 1;
            }
            //print the string
            for(int t=0; t<c.length;t++)
                System.out.print((char)c[t]);
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        //if you fool me with a null string
        if(str==null)
        {
            System.out.print("Null String Found!!");
            return;
        }
        //if string is valid, find number of stars
        StarData star = new StarData(str);

        if(star.num_stars==0)
            System.out.print(str);
        else
            replaceWithBinary(str, star);
    }
}
