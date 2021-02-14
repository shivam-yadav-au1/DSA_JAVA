import java.util.*;

class BalancedParanthesis{

    public static boolean isBalanced(String str){

        Stack<Character> s =new Stack<Character>();
        int n = str.length();
        if(n == 0 ) return false;

        for(int i=0;i<n;i++){
            if(str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '['){
                s.push(str.charAt(i));
            }else{
                if(s.isEmpty()){
                    return false;
                }else if(matching(s.peek(),str.charAt(i)) == false){
                    return false;
                }else{
                    s.pop();
                }
            }
        }
        return (s.isEmpty() == true);
    }

    public static boolean matching(char a,char b){
        return ((a == '(' && b== ')') ||
                (a == '{' && b == '}') ||
                (a == '[' && b == ']')
        );
    }

    public static void main(String args[]){
        String str = "{([])}";
        System.out.println(isBalanced(str));
    }
}