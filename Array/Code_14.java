//find the index of largest element in array.

class Solution {

    
    public static int findLargestIndex(int arr[]){

        int index = 0;
        int largestElement = Integer.MIN_VALUE;
        for(int i=0;i<=arr.length - 1;i++){
            if(arr[i] > largestElement){
                largestElement = arr[i];
                index = i;
            }
        }
        return index;
    }

    public static void main(String args[]){

        // int arr[] = {4,6,9,20,12,11};
        int arr[] = {10,5,8,20};
        int indexOfLargestElement = findLargestIndex(arr);
        System.out.println("Largest Element  : "+arr[indexOfLargestElement]);
    }
}