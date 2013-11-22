/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 18/11/13
 * Time: 03:14
 * To change this template use File | Settings | File Templates.
 */
public class ManyWordsTop10 {

    /**
     *  A huge number of words, with words constantly entering, lets say #words>MAX_INT. How to maintain Top 10 entries
     *  #Approach(If data fits in addressable memory)
     *  ==> Since this process was started from the beginning, the original list is sorted, and at a time, the new entries are unsorted
     *  ==> Since new entries will be, on an average relatively small, we sort the new entries : O(log n)
     *  ==> Then merge the 2 sorted lists into a single list : O(n+m)
     *  ==> Combined : O(m+nlogn)
     *
     *  #Approach2(If data does not fit, and is stored in file
     *  ==> Divide filed data into chunks of manageable data = n chunks of k data each;
     *  ==> Read the first chunk into memory
     *  ==> Sort the k elements & store top 10;
     *  ==> Read next chunk of k elements, merge the top 10, sort the chunk and retain top 10
     *  ==> Repeat process till data is left
     *  ==> The top ten saved in the final round are the overall top 10
     *  ==> when new data is added, only the new chunk is merged with top 10 and sorted.
     */


}
