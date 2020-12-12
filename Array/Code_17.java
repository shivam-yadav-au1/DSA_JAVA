//Remove duplicate from array;

//10 ,20, 20, 30, 30, 30
//10
class Solution {

    
    public static int removeDuplicate(int arr[]){
        
        // int temp[] = new int [arr.length];
        // int res;
        // temp[0] = arr[0];
        // int j = 1;
        // for(int i=1;i<arr.length;i++){
        //     if(arr[i] != temp[j-1] ){
        //         temp[j] = arr[i];
        //         j++;
        //     }
        // }
        // for(int i=0;i<j;i++){
        //     arr[i] = temp[i];
        // }
        // return j;

        int j = 1;
        for(int i=1;i<arr.length-1;i++){
            if(arr[i] != arr[j-1]){
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String args[]){

        int arr [] = {10,20,20,30,30,30};
        int n = removeDuplicate(arr);
        for(int i=0;i<n;i++){
            System.out.println(" "+arr[i]);
        }
    }
}