import java.util.ArrayList;
import java.util.List;

public class AdjacencyMatrixGraph
{
    int n;
    boolean b[][];

    public AdjacencyMatrixGraph(int n0)
    {
        n=n0;
        b = new boolean[n][n];
    }

    void addEdge(int s, int d)
    {
        b[s][d]=true;
    }

    void removeEdge(int s, int d)
    {
        b[s][d]=false;
    }

    boolean hasEdge(int s, int d)
    {
        return b[s][d];
    }

    List<Integer> outEdges(int i)
    {
        List<Integer> edges = new ArrayList<Integer>();
        for(int j=0;j<n;j++)
            if(b[i][j])
                edges.add(j);
        return edges;
    }

    List<Integer> inEdges(int i)
    {
        List<Integer> edges = new ArrayList<Integer>();
        for(int j = 0;j<n;j++)
            if(b[j][i])
                edges.add(j);
        return edges;
    }


}