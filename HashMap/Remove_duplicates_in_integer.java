
import java.util.*;
class Main {
    public static void main(String[] args) {
        int number  = 1123553116;
        String num = String.valueOf(number);
        Set<Character> set = new LinkedHashSet<>();
        for(char digit : num.toCharArray()){
            set.add(digit);
        }
        StringBuilder result  = new StringBuilder();
        for( char d:set){
            result.append(d);
        }
        System.out.println(result.toString());
        
        
    }
}
