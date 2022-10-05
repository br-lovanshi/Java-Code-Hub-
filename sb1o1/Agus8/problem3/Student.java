package sb1o1.Agus8.problem3;

import Treding.LifeSycle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Student {

    private String name;
    private int roll, marks;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public Student(String name, int roll, int marks) {
        this.setName(name);
        this.setRoll(roll);
        this.setMarks(marks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", marks=" + marks +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        List<Student> al = new ArrayList<>();
        al.add(new Student("TOny", 1, 500));
        al.add(new Student("Hulck", 2, 100));
        al.add(new Student("Locky", 3, 200));
        al.add(new Student("Caption", 4, 400));
        al.add(new Student("Thor", 5, 300));

        Collections.sort(al, (a1,a2) -> a1.getRoll() > a2.getRoll()? +1 : -1);

        List<Student> newList = al.stream().filter(i -> i.getMarks() <  250 )
                .collect(Collectors.toList());

//        for( Student  i : newList  ){
//            System.out.println(i);
//
//    }

        newList.forEach(System.out::println);

    }
}