package LemdaExpresstion;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Studentinfo
{

        private int roll;
        private String name;
        private int marks;
        public Studentinfo() {
        }
        public Studentinfo(int roll, String name, int marks) {
            this.roll = roll;
            this.name = name;
            this.marks = marks;
        }
        @Override
        public String toString() {
            return "Student{" +
                    "roll=" + roll +
                    ", name='" + name + '\'' +
                    ", marks=" + marks +
                    '}';
        }
        public int getRoll() {
            return roll;
        }
        public void setRoll(int roll) {
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
}




class Main5 {
    public static void main(String[] args) {

        List<Studentinfo> myList = Arrays.asList(
                new Studentinfo(1,"brajesh",100),
                new Studentinfo(2,"brajesh lovanshi",99),
                new Studentinfo(3,"vicky",90)

        );


//        myList
//                .stream()
//                .filter(st -> st.getMarks() >= 99)
//                .forEach(i -> System.out.println(i.getName()));
//myList
//        .stream()
//        .filter(i -> i.getRoll() <3)
//        .collect(Collectors.toList());


//        System.out.println();


        List<Studentinfo> toppers = myList
                .stream()
                .filter(i -> i.getRoll() <8)
                .collect(Collectors.toList());

        System.out.println(toppers);

    }

}