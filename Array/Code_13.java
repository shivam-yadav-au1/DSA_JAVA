//merge intervals

class Solution {
    public int[][] merge(int[][] intervals) {
        
        Pair[] pairs = new Pair[intervals.length];
        for(int i=0;i<intervals.length;i++){
            pairs[i] = new Pair(intervals[i][0],intervals[i][1]);
        }
        Arrays.sort(pairs);
        Stack<Pair> st = new Stack<>();
        for(int i=0;i<pairs.length;i++){
            if(i == 0){
                st.push(pairs[i]);
            }else{
                Pair top = st.peek();
                if(pairs[i].str < top.end){
                    top.end = pairs[i].end;
                    
                }else{
                    
                    top.end = Math.max(top.end,pairs[i].end);    
                }
                
            }
        }
        
        Stack<Pair> tempRes = new Stack<>();
        while(st.size() > 0){
            tempRes.push(st.pop());
        }
        List<int[]> res = new ArrayList<>();
        while(tempRes.size() > 0){
            Pair p = tempRes.pop();
            res.add(new int[]{p.str,p.end});
        }
        return res.toArray(new int[0][]);
    }
    
    public static class Pair implements Comparable<Pair>{
        
        int str;
        int end;
        
        Pair(int str,int end){
            this.str = str;
            this.end = end;
        }
        
        public int compareTo(Pair other){
            
            if(this.str != other.str){
                return this.str - other.str;
            }else{
                return this.end - other.end;
            }
        }
        
    }
}