package sb1o1.com.StremApi.Problem3;

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
