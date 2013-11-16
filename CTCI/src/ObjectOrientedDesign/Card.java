package ObjectOrientedDesign;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 15/11/13
 * Time: 15:36
 * To change this template use File | Settings | File Templates.
 */
public class Card {

    /**
     *  Design the data structures for a generic deck of cards  Explain how you would sub-
        class it to implement particular card games
     */
    public enum Suit
    {
        CLUBS(1),SPADES(2),HEARTS(3),DIAMONDS(4);
        int value;
        private Suit(int v) {value = v;}
    }

    private int card;
    private Suit suit;

    public Card(int r, Suit s)
    {
        card = r;
        suit = s;
    }
    public int value()
    {
        return card;
    }
    public Suit suit()
    {
        return suit;
    }
}

/**
 * Assume that we’re building a blackjack game, so we need to know the value of the cards
 Face cards are ten and an ace is 11 (most of the time, but that’s the job of the Hand class, not
 the following class)
 */

class BlackJackCard extends Card
{
    public BlackJackCard(int r, Suit s)
    {
        super(r,s);
    }
    //modify/override the default value() method
    public int value()
    {
        int r = super.value();
        if(r==1) return 11; //Ace is eleven
        else return 10;     //face cards are 10
    }

    boolean isAce()
    {
        return (super.value()==1);
    }
}