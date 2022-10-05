package sb1o1.com.StremApi.problem02;

import collection.Studnets;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Student {
    private String name;
    private int roll,marks;

    public Student() {
    }

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

    public Student(String name,int marks,int roll) {
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


        al.add(new Student("Brajesh",1000,1));
        al.add(new Student("Abhishek",89,5));
        al.add(new Student("sager",390,4));
        al.add(new Student("aayush",88,3));
        al.add(new Student("aman",99,2));
        List<Student> newList = al.stream().filter(i -> i.getMarks() > 800)
                .collect(Collectors.toList());
        newList.forEach(System.out::println);
    }
}