package Hard;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 18/11/13
 * Time: 11:23
 * To change this template use File | Settings | File Templates.
 */
public class CardShuffle {
    /**
     * Write a method to shuffle a deck of cards  It must be a perfect shuffle - in other words,
     each 52! permutations of the deck has to be equally likely   Assume that you are given
     a random number generator which is perfect
     */
    public void shuffle(int[] cards)
    {
        int i, index, temp;
        for(i=0;i<cards.length;i++)
        {
            index = (int)(Math.random()*(cards.length-i))+i;
            //We make sure that the same card is not selected always by swapping it with the index element
            temp = cards[i];
            cards[i]=cards[index];
            cards[index]=temp;
        }
    }
}
