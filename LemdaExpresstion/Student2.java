package LemdaExpresstion;

public class Student2 {
    private String name;
    private int roll,marks;

    public Student2(String name, int roll, int marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
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
}
interface int3 {
    void print(Student2 student);
}
class Main22{
    public static void main(String[] args) {

        int3 i = (s) -> {
            System.out.println(s.getMarks());
            System.out.println(s.getName());
            System.out.println(s.getRoll());
        };
        i.print(new Student2("Braejesh",2,222));

    }
}
interface Calculator {
    public int calculate(int a, int b);


}
class MyClass {
    public static void main(String javalatte[]) {
// this is lambda expression
        Calculator plusOperaoion = (a, b) -> {
            int i = a + b;
        return i;
        };



//        Day13: Functional Interface in java8, Lambda Expression, Method reference, Java Stream API with functional
//        programming
//        8
//        Calculator minusOperation= (a, b) -> a*b;
        System.out.println(plusOperaoion.calculate(10, 34));

    }
}