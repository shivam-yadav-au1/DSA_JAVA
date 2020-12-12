//. Find nCr

// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.BigInteger; 

class Driver
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            String str[] = read.readLine().trim().split(" ");
            int n  =Integer.parseInt(str[0]);
            int r = Integer.parseInt(str[1]);
            
            Get obj = new Get();
            System.out.println(obj.nCr(n, r));
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Get
{
    public static int  fact(int n){
        // if(n == 0){
        //     return 1;
        // }
        // return fact(n-1) * n;
        // BigInteger res = new BigInteger("1"); 
            int res = 1; 
            for (int i = 2; i <= n; i++) 
                res = res * i; 
            return res; 
    }
    
    
    public static int nCr(int n,int r)
    {
        // your code here
        System.out.println("fact(n) :"+fact(n));
        System.out.println("fact(n-r) :"+fact(n-r));
        System.out.println("fact(r) :"+fact(r));
        return fact(n)/ (fact(n-r) * fact(r));
        
    }
}