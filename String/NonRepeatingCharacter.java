import java.util.*;

class NonRepeatingCharacter{

    public static String findNonRepating(String str){
        int len = str.length();
        int count[] = new int[256];
        Arrays.fill(count,0);
        for(int i=0;i<len;i++){
            count[str.charAt(i)]++;
        }
        String ans = "";
        for(int i=0;i<256;i++){
            if(count[str.charAt(i)] == 1){
                ans += String.valueOf(str.charAt(i));
                return ans;
            }
        }
        return "0";
    }

    public static void main(String args[]){
        String str = "GeeksforGeeks";
        String res = findNonRepating(str);
        System.out.println("Res : "+res);
    }
}