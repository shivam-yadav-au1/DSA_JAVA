
/**


1 4 7 8 10

2 3 9

 */
import java.util.Arrays; 
class GFG{

    public static int[] merge(int arr1[],int arr2[],int n,int m){
            int i=0;
            int j=m;
            int k = 0;
            int size = n + m;
            int [] resArray = new int[size];
            while(i<n){

                if(arr1[i] > arr2[0]){

                    int temp = arr1[i];
                    arr1[i] = arr2[0];
                    arr2[0] = temp;
                    Arrays.sort(arr2);
                }
                i++;
            }
            
            for(i = 0;i<arr1.length;i++){
                System.out.print(" "+arr1[i]);
            }
            for(i =0 ;i<arr2.length;i++){
                System.out.print(" "+arr2[i]);
            }
            // System.out.println(arr2);            
            // for( i=0; i<size; i++){
            //     resArray[i] = arr1[i];
            //     lastCount++;
            // }
            // for( i=0;i<m;i++){
            //     resArray[lastCount++] = arr2[i];
            // }
            
            return resArray;
    }

    public static void main(String args[]){
        int arr1[] = {0, 2, 6, 8, 9};
        int arr2[] = {1, 3, 5, 7};
        // int arr1 [] = {1,2,3,0,0,0};
        // int arr2 [] = {2,5,6};

        int res[] = merge(arr1,arr2,5,4);
        // for(int i=0;i<res.length;i++){
        //     System.out.print(" "+res[i]);
        // }
        
    }
}