package sb1o1.com.StremApi.Problem01;


import java.util.*;
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

//class ShortAccordingToRoll implements Comparator<Student> {
//
//
//    @Override
//    public int compare(Student o1, Student o2) {
//        if(o1.getRoll() > o2.getRoll()){
//            return +1;
//        }else if(o1.getRoll() < o2.getRoll()){
//            return -1;
//        }else{
//            return 0;
//        }
//    }
//}
class Main {
    public static void main(String[] args) {
        List<Student> al = new ArrayList<>();
        al.add(new Student("Brajesh",400,1));
        al.add(new Student("Abhishek",89,5));
        al.add(new Student("sager",390,4));
        al.add(new Student("aayush",88,3));
        al.add(new Student("aman",99,2));

        Collections.sort(al,(o1,o2) -> o1.getRoll() > o2.getRoll() ? +1 : -1);

        List<Student> newList = al.stream()
                .filter(i -> i.getMarks()>250 && i.getMarks()<500)
                .collect(Collectors.toList());
        newList.forEach(System.out::println);
    }
}