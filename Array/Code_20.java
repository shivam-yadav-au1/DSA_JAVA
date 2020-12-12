//Left rotate an array by one
// 1,2,3,4,5
/**

    2,2,3,4,5
    2,3,3,4,5
    2,3,4,4,5
    2,3,4,5,5
    2,3,4,5,1

 */
class Solution{

    public static void leftRotate(int arr[]){

        int n = arr.length - 1;
        int firstElement = arr[0];
        for(int i=0;i<n;i++){
            arr[i] = arr[i+1];    
        }
        arr[n] = firstElement;
    }

    public static void main(String args[]){

        int arr [] = {1,2,3,4,5};
        leftRotate(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(" "+arr[i]);
        }
    }
}