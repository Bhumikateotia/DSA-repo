import java.util.*;

public class rottenoranges {
    static class Pair
    {
        int r , c,t ;
        public Pair(int r,int c,int t)
        {
             this.r=r;
             this.c=c;
             this.t=t;
        }
    }

    // 0-> empty,1->fresh ,2 ->rotten
  
   public int organerotten(int[][] grid)
    {
     Queue<Pair> q = new ArrayDeque<>();
    // if the any fresh orange cant be rotten then we simply return -1 for that we decalre a variable fresh that how many fresh oranges are rotten
    int fresh =0,maxtime=0;
    for(int r=0;r<grid.length;r++)
    {
        for(int c=0;c<grid[0].length;c++)
        {
             if(grid[r][c]==2)
             {
                q.add(new Pair(r,c,0));// the already rotten orange take time 0s  to rotten 
             }
             else if( grid[r][c]==1)
             {
                fresh++;
             }
        }
        int dr[]={-1,1,0,0};
        int dc[]={0,0,-1,1};
        while(q.size()>0)
        {
            Pair curr= q.remove();
            for(int d=0;d<dr.length;d++)
            {
                int r =curr.r+dr[d];
                int c= curr.c+dc[d];
            
            if(r>=0&& r<grid.length&&c>=0&&c<grid[0].length&&grid[r][c]==1)
            {
                    q.add(new Pair(r,c,curr.t+1));
                    maxtime = curr.t+1;
                    grid[r][c]=2;
                    fresh--;

            }
        }
        }
        if(fresh>0)
        {
            return -1;
        }
        else
        {
        return maxtime;
        }
    }
}
    public static void main(String[] args) {
        
    }
}
    
