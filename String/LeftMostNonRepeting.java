import java.util.*;
class NonRepeating{
    // O(n2)
    public static int nonRepating(String str){
        boolean isRepating = false;
        int index = -1;
        for(int i=0;i<str.length();i++){

            for(int j = 0;j<str.length();j++){
                if(i != j && str.charAt(i) == str.charAt(j)){
                      isRepating = true;
                      break;
                }
            }
            if(isRepating == false){
                index = i;
                return index;
            }
            isRepating = false;
        }
        return index;
    }

    public static int nonRepatingV1(String str){
          int index = -1;
          int charCount[] = new int [256];
          for(int i=0;i<str.length();i++){
              charCount[str.charAt(i)] ++;
          } 
          for(int i=0;i<str.length();i++){
              if(charCount[str.charAt(i)] == 1){
                  index = i;
                  return index;
              }
               
          }
          return index;
    }

    public static int nonRepatingV2(String str){
        int count[] = new int [256];
        Arrays.fill(count,-1);
        for(int i=0;i<str.length();i++){
            if(count[str.charAt(i)] == -1){
                count[str.charAt(i)] = i;
            }else{
                count[str.charAt(i)] = -2; 
            }
        }
        int res = Integer.MAX_VALUE;
        for(int i=0;i<count.length;i++){
            if(count[i] > 0){
                res = Math.min(res,count[i]);
            }
        }
        return (res == Integer.MAX_VALUE) ? -1 : res;
    }
    public static void main(String args[]){
        String str = "geeksforgeeks";
        int result = nonRepatingV2(str);
        System.out.println("Result : "+result);

    }
}