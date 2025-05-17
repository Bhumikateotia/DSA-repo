import java.util.ArrayList;
import java.util.Queue;
import java.util.*;

public class BFSingraph {
    public static ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj)
    {
          int n = adj.size();
          ArrayList<Integer> ans = new ArrayList<>();
          Queue<Integer> q = new LinkedList<>();
          int visit[]= new int[n];// create a visit array of size n 
          q.add(0);
          visit[0]=1;
          while (q.isEmpty()==false)
          {

        int curr=q.remove();
        ans.add(curr);
        for(int conn:adj.get(curr))
        {
            if(conn==0)
            {
                visit[conn]=1;
                q.add(conn);// add the connection into the queue

            }
            
        }
         return ans;
       
    }
    

    }
    public static void main(String[] args)
    {


    }
}
