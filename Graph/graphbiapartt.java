import java.util.LinkedList;
import java.util.Queue;

public class graphbiapartt {
    public static boolean checkusingbfs(int source ,int garph[][],int color[])
    {
        Queue<Integer> q=new LinkedList<>();
        q.add(source);
        color[source]=0;
        while(q.isEmpty()==false)
        {
            int curr=q.remove();
            int currcolor=color[curr];
            for(int conn:garph[curr])
            {
                if(color[conn]==-1)
                {
                    // if the connection is not colored
                    color[conn]=1-currcolor;
                    q.add(conn);
                }
                else
                {
                    // already colored
                    if(currcolor==color[conn])
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public  boolean isBipartite(int[][] garph)
    {
        int n = garph.length;
        int color[]=new int [n];
        for(int i=0;i<n;i++)
        {
              color[i]=-1;
        }
        for(int i=0;i<n;i++)
        {
            if(color[i]==-1)
            {
                boolean result=checkusingbfs(i, garph, color);
                if(result==false)
                {
                    return false;
                }
            }
        }
        return true;
      
    }
    public static void main(String[] args) {
        
    }
    
}
