public  class selectionsort
{
    public  static void Sort(int[] arr) {
        // code here
        for(int i=0;i<arr.length-1;i++)
        {
            int minindex=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[minindex])
                {
                    minindex=j;
                }
            }
            int temp = arr[i];
            arr[i]=arr[minindex];
            arr[minindex]=temp;
        }
    }
    public static void main(String[] args) {
        int arr[]={4,1,3,9,7};
        selectionsort.Sort(arr);
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
        
    }
}