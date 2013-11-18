package Moderate;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 17/11/13
 * Time: 19:17
 * To change this template use File | Settings | File Templates.
 */
class Result
{
    public int hits;
    public int pseudoHits;
}
public class MasterMind {
    /**
     * The Game of Master Mind is played as follows:
     The computer has four slots containing balls that are red (R), yellow (Y), green (G) or
     blue (B)   For example, the computer might have RGGB (e g , Slot #1 is red, Slots #2 and
     #3 are green, Slot #4 is blue)
     You, the user, are trying to guess the solution  You might, for example, guess YRGB
     When you guess the correct color for the correct slot, you get a “hit”  If you guess
     a color that exists but is in the wrong slot, you get a “pseudo-hit”  For example, the
     guess YRGB has 2 hits and one pseudo hit
     For each guess, you are told the number of hits and pseudo-hits
     Write a method that, given a guess and a solution, returns the number of hits and
     pseudo hits
     */

    public Result getCount(String guess, String solution)
    {
        Result result = new Result();
        int sol_mask = 0;
        for(int i = 0;i<4;i++)
        {
            sol_mask = sol_mask | (1<<(solution.charAt(i)-'A'+1));
        }
        for(int i = 0;i<4;i++)
        {
            if(guess.charAt(i)==solution.charAt(i))
                result.hits++;
            else
                if((sol_mask & (1<<(guess.charAt(i)-'A'+1)))>=1)
                    result.pseudoHits++;
        }
        return result;
    }
}
