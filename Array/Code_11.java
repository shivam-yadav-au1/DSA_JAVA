class Solution {
    
    public static boolean isPresent(int[] nums,int num){
        
        for(int i=0;i<nums.length;i++){
            if(nums[i] == num){
                return true;
            }
        }
        return false;
    }
    
    public static int findDuplicate(int[] nums) {
        int size = nums.length;
        int duplicate = 0;
        int [] tempArray = new int[size];
        for(int i=0;i<size;i++){
            if(isPresent(nums,nums[i])){
                duplicate = nums[i];
            }else{
                tempArray[i] = nums[i];
            }
        }
        return duplicate;
    }

    public static void main(String args[]){
        int arr[] = {3,1,3,4,2};
        int duplicateNumb = findDuplicate(arr);
        System.out.println(duplicateNumb);
    }
}