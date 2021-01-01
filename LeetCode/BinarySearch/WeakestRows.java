import java.util.*;

class WeakestRows{

    public static  int[] findWeakest(int grid[][],int k){
        int row = grid.length;
        Map<Integer,Integer> weakMap = new HashMap<>();
        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)->a.getValue().equals(b.getValue()) ? a.getKey()-(b.getKey()) : a.getValue() - b.getValue());
        
        
        for(int i=0;i<row;i++){
            int count = countOnes(grid[i]);
            weakMap.put(i,count);
        }
        for(Map.Entry<Integer,Integer> entry:weakMap.entrySet()){
            pq.offer(entry);
        }
        int res[] = new int[k];
        for(int i=0;i<k;i++){
            Map.Entry<Integer,Integer> entry = pq.poll();
            res[i] = entry.getKey();
        }
        return res;

    }
    // 1 1 1 1 0 0 0
    public static int countOnes(int arr[]){
        int n = arr.length;
        int l = 0;
        int r = n-1;
        
        while(l <= r){
            int mid = (l + r)/2;
            
            if(arr[mid] == 0){
                r = mid-1;
            }else{
                if(mid == n-1 || (arr[mid] != arr[mid+1])){
                    return mid + 1;
                }else{
                    l = mid+1;
                }
            }

        }
        return -1;
    }
        
    

    public static void main(String args[]){
        // int mat[][] = {
        //     {1,0,0,0},
        //     {1,1,1,1},
        //     {1,0,0,0},
        //     {1,0,0,0}
        // };
        int mat[][]={
            {1,1,0,0,0},
            {1,1,1,1,0},
            {1,0,0,0,0},
            {1,1,0,0,0},
            {1,1,1,1,1}
        };
        int res[] = findWeakest(mat,3);
        for(int i=0;i<res.length;i++){
            System.out.print(" "+res[i]);
        }

    }
}