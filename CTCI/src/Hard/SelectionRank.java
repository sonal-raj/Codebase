package Hard;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 18/11/13
 * Time: 12:23
 * To change this template use File | Settings | File Templates.
 */
public class SelectionRank {
    /**
     * Selection Rank is a well known algorithm in computer science to find the ith smallest (or largest) element in an array in expected linear time.

     The basic algorithm for finding the ith smallest elements goes like this:
     »»Pick a random element in the array and use it as a ‘pivot’. Move all elements smaller than that element to one side of the array, and all elements larger to the other side.
     »»If there are exactly i elements on the right, then you just find the smallest element on that side.
     »»Otherwise, if the right side is bigger than i, repeat the algorithm on the right. If the right side is smaller than i, repeat the algorithm on the left for i – right.size().

     Given this algorithm, you can either:
     »»Tweak it to use the existing partitions to find the largest i elements (where i = one million).
     »»Or, once you find the ith largest element, run through the array again to return all elements greater than or equal to it.
     */
    public static int rank(int[] a, int left, int right, int rank)
    {
        //generate the pivot randomly
        int pivot = random(left, right);

        //partition and return left end of partition
        int leftEnd = partition(a,left, right, pivot);
        int leftSize = leftEnd-left+1;
        if(leftSize==rank+1)
            return Math.max(a[left],a[leftEnd]);
        else if(rank<leftSize)
            return rank(a,left,leftEnd,rank);
        else
            return rank(a,leftEnd+1,right,rank-leftSize);
    }

    public static int partition(int[] arr, int left, int right, int pivot)
    {
        while(left<=right)
        {
            //till an element greater than pivot found
            while(arr[left]<=arr[pivot])
                left++;

            //till an element less than pivot found
            while(arr[right]>=arr[pivot])
                right--;

            swap(arr, left, right);
        }
        return left-1;
    }

    public static int random(int start, int end)
    {
        return start+(int)(Math.random()*(end-start+1));
    }
    public static void swap(int[] a, int left, int right)
    {
        int temp = a[left];
        a[left]=a[right];
        a[right]=temp;
    }
}
