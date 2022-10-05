package EvalPractise1;

import com.sun.jndi.ldap.ext.StartTlsResponseImpl;

import java.util.*;
import java.util.stream.Collectors;

class Student {
    private String name;
    private int marks,roll;

    public Student(String name, int marks, int roll) {
        this.name = name;
        this.marks = marks;
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", marks=" + marks +
                ", roll=" + roll +
                '}';
    }
}

class CompareToMarks implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {

        if(o1.getMarks() > o2.getMarks())
            return +1;
        else if(o1.getMarks() < o2.getMarks())
            return -1;
        else
        return 0;
    }



}
public class TreeMap1 {

    public static void main(String[] args) {
        Map<Student,String > tm = new TreeMap<>(new CompareToMarks());

        tm.put(new Student("Brajesh",898,1),"MP");
        tm.put(new Student("Brajesh",498,1),"MP");
        tm.put(new Student("Brajesh",398,1),"MP");
        tm.put(new Student("Brajesh",298,1),"MP");

        Set<Student> keys =tm.keySet();
//        System.out.println(keys);
        Collection<String > val = tm.values();
//        System.out.println(val);


    }

}
