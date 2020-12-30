
class SelectionSort{

    public static void selectionSort(int arr[]){
        int n = arr.length;
        int temp[] = new int[n];
        for(int i=0;i<n;i++){
            int minIndex = 0;
            for(int j = 1;j<n;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            temp[i] = arr[minIndex];
            arr[minIndex] = Integer.MAX_VALUE;
        }
        for(int k = 0;k<n;k++){
            arr[k] = temp[k];
        }
    }

    public static void inPlaceSelectionSort(int arr[]){
        int n = arr.length;
        int temp[] = new int[n];
        for(int i=0;i<n-1;i++){
            int minIndex = i;
            for(int j=i+1;j<n;j++){
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            int t = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = t;
        }
    }

    public static void main(String args[]){
        int arr[] = {7,2,9,3,1,0,6};
        int n = arr.length;
        inPlaceSelectionSort(arr);
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    }
}