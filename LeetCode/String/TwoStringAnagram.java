class TwoStringAnagram{

    public static int minStep(String s,String t){
            int scount[] = new int[26];
	        int tcount[] = new int[26];
	        int slen = s.length();
	        int tlen = t.length();
	        for(int i=0;i<slen;i++){
		        scount[s.charAt(i) - 'a']++;
                tcount[t.charAt(i) - 'a']++;
            }
   	        // for(int i=0;i<slen;i++){
		    //     tcount[t.charAt(i) - 'a']++;
            // }
            int n = tcount.length;
            int res = 0;
	        for(int i=0;i<26;i++){
	   	        int tfreq = tcount[i];
                int sfreq = scount[i];
                //System.out.println("char : "+(char)(i+'a')+" tfreq: "+tfreq+" sfreq : "+sfreq);
                // if(tfreq !=0 && sfreq == 0){
                //     res += 1;
                // }
                if(tfreq < sfreq){
                    System.out.println("char : "+(char)(i+'a'));
                    res = res + (sfreq - tfreq);
                }
            } 
            return res;
    }

    public static void main(String args[]){
        String s = "leetcode";
        String t =  "practice";
        int res = minStep(s,t);
        System.out.println("Res : "+res);
    }
}