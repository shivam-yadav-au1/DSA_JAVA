class AreRotation{

    public static boolean isRotation(String str1,String str2){
        if(str1.length() != str2.length()){
            return false;
        }
        return ((str1 + str1).indexOf(str2) >= 0 );
    }
//ABCDCDAE
    public static void main(String args[]){
        String str1 = "ABCD";
        String str2 =  "CDAB";
        boolean result = isRotation(str1,str2);
        System.out.println("Result : "+result);
    }
}