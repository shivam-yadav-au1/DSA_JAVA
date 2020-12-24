
class Kmp{

    public static int[] computeTempArray(String ptr){

        int n = ptr.length();
        int lps[] = new int [n];
        int j = 0;
        
        lps[0] = 0;
        for(int i=1;i<n;){
            if(ptr.charAt(i) == ptr.charAt(j)){
                lps[i] = j+1;
                j++;
                i++; 
            }else{
                if(j == 0 ){
                    lps[i] = 0;
                    i++;
                }else{
                    j = lps[j-1];
                }
                
            }
        }
        return lps;
    }

    public static boolean kmp(String text,String pattern){

        int lps[] = computeTempArray(pattern);
        int i=0;
        int j=0;
        int textLen = text.length();
        int pattLen = pattern.length();
        while(i < textLen && j < pattLen){
            if(text.charAt(i) == pattern.charAt(j)){
                i++;
                j++;
            }else{
                if(j !=0){
                    j = lps[j-1];
                }else{
                    i++;
                }
            }
        }
        if(j == pattLen){
            return true;
        }
        return false;
    }

    public static void main(String args[]){
        String text = "abcxabcdabcdabcy";
        String ptr = "abcdabcy";
        boolean isPattPresent = kmp(text,ptr);
        System.out.println("isPattPresent : "+isPattPresent);
        
    }
}