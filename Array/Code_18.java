//Move all zeros to end

//8, 5, 0, 10, 0, 20

/*
i=
8 , 5 , 0 , 10 , 20 ,0
*/
class Solution {

    public static int shiftZero(int arr[]){

        // for(int i=0;i<arr.length;i++){
        //     if(arr[i] == 0){
        //         for(int j = i+1;j<arr.length;j++){
        //             if(arr[j] != 0){
        //                 int temp = arr[j];
        //                 arr[j] = arr[i];
        //                 arr[i]  = temp;
        //             }
        //         }
        //     }
        // }
        // return arr.length;
        int count = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                int temp = arr[i];
                arr[i] = arr[count];
                arr[count] = temp;
                count++;
            }
        }
        return arr.length;
    }

    public static void main(String args[]){
        int arr [] = {8,5,0,10,0,20};
        int n = shiftZero(arr);
        for(int i=0;i<n;i++){
            System.out.print(" "+arr[i]);
        }
    }
}