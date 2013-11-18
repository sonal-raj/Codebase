package Moderate;

import java.util.Hashtable;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 17/11/13
 * Time: 19:52
 * To change this template use File | Settings | File Templates.
 */
public class FrequencyOfWord {
    /**
     * Design a method to find the frequency of occurrences of any given word in a book
     */

    public static Hashtable<String, Integer> setDictionary(String[] book)
    {
        Hashtable<String, Integer> dict = new Hashtable<String, Integer>();
        for(String word:book)
        {
            word = word.toLowerCase();
            if(word.trim()!="")
            {
                if(!dict.containsKey(word))
                    dict.put(word,1);
                else
                    dict.put(word, dict.get(word)+1);
            }

        }
        return dict;
    }

    public static int getFreq(String[] book, String word)
    {
        if(book==null || word==null)
            return -1;
        Hashtable<String, Integer> dict = setDictionary(book);
        if(dict==null)
            return -1;
        word = word.toLowerCase();
        return (dict.containsKey(word)?dict.get(word):0);
    }
}
