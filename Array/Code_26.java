import java.util.Collections;
import java.util.Arrays;
class Solution {
// 3 , 1 , 2, 2 ,5,0
//int arr[] = {3,1,2,2,7,0,5};
    public static int removeDuplicate(int [] nums){

        int n = nums.length;
        int temp[] = new int[n];
        int j = 0;
        for(int i=0;i<n-1;i++){
            if(nums[i] != nums[i+1]){
                temp[j] = nums[i];
                j = j + 1;
            }
            
        }
        temp[j++] = nums[n-1];
        for(int i=0;i<j;i++){
            nums[i] = temp[i];
        }
        // System.out.println();
        // for(int i=0;i<j;i++){
        //     System.out.print(" "+nums[i]);
        // }
        return j;
    }
    public static int thirdMax(int[] nums) {
        
        int n = removeDuplicate(nums);
        if(n == 1){
            return nums[0];
        }
        if(n == 2){
            if(nums[0] > nums[1] ){
                return nums[0];
            }else{
                return nums[1];
            }
        }
        
        int largest = nums[0] ,second = Integer.MIN_VALUE,third = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            // if(nums[i] ==  largest || nums[i] == second || nums[i] == third){
            //     continue;
            // }
            if(nums[i] > largest){
                third = second;
                second = largest;
                largest = nums[i];
            }
            else if(nums[i] > second){
                third = second;
                second = nums[i];
            }else if(nums[i] > third){
                third = nums[i];
            }
        }

        return third;
    }

    public static void main (String args[]){
        int arr[] ={2,2,3,1}; 
        // int arr[] ={6,1,23,9,10};
        // int arr[] = {1,2};
        // int arr[] = {3,2,1};
        // int arr[] = {3,1,2,2,7,0,5};
        int n = thirdMax(arr);
        System.out.println("third max :"+n);
        
    }
}