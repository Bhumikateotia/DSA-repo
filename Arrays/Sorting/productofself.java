public class productofself {
    public int[] productExceptSelf(int[] nums) {
        // int n = nums.length;
        // int res[]= new int[n];
        // for(int i=0;i<n;i++)
        // {
        //     int product=1;
        //     for(int j=0;j<n;j++)
        //     {
        //         if(j!=i)// not adding the self array index element 
        //         {
        //             product = product *nums[j];
        //         }
        //         res[i]=product;
        //     }
        // }
        // return res;
        int n = nums.length;
        int prefix[]= new int [n];
        int suffix[]= new int [n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++)
        {
            prefix[i]=prefix[i-1]*nums[i];

        }
        suffix[n-1]=nums[n-1];
        for(int i = n-2;i>=0;i--)
        {
            suffix[i]=suffix[i+1]*nums[i];
        }
        int [] res= new int[n];
        for(int i=1;i<n-1;i++)
        {
            res[i]=prefix[i-1]*suffix[i+1];
        }
        res[0]=suffix[1];
        res[n-1]=prefix[n-2];
        return res;
    }
    public static void main(String[] args) {
        
    }
    
}
