class HoarePartition{

    public static int partition(int arr[],int low,int high){
        int pivot = arr[low];
        int i = low-1;int j = high+1;
        while(true){
            do{
                i++;
            }while(arr[i] <pivot);
            do{
                j--;
            }while(arr[j] > pivot);
            if(i >= j){
                return j;
            }
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String args[]){
        int arr[] = {5,3,8,4,2,7,1,10};
        partition(arr,0,7);
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    }
}