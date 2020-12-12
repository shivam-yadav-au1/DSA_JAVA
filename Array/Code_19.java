//Reverse An Array

class Solution{

    public static void reverse(int arr[]){

        int low = 0;
        int high = arr.length - 1;

        while(low < high){
            int temp = arr[high];
            arr[high] = arr[low];
            arr[low] = temp;
            low ++;
            high --;
        }
        
    }

    public static void main(String args[]){

        int arr [] = {8,5,0,10,0,20};
        reverse(arr);
        for(int i=0;i<arr.length-1;i++){
            System.out.print(" "+arr[i]);
        }
    }
}