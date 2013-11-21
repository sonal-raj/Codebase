package Hard;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 18/11/13
 * Time: 19:17
 * To change this template use File | Settings | File Templates.
 */
public class DynamicMedian {
    /**
     * Numbers are randomly generated and passed to a method   Write a program to find
     and maintain the median value as new values are generated
     */
    //private Comparator<Integer> maxHeapComparator, minHeapComparator;
    private PriorityQueue<Integer> maxHeap, minHeap;

    public void addNewNumber(int randomNumber)
    {
        if(maxHeap.size()==minHeap.size())
        {
            if(minHeap.peek()!=null && randomNumber>minHeap.peek())
            {
                maxHeap.offer(minHeap.poll());
                minHeap.offer(maxHeap.poll());
            }
            else
                maxHeap.offer(randomNumber);
        }
        else
        {
            if(randomNumber<maxHeap.peek())
            {
                minHeap.offer(maxHeap.poll());
                maxHeap.offer(randomNumber);
            }
            else
                minHeap.offer(randomNumber);
        }
    }

    public double getMedian()
    {
        if(maxHeap.isEmpty())
            return minHeap.peek();
        else if(minHeap.isEmpty())
            return maxHeap.peek();
        if(maxHeap.size()==minHeap.size())
            return (maxHeap.peek()+minHeap.peek())/2;
        else if(maxHeap.size()>minHeap.size())
            return maxHeap.peek();
        else
            return minHeap.peek();
    }

}
