//Write a program to cyclically rotate an array by one.

class GFG{

   public static void rotate(int arr[],int n){
       int lastElement = arr[n-1];

       for(int i=(n-1);i> 0;i--){
           arr[i] = arr[i-1];
       }
       arr[0] = lastElement;
   }


   public static void main(String args[]){
       int arr[] = {1,2,3,4,5};
       rotate(arr,5);
       for(int i=0;i<arr.length;i++){
           System.out.print(" "+arr[i]);
       }
       
   }
}