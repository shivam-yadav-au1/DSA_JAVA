class InsertionSort{

    public static void insertionSort(int arr[]){
        int n = arr.length;
        for(int i=1;i<n;i++){
            int key = arr[i];
            int j = i-1;
            while(j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
    }

    public static void main(String args[]){
        int a[] = {7,2,9,3,1,0,6};
        int n = a.length;
        insertionSort(a);
        for(int i=0;i<n;i++){
            System.out.print(" "+a[i]);
        }
    }
}