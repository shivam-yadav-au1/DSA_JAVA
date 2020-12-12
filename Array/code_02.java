
//Find the maximum and minimum element in an array
class Code02{

    static class Pair{
        int max;
        int min;
    }

    static Pair getMinMax(int arr[],int size){
        Pair minmax = new Pair();
        int min = arr[0];
        int max = arr[1];

        if(size == 1){
            minmax.min = arr[0];
            minmax.max = arr[0];
        }
        
        if(arr[0] > arr[1]){
            minmax.min = arr[0];
            minmax.max = arr[1];
        }else {
            minmax.min = arr[1];
            minmax.max = arr[0];
        }

        for(int i=2;i<size;i++){
            if(arr[i] < minmax.min){
                minmax.min = arr[i];
            }else if(arr[i] > minmax.max){
                minmax.max = arr[i];
            }
        }
        return minmax;
    }

    static Pair getMinMaxMethod2(int arr[],int low,int high){
        Pair minmax = new Pair();
        Pair lminMax = new Pair();
        Pair rminMax  = new Pair();
        int mid;



        if(low == high){
            minmax.min = arr[low];
            minmax.max = arr[low];
            return minmax;
        }
        if(high == low +1 ){
            if(arr[low] < arr[high]){
                minmax.min = arr[low];
                minmax.max = arr[high];
            }else {
                minmax.min = arr[high];
                minmax.max = arr[low];
            }
            return minmax;
        }
        mid = (low + high) /2;
        lminMax = getMinMaxMethod2(arr,low,mid);
        rminMax = getMinMaxMethod2(arr,mid+1,high);

        if(lminMax.min < rminMax.min){
            minmax.min = lminMax.min;
        }else {
            minmax.min = rminMax.min;
        }


        if(lminMax.max > rminMax.max){
            minmax.max = lminMax.max;
        }else{
            minmax.max = rminMax.max;
        }

        return minmax;
         
    }

    public static void main(String args[]) {
        int arr[] = {1000, 11, 445, 1, 330, 3000};
        int arr_size = 6;
        // Pair minmax = getMinMax(arr, arr_size);
        // System.out.printf("\nMinimum element is %d", minmax.min);
        // System.out.printf("\nMaximum element is %d", minmax.max);

        Pair minmax = getMinMaxMethod2(arr,0,arr_size - 1);
        System.out.printf("\nMinimum element is %d", minmax.min);
        System.out.printf("\nMaximum element is %d", minmax.max);


 
    }
}