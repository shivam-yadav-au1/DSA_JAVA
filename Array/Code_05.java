class GFG{


    static void moveNegativeNumber(int arr[],int size){

        int left = 0;
        int right = size-1;

        while(left < right){

            if(arr[left] < 0 && arr[right] < 0){
                left = left + 1;
            }else if (arr[left] > 0 && arr[right] < 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left = left + 1;
                right = right - 1; 
            }else if(arr[left] > 0 && arr[right] > 0) {
                right = right - 1;
            }else {
                left = left + 1;
                right = right - 1;
            }
        }

    }

    public static void main(String[] args){
        int arr[] ={-12,11,-13,-5,6,-7,5,-3,-6};
        moveNegativeNumber(arr,9);
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}