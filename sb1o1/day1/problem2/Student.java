package sb1o1.day1.problem2;

import CollectionFramwork.HascodeAndEqual.Main;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import java.awt.dnd.DragGestureEvent;
import java.util.*;
import java.util.TreeMap;
public class Student {
    int roll,marks;
    String name;

    public Student(int roll, int marks, String name) {
        this.roll = roll;
        this.marks = marks;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }
}

class marksComparator implements Comparator<Student>{


    @Override
    public int compare(Student o1, Student o2) {
        if(o1.marks > o2.marks){
            return -1 ;
        }
        else if (o1.marks< o2.marks){
            return +1;
        }else
        return 0;
    }
}
class  main {
    public static void main(String[] args) {
        TreeMap<Student,String> tm = new TreeMap<>(new marksComparator());
        tm.put(new Student(1,99,"Brajesh"), "MP");
        tm.put(new Student(2,28,"Tanu"), "UP");

        Set<Map.Entry<Student,String >> Set = tm.entrySet();

        for(Map.Entry<Student,String> print : Set) {
            System.out.println( print.getKey() + "  " + print.getValue());
        }

    }
}