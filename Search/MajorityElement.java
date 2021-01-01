// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Majority().majorityElement(arr, n)); 
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Majority
{
    static int majorityElement(int a[], int size)
    {
        // your code here
        // 3 1 3 3 2
        /*
            1 2 3 3 3
            5/2 = 2
            3 2
        */
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i=0;i<size;i++){
            if(hm.get(a[i]) != null){
                int count = hm.get(a[i]);
                hm.put(a[i],count + 1);
                count = hm.get(a[i]);
                if(count > (size/2)){
                    return 1;
                }
            }else{
                hm.put(a[i],1);    
            }
            
        }
        for(Map.Entry<Integer,Integer> e: hm.entrySet()){
            System.out.println("Key: "+e.getKey()+" Value :"+e.getValue());
        }
        return -1;
        
    }
}