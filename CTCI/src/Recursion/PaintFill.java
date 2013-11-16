package Recursion;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 16/11/13
 * Time: 17:41
 * To change this template use File | Settings | File Templates.
 */
public class PaintFill {
    /**
     * Implement the “paint fill” function that one might see on many image editing pro-
     grams   That is, given a screen (represented by a 2-dimensional array of Colors), a
     point, and a new color, fill in the surrounding area until you hit a border of that color
     */
    public enum Color
    {
        BLACK ,WHITE, RED, GREEN, BLUE;
    }
    public static boolean paintFill(Color[][] screen, int x, int y, Color ncolor)
    {
        return paintFill(screen, x, y, screen[x][y], ncolor);
    }
    public static boolean paintFill(Color[][] screen, int x, int y, Color oColor,Color nColor)
    {
        if(x<0 || x>screen[0].length || y<0 || y>screen.length)
        {
            return false;
        }
        if(screen[x][y]==oColor)
        {
            screen[x][y]=nColor;
            paintFill(screen, x-1, y, oColor, nColor); //go left to check
            paintFill(screen, x+1, y, oColor, nColor); //go right and check
            paintFill(screen, x, y-1, oColor, nColor); //go top and check
            paintFill(screen, x, y+1, oColor, nColor); //go down and check
        }
        return true;
    }
}
