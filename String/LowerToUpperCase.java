// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;
import java.lang.*;

class Diver
{
    public static void main(String args[])throws IOException
    {
        //Taking input using BufferedReader class
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        
        //Reading total testcases count
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0)
        {
            //reading the String
            String str = read.readLine();
            
            //calling the caseConversion method
            //of ToUpperCase class and passing
            //the String and printing the result
            System.out.println(new ToUpperCase().upperToLower(str));
        }
    }
}// } Driver Code Ends


//User function Template for Java


class ToUpperCase
{
    public static String caseConversion(String str)
    {
        //Complete this
        String res = ""; 
        int n = str.length();
        for(int i=0;i<n;i++){
            char c = str.charAt(i);
            if(c >= 65 && c <=90){
                res = res + String.valueOf(c);
            }else{
                c = (char)(c - 32);
                res = res + String.valueOf(c);
            }
        }
        return res;
    }

    public static String upperToLower(String str){
          //Complete this function
       String res = ""; 
        int n = str.length();
        for(int i=0;i<n;i++){
            char c = str.charAt(i);
            if(c >= 65 && c <=90){
                c = (char)(c + 32);
                res = res + String.valueOf(c);
            }else{
                res = res + String.valueOf(c);
            }
        }
        return res;
    }
}