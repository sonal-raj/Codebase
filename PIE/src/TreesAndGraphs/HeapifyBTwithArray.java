package TreesAndGraphs;
import java.util.*;
/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 09/11/13
 * Time: 15:26
 * To change this template use File | Settings | File Templates.
 */
public class HeapifyBTwithArray {

    public static BinaryTreeNode heapifyBinartTree(BinaryTreeNode root)
    {
        int size = traverse(root, 0, null); //count tne nodes
        BinaryTreeNode[] nodeArray = new BinaryTreeNode[size];
        traverse(root, 0, nodeArray); //insert elements into array

        //sort array of nodes based on their values
        Arrays.sort(nodeArray, new Comparator<BinaryTreeNode>(){
            @Override
            public int compare(BinaryTreeNode m, BinaryTreeNode n)
            {
                int mv=m.getData(); int nv = n.getData();
                return (mv<nv? -1:(mv==nv?0:1));
            }
        });

        //Reassign children for each node
        for(int i=0;i< size;i++)
        {
            int left=2*i+1;
            int right = left+1;
            //nodeArray[i].setLeft( left >= size ? null : nodeArray[left] );
            //nodeArray[i].setRight( right >= size ? null : nodeArray[right] );
        }
        return nodeArray[0]; // Return new root node
    }
    public static int traverse( BinaryTreeNode node, int count, BinaryTreeNode[] arr ){
        if( node == null )
            return count;
        if( arr != null )
            arr[count] = node;
        count++;
        count = traverse( node.getLeft(), count, arr );
        count = traverse( node.getRight(), count, arr );
        return count;
    }
}
