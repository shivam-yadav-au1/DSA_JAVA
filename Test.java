class Test{

    public static void quickSort(int arr[],int start ,int end){
            if(start < end){
                int partitionIndex = partition(arr,start,end);
                quickSort(arr,start,partitionIndex + 1);
                quickSort(arr,partitionIndex + 1,end);
            }
    }   

    public static void partition(int arr[],int start,int end){
        int n = arr.length - 1;
        int pivot = arr[end];
        int i = start-1;    
        for(int j=start;j<=end-1;j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp1 = pivot;
        arr[i+1] = arr[end];
        arr[end] = temp1;
        return i+1;
    }

    public static void main(String args[]){
        int arr[] = {7,2,9,3,1,0,6};

    }
}