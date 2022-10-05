package LemdaExpresstion;

public class Student {
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
}

interface Inter2 {
    public void printDetails( Student student);
}

class main2 {
    public static void main(String[] args) {
//        Object a = new Student("brajesh",3,33);
        Inter2 i3 = (s) -> {
            System.out.println(s.getName());
            System.out.println(s.getRoll());
            System.out.println(s.getMark());

        };
        i3.printDetails(new Student("brajesh",3,33) );

    }
}