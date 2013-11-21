package TreesAndGraphs;
import java.util.Stack;
/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 20/11/13
 * Time: 20:54
 * To change this template use File | Settings | File Templates.
 */
public class ZigZagTraversal {
    /**
     * Traverse a tree level wise in zigzag manner
     */
     public static void zigzag(BSTNode root)
     {
         if(root==null)
             return;

         Stack<BSTNode> level1 = new Stack<BSTNode>();
         Stack<BSTNode> level2 = new Stack<BSTNode>();
         int Curr = 0;
         int Next = 1;

         level1.push(root);
         while(!level1.isEmpty() || !level2.isEmpty())
         {
             /*
         }
             BinaryTreeNode* pNode = levels[current].top();
             levels[current].pop();

             printf("%d ", pNode->m_nValue);

             if(current == 0) {
                 if(pNode->m_pLeft != NULL)
                     levels[next].push(pNode->m_pLeft);
                 if(pNode->m_pRight != NULL)
                     levels[next].push(pNode->m_pRight);
             }
             else {
                 if(pNode->m_pRight != NULL)
                     levels[next].push(pNode->m_pRight);
                 if(pNode->m_pLeft != NULL)
                     levels[next].push(pNode->m_pLeft);
             }

             if(levels[current].empty()) {
                 printf("\n");
                 */
         }
     }

}
