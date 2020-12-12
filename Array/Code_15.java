
//Check if array is sorted

class Solution{

    public static boolean isSorted(int arr[]){

            boolean flag = true;
            int previous = Integer.MIN_VALUE;
            for(int i=0;i<arr.length;i++){
                if(arr[i] > previous){
                    previous = arr[i];
                }else{
                    flag = false;
                    break;
                }
            }

            return flag;
    }


    public static void main(String args[]){

        int arr[] = {4,6,9,20,12,11};
        // int arr[] =  {1,2,3,4,5};
        boolean isArraySorted  = isSorted(arr);
        System.out.println("Is Array is sorted  : "+isArraySorted);
    }
}