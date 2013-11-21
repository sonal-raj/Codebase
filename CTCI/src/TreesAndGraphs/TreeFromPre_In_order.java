package TreesAndGraphs;
import java.util.*;
/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 20/11/13
 * Time: 21:11
 * To change this template use File | Settings | File Templates.
 */
public class TreeFromPre_In_order {
    /**
     * Please build a binary tree with a pre-order traversal sequence and an in-order traversal
     sequence. All elements in these two given sequences are unique.
     For example, if the input pre-order traversal sequence is {1, 2, 4, 7, 3, 5, 6, 8} and in-order traversal order is {4, 7,
     2, 1, 5, 3, 8, 6}, the built tree is shown in Figure 6-13.
     */

    public BSTNode constructBinaryTree(List preOrder, List inOrder)
    {
        BSTNode BSTNode = null;
        List leftPreOrder;
        List rightPreOrder;
        List leftInorder;
        List rightInorder;
        int inorderPos;
        int preorderPos;

        if ((preOrder.size() != 0) && (inOrder.size() != 0))
        {
            //  Assign the first element of preorder traversal as root
            BSTNode node= new BSTNode(((Integer) preOrder.get(0)).intValue());

            //  Based upon the current BSTNode data seperate the traversals into leftPreorder, rightPreorder,
            //  leftInorder, rightInorder lists
            inorderPos = inOrder.indexOf(preOrder.get(0));
            leftInorder = inOrder.subList(0, inorderPos);
            rightInorder = inOrder.subList(inorderPos + 1, inOrder.size());

            preorderPos = leftInorder.size();
            leftPreOrder = preOrder.subList(1, preorderPos + 1);
            rightPreOrder = preOrder.subList(preorderPos + 1, preOrder.size());

           node.setLeft(constructBinaryTree(leftPreOrder, leftInorder)) ;
           node.setLeft(constructBinaryTree(rightPreOrder, rightInorder));
        }

        return BSTNode;
    }
}
