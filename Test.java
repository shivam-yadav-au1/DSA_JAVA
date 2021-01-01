class Test{

    public static void mergeSort(int arr[],int low,int high){
        if(low<high){
            int mid = low + (high - low )/2;
            mergeSort(arr,low,mid);
            mergeSort(arr,mid+1,high);
            merge(arr,low,mid,high);
        }

    }

    public static void merge(int arr[],int low,int mid,int high){
        int n1 = mid-low+1;
        int n2 = high - mid;
        int left[] = new int[n1];
        int right[] = new int[n2];
        for(int i=0;i<n1;i++){
            left[i] = arr[low+i];
        }
        for(int j=0;j<n2;j++){
            right[j] = arr[mid+1+j];
        }
        int i=0;int j=0;int k=low;
        while(i<n1 && j<n2){
            if(left[i] <= right[j]){
                arr[k++] = left[i++];
            }else{
                arr[k++] = right[j++];
            }
        }
        while(i<n1){
            arr[k++] = left[i++];
        }
        while(j<n2){
            arr[k++] = right[j++];
        }

    }

    public static void main(String args[]){
        int arr[] = {43,12,9,48,2,23,66};
        // int arr2[] = {5,6,6,15};
        int low = 0;
        int high = 6;
        mergeSort(arr,low,high);
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}