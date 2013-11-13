package TreesAndGraphs;
import java.util.*;
/**
 * Created with IntelliJ IDEA.
 * User: sonalraj
 * Date: 09/11/13
 * Time: 16:54
 * To change this template use File | Settings | File Templates.
 */

class ActorGraphNode
{
    private String name;
    private Set<ActorGraphNode> costars;
    private int baconNumber = -1;
    public int getBaconNumber()
    {
        return baconNumber;
    }
    public ActorGraphNode(String n)
    {
        name=n;
        costars = new HashSet<ActorGraphNode>();
    }
    public void linkCostar(ActorGraphNode a)
    {
        costars.add(a);
        a.costars.add(this);
    }
    public void setBaconNumbers(){
        baconNumber = 0;
        Queue<ActorGraphNode> queue = new LinkedList<ActorGraphNode>();
        queue.add( this );
        ActorGraphNode current;
        while( (current = queue.poll()) != null ){
            for( ActorGraphNode n : current.costars ){
                if( -1 == n.baconNumber ){  //if node is unvisited
                    n.baconNumber = current.baconNumber + 1;
                    queue.add( n );
                }
            }
        }
    }

}

public class KevinBacon {

}
