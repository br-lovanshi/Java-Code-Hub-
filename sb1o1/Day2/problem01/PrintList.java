package sb1o1.Day2.problem01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
* Question 2:
Create a List of city in the Main class and print them using Lambda Expression.
Interface PrintList {
abstract void display(List<String> city);
}
Note: Use the above interface to solve the question*/
public interface PrintList {
    abstract void display(List<String> city);
}
class Main {

    public static void main(String[] args) {
        List<String > city = new ArrayList<>();
        city.add("Delhi");
        city.add("Mumbai");
        city.add("Indore");

        PrintList pl = System.out::println;


        pl.display(city);
//        pl.display(Collections.singletonList("Delhi"));
    }
}