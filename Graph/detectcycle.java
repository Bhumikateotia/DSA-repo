package Graph;
import java.util.*;
public class detectcycle {
    public static boolean iscycle( int source,ArrayList<ArrayList<Integer>> adj,boolean isvisted[])
    {
           Queue<Integer> q = new LinkedList<>();
           q.add(source);
           isvisted[source]=true;
           while (q.isEmpty()==false)
           {
              int curr = q.remove();
              for(int conn:adj.get(curr))
              {
                if(isvisted[curr]== true)
                {
                    // there is a cycle in the list
                    return true;
                }
                else
                {
                    isvisted[conn]=true;
                    q.add(conn);
                }
              }
           }
           return false;
    }
    public static void main(String[] args) {
        
    }
    
}
