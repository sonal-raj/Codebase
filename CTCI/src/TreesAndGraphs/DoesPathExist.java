package TreesAndGraphs;

import java.util.LinkedList;

/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 14/11/13
 * Time: 14:04
 * To change this template use File | Settings | File Templates.
 */
public class DoesPathExist {

    /*
        Given a directed graph, design an algorithm to find out whether there is a route be-
        tween two nodes
     */

    //a depth first search with memory of visitation is sufficient
    public enum State
    {
        Unvisited, Visited, Visiting;
    }
    /*
    public static boolean search(Graph g, Node start, Node end)
    {
        LinkedList<Node> q  = new LinkedList<Node>();
        for(Node u:g.getNodes())
        {
            u.state = State.Unvisited;
        }
        start.state =
    }
    */

}
