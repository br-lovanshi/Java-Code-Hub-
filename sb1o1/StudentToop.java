package sb1o1;

import CollectionFramwork.HascodeAndEqual.Main;

import java.util.*;

public class StudentToop {
    private String name;
    private int roll,mark;

    public StudentToop(String name, int roll, int mark) {
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
        return "StudentToop{" +
                "name='" + name + '\'' +
                ", roll=" + roll +
                ", mark=" + mark +
                '}';
    }
}

class Toppers {

    public static void main(String[] args) {
        HashMap<String , StudentToop> hm = new HashMap<>();

        hm.put("MP" , new StudentToop("brajesh",1,100));
        hm.put("UP",new StudentToop("tanu",2,88));
        hm.put("JH",new StudentToop("aman",3,78));

//        Collection<StudentToop> obj
        Collection<StudentToop>  st = hm.values();
        List<StudentToop> stonj = new ArrayList<>(st);
//
//        for(StudentToop i : stonj ){
//            System.out.println(i.getName());
//            System.out.println(i.getRoll());
//            System.out.println(i.getMark());
//        }
        Set<String> states = hm.keySet();
//        for(String i : states ){
//            System.out.println(i);
//        }
        Set<Map.Entry<String ,StudentToop> > set = hm.entrySet();

        for(Map.Entry<String ,StudentToop> i : set ){
            System.out.println(i.getValue());
        }

    }
}