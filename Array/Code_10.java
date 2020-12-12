//Minimum number of jumps

class GFG{

    static int jumps(int arr[]){

        int count = 0;
        int lastIndex = arr.length -1;
        for(int i=0;i<arr.length;i++){
                if(i == lastIndex){
                    break;
                }else {
                    i = i + arr[i];
                    count++;
                }
        }
        return count;
    }

    public static void main(String args[]){
        //int arr [] = {1 ,4 ,3, 2, 6, 7};
        int arr [] = {1 ,3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        int noOfJumps = jumps(arr);
        System.out.println(noOfJumps);
    }
}