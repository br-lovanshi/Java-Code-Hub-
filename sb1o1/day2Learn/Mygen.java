package sb1o1.day2Learn;

public class Mygen <T> {
    T obj;
    public void add(T obj){
        this.obj = obj;
    }

    T get() {
        return obj;
    }


}

class Main {
    public static void main(String[] args) {
        Mygen<String> gen = new Mygen<>();
        gen.add("Hello");
//        gen.add("world");
        System.out.println(gen.get());

        Mygen<Integer> num = new Mygen<>();
        num.add(10);
        System.out.println(num.get());

        Mygen<Student> obj = new Mygen<>();
        obj.add(new Student("brajesh",1,100));

        System.out.println(obj.get());
    }
}
class Student {
    private String name;
    private int roll,mark;

    public Student(String name, int roll, int mark) {
        this.name = name;
        this.roll = roll;
        this.mark = mark;
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

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", mark=" + mark +
                '}';
    }
}