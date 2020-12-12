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
            int N = Integer.parseInt(read.readLine());
            int arr[] = new int[N];
            String str[] = read.readLine().trim().split(" ");
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(str[i]);
                
            new PrintArray().printArrayRecursively(arr, N);
            System.out.println();
        }
        
    }
}// } Driver Code Ends


//User function Template for Java

class PrintArray
{
    // Complete the function
    // arr[]: input array
    // n: size of inout array
    // 1 2 3 4 5 

    public static void print(int arr[],int i,int n){
        if(i > n-1){
            return;
        }
        System.out.print(arr[i]+" ");
        print(arr,i+1,n);
    }

    public static void printArrayRecursively(int arr[], int n)
    {
        // Print the array elements recursively
        int i=0;
        print(arr,i,n);
    }
}