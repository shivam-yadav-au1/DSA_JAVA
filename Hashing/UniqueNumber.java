// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            
            
            int l=sc.nextInt();
			int r=sc.nextInt();
			Solution ob = new Solution();
			ArrayList<Integer> numbers = ob.uniqueNumbers(l,r);
			for(int num : numbers){
			    System.out.print(num+" ");
			}
			System.out.println();

        }
    }
}
// } Driver Code Ends


class Solution{

    static boolean isUniqueDigits(int num){
        boolean isUnique = true;
        HashSet<Integer> hset = new HashSet<Integer>();
        while(num > 0){
            if(!hset.add(num % 10)){
                isUnique = false;
            }
            num = num /10;
        }
        return isUnique;
    }
    
    static ArrayList<Integer> uniqueNumbers(int L,int R){
        // code here
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=L;i<=R;i++){
            if(isUniqueDigits(i)){
                list.add(i);
            }
        }
        return list;
    }
}