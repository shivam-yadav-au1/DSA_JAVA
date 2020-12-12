// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;
import java.lang.*;

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            int n = Integer.parseInt(read.readLine());
            int arr[] = new int[n];
            
            String str[] = read.readLine().trim().split(" ");
            for(int i = 0; i < n; i++)
                arr[i] = Integer.parseInt(str[i]);
            
            System.out.println(new Sorted().isSorted(arr, n));
            
        }
    }
    
}// } Driver Code Ends


//User function Template for Java


class Sorted
{
    //Complete the function
    public static int isSorted(int arr[], int n)
    {
       /// Your code here
       int asc = 0;
       int desc = 0;
       int res;
       int isSorted ;
       for(int i=n-1;i>0;i--){
           res = arr[i] - arr[i-1];
           if(res < 0 || res == 0){
               desc = 1;
           }else if(res > 0 || res == 0){
               asc = 1;
           }else{
              
           }
       }
       System.out.println("asc :"+asc);
       System.out.println("desc :"+desc);
      
       System.out.println("isSorted  : "+isSorted);
       return isSorted;
       
    }
}

