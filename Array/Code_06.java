//Find the Union and Intersection of the two sorted arrays.
//Time complexity  : O(m+n)
class GFG{


    public static String union(int array1[],int array2[],int m,int n){

        int i = 0;
        int j = 0;
        String output = "";
        while(i< m && j<n){
            if(array1[i] < array2[j]){
                output = output + array1[i];
                i++;
            }else if(array1[i] > array2[j] ){
                output = output + array2[j];
                j++;
            }else{
                output = output + array1[i];
                i++;
                j++;
            }
        }
        while(i<m){
            output = output + array1[i++];
        }
        while(j<n){
            output = output + array2[j++];
        }
        return output;
        
    }

    public static void main(String[] args){

        int arr1 [] = {1,2,4,5,6};
        int arr2 [] = {2,3,5,7};
        String output = union(arr1,arr2,5,4);
        System.out.println(output);

    }
}