import java.util.*;
class LeftMost{

    public static int leftMostRepeatingCharacterV2(String str){
        int[] firstIndex = new int[256];
        int res = Integer.MAX_VALUE;
        Arrays.fill(firstIndex,-1);

        for(int i=0;i<str.length();i++){
            int fi = firstIndex[str.charAt(i)];
            if(fi == -1){
                firstIndex[str.charAt(i)] = i;
            }else{
                res = Math.min(res,fi);
            }
        }
        return (res == Integer.MAX_VALUE) ? -1 :res;
    }

    public static int leftMostRepeatingCharacter(String str){

        int index = -1;
        char [] ch = new char[256];
        int [] count = new int[256];
        for(int i=0;i<str.length();i++){
            count[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++){
            if(count[str.charAt(i)] > 1){
                return i;
            }
        }
        return index;
    }

    public static void main(String args[]){
        String str = "abccbd";
        int result = leftMostRepeatingCharacterV2(str);
        System.out.println(result);
    }
}