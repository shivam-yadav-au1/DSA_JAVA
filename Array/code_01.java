class Array {


    static void printArray (int arr[]){
        int size = arr.length;
        for(int i=0;i<size;i++){
            System.out.print(arr[i]);
        }
    }

    static void rvereseArray(int arr[]){
        int startIndex = 0;
        int endIndex = arr.length - 1;
        int temp ;
        while(startIndex < endIndex){
            temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
            startIndex = startIndex + 1;
            endIndex = endIndex - 1;
        }
    }


    
         
        int arr[] = {1, 2, 3, 4, 5, 6};
        printArray(arr);
        rvereseArray(arr);
        System.out.print("Reverse array is \n");
        printArray(arr); 
        
    }
}