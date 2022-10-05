package sb1o1.functionalPro;
// creat a strem af studnet and filter base on marks and we have to collect those item in to collection

import sb1o1.day1.problem2.Student;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class fromStrem {
    public static void main(String[] args) {
        List<Studnet> students = Arrays.asList(
                new Studnet(1,999,"brajesh"),
                new Studnet(2,39,"tanu"),
                new Studnet(3,93,"vicky")

        );
        students
                .stream()
                .filter(student -> student.marks>800)
                .forEach(student-> System.out.println(student.name));

    }
//    students
//            .stream()
//            .filter(student -> student.marks>800)
//            .collect(Collectors.toList());


}

class Studnet {

    Integer roll,marks;
    String name;

    public Studnet(Integer roll, Integer marks, String name) {
        this.roll = roll;
        this.marks = marks;
        this.name = name;
    }

    public Studnet() {
    }

    public Integer getRoll() {
        return roll;
    }

    public void setRoll(Integer roll) {
        this.roll = roll;
    }

    public Integer getMarks() {
        return marks;
    }

    public void setMarks(Integer marks) {
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
        return "Studnet{" +
                "roll=" + roll +
                ", marks=" + marks +
                ", name='" + name + '\'' +
                '}';
    }
}

