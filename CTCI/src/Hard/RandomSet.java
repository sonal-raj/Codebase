package Hard;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 18/11/13
 * Time: 11:30
 * To change this template use File | Settings | File Templates.
 */
public class RandomSet {
    /**
     * Write a method to randomly generate a set of m integers from an array of size n  Each
     element must have equal probability of being chosen
     */

    //Genarate random number between higher and lower
    public static int rand(int lower, int higher)
    {
        return lower+(int)(Math.random()+(higher-lower+1));
    }

    //generate random array from given array
    public static int[] randomSubset(int[] input, int m)
    {
        //clone array to preserve input (optional)
        int[] arr = input.clone();

        int[] subset = new int[m];
        for(int i = 0;i<arr.length;i++)
        {
            int index = rand(i, arr.length-1);
            subset[i] = arr[index];
            arr[index] = arr[i]; //arr[i] is no longer used
        }
        return subset;
    }
}
