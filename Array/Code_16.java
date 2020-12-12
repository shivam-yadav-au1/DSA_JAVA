

class Solution{

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

    //5 8 ,12 20
    public static int secondLargest(int arr[]){

        // int largestIndex = findLargestIndex(arr);
        // int secondLargestIndex = -1;
        // int secondMin = Integer.MIN_VALUE;
        // for(int i=0;i<arr.length - 1;i++){
        //     if(arr[i] != arr[largestIndex]){
        //         if(arr[i] > secondMin){
        //             secondMin = arr[i];
        //             secondLargestIndex = i;
        //         } 
        //     }
        // }
        // return secondLargestIndex;
        int largest = Integer.MIN_VALUE;
        int largestIndex = 0;
        int secondLargest = 0;
        int secondLargestIndex = -1;
        for(int i=0;i<=arr.length-1;i++){

            if(arr[i] > arr[largestIndex]){
               secondLargestIndex = largestIndex;
               largestIndex = i;
            }else if(arr[i] != arr[largestIndex]){
               if(secondLargestIndex == -1 || arr[i] > arr[secondLargestIndex]){
                   secondLargestIndex = i;
               }
            }
        }
        return secondLargestIndex;
    }


    public static void main(String args[]){

        int arr[] = {4,2,7,4,12,1,18};
        // int arr[] = {5,8,12,20};
        // int arr[] = {10,10,10};
        // int arr[] = {12,8,12,7};
    //    int arr[] = {5,8,12,7};
        //   int arr[] = {12,12,12,7};
        // int arr[] = {5,20,12 ,20,8};
        int secondLargestIndex = secondLargest(arr);
        if(secondLargestIndex == -1){
            System.out.println("Second largetst elemtn does not exist.");
        }else{
            System.out.println("Second Largest Element :"+ arr[secondLargestIndex]);
        }
        

    }
}