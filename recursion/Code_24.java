class GFG{

    public static boolean isPalindrome(String str,int startIndex,int endIndex){
        if(startIndex >= endIndex){
            return true;
        }
        return (str.charAt(startIndex) ==  str.charAt(endIndex) && isPalindrome(str,startIndex + 1,endIndex - 1));
    }

    public static void main(String args[]){
        String str = "abbcbbb";
        boolean isPalindromeOrNot = isPalindrome(str,0,6);
        System.out.println("isPalindrome : "+isPalindromeOrNot);
    }
}