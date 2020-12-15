import java.util.*;

class Frequency{

    public void countFrequency(int arr[]){
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<arr.length;i++){
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }else{
                int oldFrequency = hm.get(arr[i]);
                hm.put(arr[i],oldFrequency + 1);
            }
        }
        for(Map.Entry<Integer,Integer> e : hm.entrySet()){
            System.out.println(e.getKey() + " " +e.getValue());
        }
    }

    public static void main (String args[]){
        int arr [] = {3,3,1,8,99,99,54};
        Frequency f = new Frequency();
        f.countFrequency(arr);
    }
}