// Time complexity 
class HeapSort{

    public static void buildHeap(int arr[],int n){

        for(int i=(n-2)/2;i>=0;i--){
            heapify(arr,n,i);
        }
    }

    public static void heapSort(int arr[]){
        int n = arr.length;
        buildHeap(arr,n);
        for(int i=n-1;i>=0;i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr,i,0);// i is length of reduced array
        }
    }

    public static void heapify(int arr[],int n,int i){
        int largest = i;
        int left = 2*i + 1;
        int right = 2 * i + 2;
        if(left <n && arr[left] > arr[largest]){
            largest = left;
        }
        if(right < n && arr[right] > arr[largest]){
            largest = right;
        }
        if(largest !=  i){
            int swap = arr[i];
            int arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr,n,largest);
        }
    }

    public static void main(String args[]){
        int arr[] = {12, 11, 13, 5, 6, 7}; 
        heapSort(arr);
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    }
}