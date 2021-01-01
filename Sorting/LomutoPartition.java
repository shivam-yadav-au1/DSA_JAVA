class LomutoPartition{

    public static void partition(int arr[]){
        int n = arr.length - 1;
        int pivotIndex = n;
        int pivot = arr[pivotIndex];
        int i = -1;
        for(int j=0;j<=n-1;j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp2 = arr[i+1];
        arr[i+1] = pivot;
        arr[n] = temp2;
    }

    public static void main(String args[]){
        int arr[] = {10,80,30,90,40,50,70};
        partition(arr);
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
            
    }
}