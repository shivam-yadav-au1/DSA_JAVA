class NaivePatternSearching{


    public static int  patternSearch(String str,String pat){
        int index = -1;
        for(int i=0;i<=str.length()-pat.length();i++){
            int j;
            for(j = 0;j<pat.length();j++){
                if(pat.charAt(j) != str.charAt(i + j) ){
                    break;
                }
            }
            if(j == pat.length()){
                index = i;
            }
        }
        return index;
    }

    public static void main(String args[]){
        String str = "ABCABCD";
        String pat = "ABCD";
        int res = patternSearch(str,pat);
        System.out.println("Result : "+res);

    }
}