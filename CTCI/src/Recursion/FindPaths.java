package Recursion;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 15/11/13
 * Time: 20:55
 * To change this template use File | Settings | File Templates.
 */
class Point
{
    private int x;
    private int y;
    public Point(int a, int b)
    {
        x=a;y=b;
    }
}
public class FindPaths {
    /**
     * Imagine a robot sitting on the upper left hand corner of an NxN grid  The robot can
     only move in two directions: right and down  How many possible paths are there for
     the robot?
     FOLLOW UP
     Imagine certain squares are “off limits”, such that the robot can not step on them
     Design an algorithm to get all possible paths for the robot
     */
     ArrayList<Point> curr_path = new ArrayList<Point>();

    public boolean getPaths(int x, int y)
    {
        Point p = new Point(x,y);
        curr_path.add(p);
        //If curr_path is complete
        if(x==0 && y==0)
            return true;
        boolean success = false;
        if(x>=1 && is_free(x-1,y))
            success = getPaths(x-1,y);
        if(!success && y>=1 && is_free(x,y-1))
            success = getPaths(x,y-1);
        if(!success)
            curr_path.remove(p);

        return success;

    }

    public boolean is_free(int x, int y)
    {
        //From given points of restriction , match the existance of x and y.
        // return result accordingly

        return true;
    }

}
