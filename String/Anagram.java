import java.util.*;
class Anagram{

    public static boolean isAnagram(String str1,String str2){

        if(str1.length() != str2.length()){
            return false;
        }
        int[] count = new int[256];
        for(int i=0;i<str1.length();i++){
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }
        for(int i=0;i<count.length ;i++){
            if(count[i] != 0){
                return false;
            }
        }
        return true;
        // char[] arr1 = str1.toCharArray();
        // Arrays.sort(arr1);
        // str1 = new String(arr1);
        // char[] arr2 = str2.toCharArray();
        // Arrays.sort(arr2);
        // str2 = new String(arr2);

        // // System.out.println(arr1); 
        // return str1.equals(str2);

        
    }

    public static void main(String args[]){

        String str1 = "silent";
        String str2 = "listen";
        boolean isAnagram = isAnagram(str1,str2);
        System.out.println(isAnagram);
    }

}