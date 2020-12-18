class Palindrome {

    public static boolean isPalindrome(String str){

        int begin = 0;
        int end = str.length() -1;
        while(begin < end){
            if(str.charAt(begin) == str.charAt(end)){
                begin++;
                end --;
            }else{
                return false;
            }
        }
        return true;
    }

    public static void main (String args[]){
        String str = "abcbac";
        boolean isPalindrome = isPalindrome(str);
        System.out.println(isPalindrome);
    }
}