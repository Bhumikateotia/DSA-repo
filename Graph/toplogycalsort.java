import java.util.ArrayList;
import java.util.LinkedList;
import java.util.*;

public class toplogycalsort{
    static boolean detectcycleindirectedgraph(ArrayList<ArrayList<Integer>> adj)
    {
        int n = adj.size();
        int indegree[]=new int[n];
        for(int curr=0;curr<n;curr++)
        {
            for(int conn:adj.get(curr))
            {
                indegree[conn]++;
            }
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
            return false;
        }
        else// cycle 
        {
            return true;
        }
    }
public static void main(String[] args) {
    
}
}

