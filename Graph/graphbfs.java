package Graph;
import java.util.*;
public class graphbfs {
    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj)
    {
        int n = adj.size();
        ArrayList<Integer> ans = new ArrayList<>();// return the final array list 
        Queue<Integer> q= new LinkedList<>();// add the visted node\
        int visit[]=new int[n]; // create a array of n size to mark the each and every elment visited
        q.add(0);// add the zero in the queue
        visit[0]=1;// mark the firstelmenet visted as 1
        while (!q.isEmpty()==false)
        {
            int curr=q.remove();// remove the element 
            ans.add(curr);// and into the ans list
            for(int conn:adj.get(curr))
            {
                 if(visit[conn]==0)// if the conn are not visited mark them visited as 1 and add this into the queue
                 {
                    visit[conn]=1;
                    q.add(conn);
                 }
            }
        }
 return ans;
    }
    public static void main(String[] args) {
        
    }
    
}

    

