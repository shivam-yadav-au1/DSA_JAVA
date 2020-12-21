class ImprovedNaiveSearching{

    public static int patternSearch(String str,String pat){
        int n = str.length();
        int m = pat.length();
        int index = -1;
        for(int i=0;i<=(n-m);){
            int j;
            for(j = 0;j<m;j++){
                if(pat.charAt(j) != str.charAt(j+i)){
                   break;
                }
                
            }
            if(j == m){
                    index = i;
                    // return index;
                }
                if(j == 0){
                    i++;
                }else{
                    i = (j + i);
                }
        }
        return index;
    }

    public static void main(String args[]){
        String str = "ABCEABEFABCD";
        String pat = "ABCD";
        int result = patternSearch(str,pat);
        System.out.println("Result :"+result);
    }
}