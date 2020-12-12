//find Largest sum contiguous Subarray [V. IMP]

class GFG{


    public static int minimizeHeight(int arr[],int k){

        int minHeight = 0;
        int minHeight_1 = 0;

        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i] - k;
        }
    }

    public static void main(String args[]){

        int arr [] = {1, 5, 8, 10};
        int k = 2;

        int height = minimizeHeight(arr,k);
        System.out.printlng("minimize height :"+height);

    }
}