class BinarySearch{
      /**
        L         M          H
        10 23 40 76 130 150 166 
       */
     
    public static int search(int arr[],int value){
        int low = 0;
        int high = arr.length -1;
        int mid = (low + high) / 2;
        // System.out.println(mid);
        int index = -1;
        while(low <= high){
            if(value < arr[mid]){
                high = mid;
                mid = (low + high) / 2;
            }else if(value > arr[mid]){
                low = mid;
                mid = (low + high) / 2;
            }else{
                index = mid;
                return index;
            }   
        }
        return index;

    }

    public static int searchRecursive(int arr[],int low,int high,int x){
        
        /**
        L         M          H
        10 23 40 76 130 150 166 
       */

        int mid = (low + high) / 2;
        int index = -1;
        if(x < arr[mid]){
            return searchRecursive(arr,low,mid-1,x);
        }else if(x > arr[mid]){
            return searchRecursive(arr,low + 1,high,x);
        }else{
            return mid;
        }
    }

    public static int firstOccurrence(int arr[],int low,int high,int x){
        
        int mid = (low + high) / 2;
        int index = -1;
        if(x > arr[mid]){
            return firstOccurrence(arr,low + 1,high,x);
        }else if(x < arr[mid]){
            return firstOccurrence(arr,low,mid-1,x);
        }else{
            if(mid == 0 || arr[mid-1] !=arr[mid] ){
                return mid;
            }else{
                return firstOccurrence(arr,low,mid-1,x);
            }
        }
    }

    public static int lastOccurrence(int arr[],int low,int high,int x){
        if(low > high) return -1;
        int mid = (low + high) / 2;
        if(x > arr[mid]){
            return lastOccurrence(arr,mid+1,high,x);
        }else if(x < arr[mid]){
            return lastOccurrence(arr,low,mid-1,x);
        }else{
            if(mid == arr.length-1 || arr[mid+1] != arr[mid]){
                return mid;
            }else{
                return lastOccurrence(arr,mid+1,high,x);
            }
        }
    }
    // 0 0 0 0 1 1 1 1 1
    public static int countOnes(int arr[]){
        int low = 0;
        int high = arr.length -1;
        int mid = (low + high)/2;
        while(low <= high){
            if(arr[mid] == 0){
                mid = mid + 1;
            }else{
                if(mid == 0 || arr[mid-1] == 0 ){
                    return arr.length - mid;
                }else{
                    high = mid-1;
                }
            }
        }
        return 0;
    }

    public static int squareRoot(int x){
        int low = 1;
        int high = x;
        // 1 2 3 4 5 6 7 8 9 10
        int ans = -1;
        while(low <= high){
            int mid = (low + high) / 2;
            int midSqr = mid * mid;
            if(midSqr == x){
                return mid;
            }else if( midSqr > x){
                high = mid - 1;
            }else{
                low = mid + 1;
                ans = mid;
            }
        }
        return ans;
    }

    public static void main(String args[]){
        // int arr[] = {10,23,40,76,130,150,166};
        // int index = searchRecursive(arr,1,7,40);
        // int arr[] = {5,10,10,15,20,20,20};
        // int index = firstOccurrence(arr,1,7,10);
        // int arr[] = {5,10,10,10,20,20};
        // int index = lastOccurrence(arr,1,5,10);
        // System.out.println("Index : "+index);
        // System.out.println(arr[index]);

        int squareRoot = squareRoot(49);
        System.out.println("Squareroot : "+squareRoot);


    }
}