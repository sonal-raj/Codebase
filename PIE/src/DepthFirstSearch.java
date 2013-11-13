import java.util.*;
/*
    Use of the DFS algorithm
    ========================================
    1. Testing whether G is connected
    2. Computing a spanning Tree of G , if G is connected
    3. Computing path between 2 vertices if exists
    4. Computing a cycle in G, or reporting that G has no cycles
 */
class NNode
{
    public char label;
    public boolean visited=false;
    public NNode(char l)
    {
        this.label=l;
    }
}

public class DepthFirstSearch
{
    public NNode rootNNode;
    public ArrayList NNodes=new ArrayList();
    public int[][] adjMatrix;//Edges will be represented as adjacency Matrix
    int size;
    public void setRootNNode(NNode n)
    {
        this.rootNNode=n;
    }

    public NNode getRootNNode()
    {
        return this.rootNNode;
    }

    public void addNNode(NNode n)
    {
        NNodes.add(n);
    }

    //This method will be called to make connect two NNodes
    public void connectNNode(NNode start,NNode end)
    {
        if(adjMatrix==null)
        {
            size=NNodes.size();
            adjMatrix=new int[size][size];
        }

        int startIndex=NNodes.indexOf(start);
        int endIndex=NNodes.indexOf(end);
        adjMatrix[startIndex][endIndex]=1;
        adjMatrix[endIndex][startIndex]=1;
    }

    private NNode getUnvisitedChildNNode(NNode n)
    {

        int index=NNodes.indexOf(n);
        int j=0;
        while(j<size)
        {
            if(adjMatrix[index][j]==1 && ((NNode)NNodes.get(j)).visited==false)
            {
                return (NNode)NNodes.get(j);
            }
            j++;
        }
        return null;
    }

    public void dfs()
    {
        //DFS uses Stack data structure
        Stack s=new Stack();
        s.push(this.rootNNode);
        rootNNode.visited=true;
        printNNode(rootNNode);
        while(!s.isEmpty())
        {
            NNode n=(NNode)s.peek();
            NNode child=getUnvisitedChildNNode(n);
            if(child!=null)
            {
                child.visited=true;
                printNNode(child);
                s.push(child);
            }
            else
            {
                s.pop();
            }
        }
        //Clear visited property of NNodes
        clearNNodes();
    }

    private void printNNode(NNode n)
    {
        System.out.print(n.label+" ");
    }

    private void clearNNodes()
    {
        int i=0;
        while(i<size)
        {
            NNode n=(NNode)NNodes.get(i);
            n.visited=false;
            i++;
        }
    }

    public static void main(String[] args)
    {
        NNode nA=new NNode('A');
        NNode nB=new NNode('B');
        NNode nC=new NNode('C');
        NNode nD=new NNode('D');
        NNode nE=new NNode('E');
        NNode nF=new NNode('F');

        //Create the graph, add NNodes, create edges between NNodes
        DepthFirstSearch g=new DepthFirstSearch();
        g.addNNode(nA);
        g.addNNode(nB);
        g.addNNode(nC);
        g.addNNode(nD);
        g.addNNode(nE);
        g.addNNode(nF);
        g.setRootNNode(nA);

        g.connectNNode(nA,nB);
        g.connectNNode(nA,nC);
        g.connectNNode(nA,nD);

        g.connectNNode(nB,nE);
        g.connectNNode(nB,nF);
        g.connectNNode(nC,nF);


        //Perform the traversal of the graph
        System.out.println("DFS Traversal of a tree is ------------->");
        g.dfs();

        //System.out.println("\nBFS Traversal of a tree is ------------->");
        //g.bfs();
    }
}