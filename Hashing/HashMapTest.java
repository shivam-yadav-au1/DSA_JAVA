import java.util.HashMap;
import java.util.Map;

class HashMapTest{


    public static void main(String args[]){

        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        hm.put("shivam",26);
        hm.put("Shivani",23);
        hm.put("Anurag",45);
        hm.put("Rita",40);
        System.out.println(hm.get("shivam"));
        System.out.println(hm.containsKey("shivam"));
        // System.out.println(hm.values());

        for(Map.Entry<String,Integer> e :hm.entrySet()){
            System.out.println(e.getKey()+ " "+e.getValue());
        }
    }
    
}

