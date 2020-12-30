
class BubbleSort{

    public static void bubbleSort(int arr[]){
        
        int len = arr.length;
        for(int i=0;i<len-1;i++ ){
            for(int j =0;j<len-i-1;j++){
                System.out.println(" "+arr[j]+" "+arr[j+1]);
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        
    }

    public static void main(String args[]){
        int arr[] = {10,8,20,5};
        int n = arr.length;
        bubbleSort(arr);
        System.out.println("");
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    }
}