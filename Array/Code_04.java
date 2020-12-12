class GFG {


    static int[] sort012(int arr[],int size){

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int[] resultArray = new int[size];
        for(int i=0;i<size;i++){
            if(arr[i] == 0){
                count1++;
            }
            if(arr[i] == 1){
                count2++;
            }
            if(arr[i] == 2){
                count3++;
            }
        }

        for(int i=0;i<count1;i++){
            resultArray[i] = 0;
        }
        for(int i=count1;i<(count1 + count2);i++){
            resultArray[i] = 1;
        }
        for(int i=(count1 + count2);i<size;i++){
            resultArray[i] = 2;
        }
        return resultArray;
    }

    public static void main(String[] args){

        int arr[] = {0, 1, 2, 0, 1, 2};
        int sortedArray[] = sort012(arr,6);
        for(int i=0;i<6;i++){
            System.out.print(" "+sortedArray[i]);
        }
    }
}