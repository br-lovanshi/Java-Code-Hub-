package Day18.Problem1;

import java.util.LinkedList;
import java.util.List;

public class Problem2 {
    public static void main(String[] args) {
        List<String > ll = new LinkedList<>();
        ll.add("one");
        ll.add("two");
        ll.add("three");
        ll.add("four");
        System.out.println(" for loop");
//        for loop
        for(int i = 0;i<ll.size();i++){
            System.out.println(ll.get(i));
        }

//        enhance for loop
        System.out.println("enhance for loop");
        for(String i: ll){
            System.out.println(i);
        }
    }
}
