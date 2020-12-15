import java.util.*;
class CountDistinct {

    public int countDistict(int arr[]){

        int res = 0;
        for(int i=0;i<arr.length;i++){
            boolean flag = false;
            for(int j = 0;j<i;j++){
                if(arr[i] == arr[j]){
                    flag = true;
                    break;
                }
            }
            if(flag == false){
                res++;
            }
        }
        return res;
    }

    public int countDistinctHashSetImpl(int arr[]){
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        return set.size();
    }

    public static void main (String args[]){

        int arr [] ={4,4,1,1,3,3,3};
        CountDistinct cd = new CountDistinct();
        System.out.println(cd.countDistinctHashSetImpl(arr));
        
    }
}