import java.util.*;

/*
class Node
{
    public char label;
    public boolean visited=false;
    public Node(char l)
    {
        this.label=l;
    }
}
*/

public class BreadthFirstSearch
{

    public Node rootNode;
    public ArrayList nodes=new ArrayList();
    public int[][] adjMatrix;//Edges will be represented as adjacency Matrix
    int size;
    public void setRootNode(Node n)
    {
        this.rootNode=n;
    }

    public Node getRootNode()
    {
        return this.rootNode;
    }

    public void addNode(Node n)
    {
        nodes.add(n);
    }

    //This method will be called to make connect two nodes
    public void connectNode(Node start,Node end)
    {
        if(adjMatrix==null)
        {
            size=nodes.size();
            adjMatrix=new int[size][size];
        }

        int startIndex=nodes.indexOf(start);
        int endIndex=nodes.indexOf(end);
        adjMatrix[startIndex][endIndex]=1;
        adjMatrix[endIndex][startIndex]=1;
    }

    private Node getUnvisitedChildNode(Node n)
    {

        int index=nodes.indexOf(n);
        int j=0;
        while(j<size)
        {
            if(adjMatrix[index][j]==1 && ((Node)nodes.get(j)).visited==false)
            {
                return (Node)nodes.get(j);
            }
            j++;
        }
        return null;
    }

    private void bfs()
    {
        //BFS uses Queue data structure
        Queue q=new LinkedList();
        q.add(this.rootNode);
        printNode(this.rootNode);
        rootNode.visited=true;
        while(!q.isEmpty())
        {
            Node n=(Node)q.remove();
            Node child=null;
            while((child=getUnvisitedChildNode(n))!=null)
            {
                child.visited=true;
                printNode(child);
                q.add(child);
            }
        }
        //Clear visited property of nodes
        clearNodes();
    }

    private void printNode(Node n)
    {
        //System.out.print(n.label+" ");
    }

    private void clearNodes()
    {
        int i=0;
        while(i<size)
        {
            Node n=(Node)nodes.get(i);
            n.visited=false;
            i++;
        }
    }

    public static void main(String[] args)
    {
        Node nA=new Node('A');
        Node nB=new Node('B');
        Node nC=new Node('C');
        Node nD=new Node('D');
        Node nE=new Node('E');
        Node nF=new Node('F');

        //Create the graph, add nodes, create edges between nodes
        BreadthFirstSearch g=new BreadthFirstSearch();
        g.addNode(nA);
        g.addNode(nB);
        g.addNode(nC);
        g.addNode(nD);
        g.addNode(nE);
        g.addNode(nF);
        g.setRootNode(nA);

        g.connectNode(nA,nB);
        g.connectNode(nA,nC);
        g.connectNode(nA,nD);

        g.connectNode(nB,nE);
        g.connectNode(nB,nF);
        g.connectNode(nC,nF);


        //Perform the traversal of the graph
        //System.out.println("DFS Traversal of a tree is ------------->");
        //g.dfs();

        System.out.println("\nBFS Traversal of a tree is ------------->");
        g.bfs();
    }
}