//find Largest sum contiguous Subarray [V. IMP]
import java.util.*; 
class GFG{

    static int maxSubArray(int arr[],int size){

        int max_so_far = Integer.MIN_VALUE;
        int max_ending_here = 0;
        int currentSum = 0;

        for(int i=0;i<size;i++){
            max_ending_here = max_ending_here + arr[i];
            if(max_so_far < max_ending_here){
                max_so_far = max_ending_here;
            }
            if(max_ending_here < 0){
                 max_ending_here = 0;
            }
        }
        return max_so_far;

    }

    static int maxSubArrayHandelNegative(int arr[],int size){
        
        int max_so_far = arr[0];
        int currentSum = arr[0];
        for(int i=0;i<size;i++){
            currentSum = Math.max(0,currentSum + arr[i]);
            max_so_far = Math.max(currentSum,max_so_far);
        }
        return max_so_far;
    }

    static int maxSubArrayBruteForce(int arr[],int size){
        
        int sum  = 0;
        int max_sum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int runningWindowSum = 0;
            for(int j=i+1;j<arr.length;j++){
                 runningWindowSum = runningWindowSum +arr[j];
                 max_sum = Math.max(runningWindowSum,max_sum);
            }
        }
        return max_sum;
    }

    public static void main(String args[]){
        // int arr[] = {-2, -3, -4, -1, -2, -1, -5, -3};
        int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 }; 
        int sum = maxSubArrayBruteForce(arr,8);
        System.out.println("sum : "+sum);
    }
}