import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class courseschedule {
    public static boolean courseschedulling(int n , int[][] pre)
    {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        int indegree[]= new int[n];
        for(int i =0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int i =0;i<pre.length;i++)
        {
            int a = pre[i][0];
            int b = pre[i][1];
            adj.get(b).add(a);
            indegree[a]++;
        }
         Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<n;i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
            }
        }
        ArrayList<Integer> ans= new ArrayList<>();
        while (q.isEmpty()==false) {
            int curr=q.remove();
            ans.add(curr);
            for(int conn:adj.get(curr))
            {
                indegree[conn]--;
                if(indegree[conn]==0)
                {
                    ans.add(conn);
                }
            }
        }
        if(ans.size()==n)// no cycle
        {
            return true;
        }
        else// cycle 
        {
            return false;
        }

    }
    public static void main(String[] args) {
        
        
    }
    
}
