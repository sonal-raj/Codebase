package SortingAndSearching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 16/11/13
 * Time: 18:33
 * To change this template use File | Settings | File Templates.
 */
class AnagramComparator implements Comparator<String>
{
    public String sortChars(String s)
    {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return c.toString();
    }

    public int compare(String s1, String s2)
    {
        return sortChars(s1).compareTo(sortChars(s2));
    }
}
public class SortStringArray {
    /**
     * Write a method to sort an array of strings so that all the anagrams are next to each
       other
     */
    public static void main(String[] args)
    {
        String[] array = {"Hello", "World", "of", "Indian", "Programs"};
        //Populate the Array
        Arrays.sort(array, new AnagramComparator());
    }
}
