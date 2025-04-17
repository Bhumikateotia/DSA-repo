public class maximumsubarray {
    public int maxSubArray(int[] nums) {
        int maxsum=Integer.MIN_VALUE;
        int currentsum=0;
        for(int i=0;i<nums.length;i++)
        {
            currentsum+=nums[i];
          
            maxsum=Math.max(currentsum,maxsum);
              if(currentsum<0)
            {
                currentsum=0;
            }

            
        }
        return maxsum;
}
 public static void main(String[] args) {
    
 }
    
}
