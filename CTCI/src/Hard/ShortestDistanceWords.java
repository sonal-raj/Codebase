package Hard;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 18/11/13
 * Time: 11:58
 * To change this template use File | Settings | File Templates.
 */
public class ShortestDistanceWords {
    /**
     * You have a large text file containing words  Given any two words, find the shortest
     distance (in terms of number of words) between them in the file  Can you make the
     searching operation in O(1) time? What about the space complexity for your solu-
     tion?
     */
    public static int wordPathLength(String[] words, String word1, String word2)
    {
        int min = Integer.MAX_VALUE/2;
        int word1_pos = -min;
        int word2_pos = -min;
        for(int i=0;i<words.length;i++)
        {
            String curr = words[i];
            if(curr.equals(word1))
            {
                word1_pos = i;
                //Assuming order of word1 and word2 is not important
                int distance = word1_pos-word2_pos;
                if(distance<min)
                    min = distance;
            }
            else if(curr.equals(word2))
            {
                word2_pos = i;
                int distance = (word2_pos-word1_pos);
                if(distance<min)
                    min = distance;
            }
        }
        return min;
    }

    // To solve in O(n) time use HashMap to save the words with positions, retrieve and return difference.
}
