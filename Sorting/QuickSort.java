class QuickSort{

    static void quickSort(int arr[],int start,int end){
        if(start < end){
            int pIndex = partition(arr,start,end);
            quickSort(arr,start,pIndex - 1);
            quickSort(arr,pIndex+1,end);
        }
    }

    static int partition(int arr[],int start,int end){
        int n = arr.length - 1;
        int pivot = arr[end];
        int i =  start - 1;
        for(int j=start;j<=end-1;j++){
            if(arr[j] < pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp; 
            }
        }
        int temp1 = arr[i+1];
        arr[i+1] = pivot;
        arr[end] = temp1;
        return i+1;
    }
    

    public static void main(String args[]){
        int arr [] = {7,2,1,6,8,5,3,4};
        int start = 0;
        int end = arr.length - 1;
        quickSort(arr,start,end);

        for(int i=0;i<= end;i++){
            System.out.print(" "+arr[i]);
        }
    }   
}