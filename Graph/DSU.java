class components
{
    int[] parent;
    int [] weight;
    components(int n )
    {
        this.parent=new int[n];
        for(int i=0;i<n;i++)
        {
            parent[i]=i;
        }
        this.weight=new int[n];
        for(int idx=0;idx<n;idx++)
        {
            weight[idx]=1;
        }
    }
    // path comprassion (we did  this bacause we want to find the parent of that particular node in constant time)
    int find(int indx)
    {
        if(parent[indx]==indx)
        {
            return indx;
        }
        return parent[indx]=find(parent[indx]);
    }
    void union(int a,int b)
    {
        int pa = find(a);
        int pb =find(b);
        if(pa==pb)
        {
            return;
        }
        if(weight[pa]>weight[pb])
        {
            parent[pb]=pa;
            weight[pa]+=weight[pb];
        }
        else
        {

            parent[pa]=pb;
            weight[pb]+=weight[pa];
        
        }
    }
}



public class DSU {
    public static void main(String[] args) {
        
    }
    
}
