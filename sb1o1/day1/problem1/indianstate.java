package sb1o1.day1.problem1;

import CollectionFramwork.HascodeAndEqual.Main;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.time.format.SignStyle;
import java.util.*;

public class indianstate {

    public static void main(String[] args) {

        LinkedHashMap<String ,String> hm = new LinkedHashMap<>();
        hm.put("MP","Bhopal");
        hm.put("UP","Lakhnow");
        hm.put("MH","Mumbai");
        hm.put("HP","Manali");
        hm.put("Odisha","Bhuvnashvar");

        for(Map.Entry<String,String> me : hm.entrySet()){
            System.out.println(me.getValue() + " " + me.getKey());
        }
//        Collection<String> value  = hm.values();
//
//        Set<String> key = hm.keySet();
//        System.out.println(key + " " + value);
//        for( String i : key ){
//            System.out.println(i );
//        }
//List<String> al = new ArrayList<>(value);
//        System.out.println(al);
////        Set<Map.Entry<String value>> st = hm.entrySet();
    }
}
