import java.util.ArrayList;
import java.util.Scanner;

public class Snake {

    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner s = new Scanner(System.in);
        int t = Integer.parseInt(s.nextLine());
        while((t--)!=0)
        {
            String[] temp = s.nextLine().split(" ");
            int n = Integer.parseInt(temp[0]);
            String moves = temp[1];

            //int step = 0;
            String dir = "+Y";
            ArrayList<Point> snake = new ArrayList<Point>();
            snake.add(new Point(0,0));
            snake.add(new Point(0,1));
            int i;
            for(i=0;i<n;i++)
            {   System.out.println("##i="+i+" List: "+snake);
                if(moves.charAt(i)=='F')
                {
                    Point next = getNextPoint(dir,snake.get(snake.size()-1));
                    if(contains(snake,next))
                    {
                        System.out.println(i+1);
                        break;
                    }
                    snake.remove(0);
                    snake.add(next);
                }
                else if(moves.charAt(i)=='E')
                {
                    Point next = getNextPoint(dir,snake.get(snake.size()-1));
                    if(contains(snake,next))
                    {
                        System.out.println(i+1);
                        break;
                    }
                    snake.add(next);
                }
                else if(moves.charAt(i)=='L')
                {
                    dir = chageDir(dir, 'L');
                    Point next = getNextPoint(dir,snake.get(snake.size()-1));
                    if(contains(snake,next))
                    {
                        System.out.println(i+1);
                        break;
                    }
                    snake.remove(0);
                    snake.add(next);
                }
                else if(moves.charAt(i)=='R')
                {
                    dir = chageDir(dir, 'R');
                    Point next = getNextPoint(dir,snake.get(snake.size()-1));
                    if(contains(snake,next))
                    {
                        System.out.println(i+1);
                        break;
                    }
                    snake.remove(0);
                    snake.add(next);
                }
            }
            if(i==n)
                System.out.println("YES");
        }
    }

    public static boolean contains(ArrayList snake,Point p){
        for(int i=0;i<snake.size();i++){
            Point k = (Point)snake.get(i);
            if((k.x==p.x)&&(k.y==p.y))
                return true;
        }
        return false;
    }

    public static String chageDir(String curr, char move)
    {
        if(move=='L')
        {
            if(curr.equals("+X")) return "+Y";
            if(curr.equals("-X")) return "-Y";
            if(curr.equals("+Y")) return "-X";
            if(curr.equals("-Y")) return "+X";
        }
        if(move=='R')
        {
            if(curr.equals("+X")) return "-Y";
            if(curr.equals("-X")) return "+Y";
            if(curr.equals("+Y")) return "+X";
            if(curr.equals("-Y")) return "-X";
        }
        return null;

    }
    public static Point getNextPoint(String dir, Point curr)
    {
            if(dir.equals("+X"))
                return new Point(curr.x+1,curr.y);
            if(dir.equals("-X"))
                return new Point(curr.x-1,curr.y);
            if(dir.equals("+Y"))
                return new Point(curr.x,curr.y+1);
            if(dir.equals("-Y"))
                return new Point(curr.x,curr.y-1);
            return null;

    }
}

class Point
{
    int x;
    int y;
    Point(int a, int b)
    {
        x=a;
        y=b;
    }
}
