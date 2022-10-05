package collection;

import java.util.Collection;
import java.util.HashMap;
import  java.util.Set;
public class Studnets {
    public static void main(String[] args) {

        HashMap<String ,Integer> hm = new HashMap<>();

        hm.put("brajesh",1);
        hm.put("one",1);
        hm.put("ONE",1);
        hm.put("two",2);
        hm.put("three",3);
        hm.put("four",4);
        hm.put("five",null);
        hm.put("FIVE",5);

        System.out.println("geting all the keys ");

        Set<String> keys = hm.keySet();
//        System.out.println(keys);
//        Collection<Integer> values = hm.values();
//        System.out.println(values);

//        for(String i: keys ){
//            System.out.println(i);
//        }

        Collection<Integer> values = hm.values();
        for(Integer i : values){
            System.out.println(i);
        }

    }
}
