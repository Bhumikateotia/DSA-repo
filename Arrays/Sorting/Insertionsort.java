class Insertionsort
{
    public static void insertionSort(int arr[]) {
        // code here
        // solution 1(asending)
    //   for(int i =1;i<arr.length;i++){
    //    int key=arr[i];
    //    int j=i-1;
    //    while(j>=0&&arr[j]>key)
    //    {
    //        arr[j+1]=arr[j];
    //        j--;
    //    }
    //    arr[j+1]=key;
    //     }

    // solution 2(desending )
    for(int i =1;i<arr.length;i++){
           int key=arr[i];
           int j=i-1;
           while(j>=0&&arr[j]<key)
           {
               arr[j+1]=arr[j];
               j--;
           }
           arr[j+1]=key;
            }
        }


    //solution3 (asending)
    //     for (int i =0 ; i<=arr.length-1;i++)
    //     {
    //   int j =i;
    //      while (j>0&&arr[j-1]>arr[j])
    //      {
    //          int temp=arr[j];
    //          arr[j]=arr[j-1];
    //          arr[j-1]=temp;
    //          j--;
    //      }
        
    //     }
    // }
    
    public static void main(String[] args) {
        int arr[]={2,4,5,6,1};
        Insertionsort.insertionSort(arr);
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
}