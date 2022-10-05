package sb1o1.day1.learn;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
public class HashMapp {

    public static void main(String[] args) {
        Map<String,Integer> hm = new HashMap<>();
        hm.put("Bhagwanti" ,1 );
        hm.put("Nandini",2);
        hm.put("Brajesh",3);
//        System.out.println(hm);

        Set<String > key = hm.keySet();
//        System.out.println(key);
        for(String i : key){
//            System.out.println(i);
        }
        Collection<Integer> value = hm.values();
//        System.out.println(value);

        Set<Map.Entry<String,Integer>> bothKV = hm.entrySet();
//        System.out.println(bothKV);
        for(Map.Entry<String ,Integer> i : bothKV){
            System.out.println(i.getKey() + " " + i.getValue());
        }



    }

}
