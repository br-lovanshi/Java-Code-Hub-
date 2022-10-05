package sb1o1.day1.learn;

import sb1o1.StudentToop;
import sb1o1.day1.problem2.Student;

import javax.print.DocFlavor;
import java.util.*;

public class StudentTop {
    private String name;
    private int roll,mark;

    public StudentTop(String name, int roll, int mark) {
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

class SortToMarks implements Comparator<StudentTop>{

    @Override
    public int compare(StudentTop o1, StudentTop o2) {
        if(o1.getMark() > o2.getMark()){
            return  +1;
        }
        else if (o1.getMark()<o2.getMark()){
            return -1;
        }
        return 0;
    }
}
class main{
    public static void main(String[] args) {
        Map<String , StudentTop> hm = new HashMap<>();

        hm.put("MP",new StudentTop("brajesh",1,100));
        hm.put("UP",new StudentTop("Tanu",2,33));
        hm.put("MP",new StudentTop("Vicky" ,3,111));

        Set<String > key = hm.keySet();

        Collection<StudentTop> val = hm.values();
        List<StudentTop> al = new ArrayList<>(val);
        for(StudentTop i : al){
//            System.out.println(i);
        }

        Set<Map.Entry<String,StudentTop>> kv = hm.entrySet();
        for(Map.Entry<String ,StudentTop> i : kv) {
//            System.out.println(i.getKey());
//            System.out.println(i.getValue());
//            List<StudentTop> ala = new ArrayList<>();
//            ala.add(i.getValue());
            StudentTop keys = i.getValue();
            System.out.println("state "  + i.getKey() );
            System.out.println("studentds " );
            System.out.println(keys.getName());
            System.out.println(keys.getRoll());
            System.out.println(keys.getMark());
        }

    }
}