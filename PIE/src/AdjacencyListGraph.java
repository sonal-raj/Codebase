import java.util.*;

public class AdjacencyListGraph
{
    //uses Map to store adjacency list for each vertex
    private Map<Integer, List<Integer>> adjacencyList;

    //Initialize map size to number of vertices in the graph
    public AdjacencyListGraph(int n)
    {
        adjacencyList = new HashMap<Integer, List<Integer>>();
        for(int i=0;i<n;i++)
            adjacencyList.put(i,new LinkedList<Integer>());
    }

    public void setEdge(int source, int destination)
    {
        if(source>adjacencyList.size() || destination>adjacencyList.size())
        {
            System.out.println("Vertex not present!!");
            return;
        }
        List<Integer> slist = adjacencyList.get(source);
        slist.add(destination);
        List<Integer> dlist = adjacencyList.get(destination);
        dlist.add(source);
    }

    public List<Integer> getEdge(int source)
    {
        if(source>adjacencyList.size())
        {
            System.out.println("Vertex not present!!");
            return null;
        }
        return adjacencyList.get(source);
    }

    public static void main(String[] args)
    {
        int source , destination;
        int number_of_edges,number_of_vertices;
        int count = 1;
        Scanner scan = new Scanner(System.in);
        try
        {
             /* Read the number of vertices and edges in graph */
            System.out.println("Enter the number of vertices and edges in graph");
            number_of_vertices = scan.nextInt();
            number_of_edges = scan.nextInt();
            AdjacencyListGraph adjacencyList = new AdjacencyListGraph(number_of_vertices);

             /* Reads the edges present in the graph */
            System.out.println("Enter the edges in graph Format : <source index> <destination index>");
            while (count <= number_of_edges)
            {
                source = scan.nextInt();
                destination = scan.nextInt();
                adjacencyList.setEdge(source, destination);
                count++;
            }

             /* Prints the adjacency List representing the graph.*/
            System.out.println ("the given Adjacency List for the graph \n");
            for (int i = 1 ; i <= number_of_vertices ; i++)
            {
                System.out.print(i+"->");
                List<Integer> edgeList = adjacencyList.getEdge(i);
                for (int j = 1 ; ; j++ )
                {
                    if (j != edgeList.size())
                    {
                        System.out.print(edgeList.get(j - 1 )+"->");
                    }else
                    {
                        System.out.print(edgeList.get(j - 1 ));
                        break;
                    }
                }
                System.out.println();
            }
        }
        catch(InputMismatchException inputMismatch)
        {
            System.out.println("Error in Input Format. \nFormat : <source index> <destination index>");
        }
        scan.close();
    }
}
