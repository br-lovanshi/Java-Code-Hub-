package EvalSprint3.Q2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int studentId;
    private String StudentName;
    private String StudentEmail;
    private String StudnetPass;

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentEmail() {
        return StudentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        StudentEmail = studentEmail;
    }

    public String getStudnetPass() {
        return StudnetPass;
    }

    public void setStudnetPass(String studnetPass) {
        StudnetPass = studnetPass;

    }

    public Student(int studentId, String studentName, String studentEmail, String studnetPass) {
        this.studentId = studentId;
        StudentName = studentName;
        StudentEmail = studentEmail;
        StudnetPass = studnetPass;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", StudentName='" + StudentName + '\'' +
                ", StudentEmail='" + StudentEmail + '\'' +
                ", StudnetPass='" + StudnetPass + '\'' +
                '}';
    }
}

class main {
    public static void main(String[] args) {
        List<Student> st = new ArrayList<>();
        st.add( new Student(1,"brajesh","brajesh@gailcom","123abc"));
        st.add( new Student(2,"tony","tony@gailcom","123abc"));
        st.add( new Student(3,"Thor","thor@gailcom","123abc"));
        st.add( new Student(4,"caption","caption@gailcom","123abc"));
        st.add( new Student(5,"Lussy","lussy@gailcom","123abc"));

        for(Student i: st){
            System.out.println(i);
        }
    }
}