package sb1o1.com.StremApi.Problem3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Student> al = new ArrayList<>();
        al.add(new Student("Brajesh",100,1));
        al.add(new Student("Abhishek",89,5));
        al.add(new Student("sager",90,4));
        al.add(new Student("aayush",88,3));
        al.add(new Student("aman",99,2));

        List<Employee> newList = al.stream()
                .map(st -> new Employee(st.getName(),st.getRoll() ,st.getMarks()*100))
                .collect(Collectors.toList());
            newList.forEach(System.out::println);
    }
}
