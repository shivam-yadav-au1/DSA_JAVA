// { Driver Code Starts
//Initial Template for Java


import java.util.*;
import java.math.*;
class Multiply{
    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        // int t=sc.nextInt();
        Sol g=new Sol();
        // g.multiplyStrings("123","26");
        System.out.println(g.multiplyStrings("990","99"));
        // while(t-->0){
        //     String a=sc.next();
        //     String b=sc.next();
        //     Sol g=new Sol();
        //     System.out.println(g.multiplyStrings(a,b));
        // }
    }
}// } Driver Code Ends


//User function Template for Java
/**
  -3452346   8
     45254   5

 */

class Sol
{
    public String multiplyStrings(String s1,String s2)
    {
        String output = "";
        int len1 = s1.length();
        int len2 = s2.length();
        boolean minusFlag = false;
        if(len1 == 0 || len2 == 0){
            return "0";
        }
        if(s1.charAt(0) == '-' && s2.charAt(0) == '-'){

        }else if(s1.charAt(0) == '-'){
            minusFlag = true;
        }else if(s2.charAt(0) == '-'){
            minusFlag = true;
        }else{

        }
        // System.out.println("MinusFlag : "+minusFlag);
        if(s1.charAt(0)== '-'){
            String newString = s1.replace("-","");
            s1 = newString;
            len1 = len1-1;
        }
        if(s2.charAt(0) == '-'){
            String newString2 = s2.replace("-","");
            s2 = newString2;
            len2 = len2-1;
        }
        
        int res[] = new int[len1 + len2 +1];
        Arrays.fill(res,0);
        int carry = 0;
        int i_n1 =0;
        int i_n2 = 0;
        for(int i=len1-1;i>=0;i--){
            int num1 = Integer.parseInt(String.valueOf(s1.charAt(i)));
            // System.out.println(num1);
            carry = 0;
            i_n2 = 0;
            for(int j = len2-1;j>=0;j--){
                int num2  = Integer.parseInt(String.valueOf(s2.charAt(j)));
                int product = (num1 * num2) + res[i_n1 + i_n2] + carry;
                carry = product / 10;
                int value = product  % 10;
                res[i_n1 + i_n2] = value;
                i_n2++;
            }
            if(carry != 0){
                res[i_n1 + i_n2] += carry;
            }
            i_n1++;

        }
        System.out.println("");
        // int l = -1;
        int count = 0;
        for(int k = res.length-1;k>=0;k--){
            // System.out.print(" "+res[k]);
                 output += res[k]+"";
                
        }
        System.out.println(output);
        String newString = "";
        for(int l = 0;l<output.length();l++){
            if(output.charAt(0) =='0'){
                newString += String.valueOf(output.charAt(l));
            }
        }

        
        return newString;
    }
}