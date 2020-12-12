class GFG{


    public static void subSet(String str,String curr,int index){

        if(index == str.length()){
            System.out.println(curr);
            return;
        }
        subSet(str,curr,index +1);
        subSet(str,curr + str.charAt(index),index + 1);
    }

    public static void main(String args[]){
        String str = "abc";
        subSet(str,"",0);
    }
}