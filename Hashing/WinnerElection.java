// { Driver Code Starts
import java.io.*;
import java.util.*;

class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            String arr[] = new String[n];
            
            for(int i = 0; i < n; i++)
                arr[i] = sc.next();
            
            Sol obj = new Sol();    
            String result[] = obj.winner(arr, n);
            System.out.println(result[0] + " " + result[1]);
            
           
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java


class pair implements Comparable <pair>
{
    String first;
    int second;
    pair(String first , int second)
        {
            this.first = first;
            this.second = second;
        }
     String getName(){
        return this.first;
    }
     int getCount(){
        return this.second;
    }
    @Override
    public int compareTo(pair comparesPair) {
        int count=((pair)comparesPair).getCount();
        /* For Ascending order*/
        return this.second-count;

        /* For Descending order do like this */
        //return compareage-this.studentage;
    }
    public String toString(){
        return this.first +" "+this.second;
    }
}

class Sol
{
    public static String[] winner(String arr[], int n)
    {
        // add your code
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        for(int i=0;i<arr.length;i++){
            // System.out.println(arr[i]);
            if(hm.containsKey(arr[i])){
                int freq = hm.get(arr[i]);
                hm.put(arr[i],freq + 1);
            }else{
                hm.put(arr[i],1);
            }
        }
        ArrayList<pair> list = new ArrayList<pair>();
        for(Map.Entry<String,Integer> e : hm.entrySet()){
            pair p = new pair(e.getKey(),e.getValue());
            if(e.getKey() != null){
                list.add(p);
            }
            
        }
        Collections.sort(list,Collections.reverseOrder());
        ArrayList<pair> secondList = new ArrayList<pair>();
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println();
        
        for(int i=0;i<2;i++){
            secondList.add(list.get(i));
        }
        for(pair obj : secondList){
            System.out.println(obj);
        }
        String firstString = secondList.get(0).getName();
        String secondString = secondList.get(1).getName();
        String lexicalOrderString = "";
        String [] res = new String[2];
        if(secondList.get(0).getCount() == secondList.get(1).getCount()){
            int compare = firstString.compareTo(secondString);
            System.out.println("compare : "+compare);
            System.out.println(firstString + " "+secondString);
            if(compare < 0){
                lexicalOrderString = firstString;
            }else if(compare  == 0){
                lexicalOrderString = firstString;
            }else {
                lexicalOrderString = secondString;
            }
            res[0] = lexicalOrderString;
            res[1] = hm.get(lexicalOrderString).toString();
        }else{
            lexicalOrderString = firstString;
            res[0] = lexicalOrderString;
            res[1] = hm.get(lexicalOrderString).toString();
            
        }
        
        return res;
        
    }
}

