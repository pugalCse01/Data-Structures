
import java.util.*;
class Basic_operations {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();//initialization of hashMap
        map.put(1,"Apple"); //using put we insert the variable in map
        map.put(2,"Orange");
        map.put(3,"Rasberry");
        map.put(1,"Coconut");// we can change the value of the key
        boolean has_Key = map.containsKey(3); 
        boolean has_value=map.containsValue("Rose");
        System.out.println(map.get(1));
        System.out.println(has_Key);
        System.out.println(has_value);
        //iteration to print all the key pair values  
        map.forEach((key,value) ->{
            System.out.println("key is "+key+ " and the value is "+value);
        });
        map.remove(3); // removing the specific key
        int size  = map.size();
        map.clear();//clear the entire map and it will be empty
        System.out.println(map.get(1));// output is null
        
    }
}
