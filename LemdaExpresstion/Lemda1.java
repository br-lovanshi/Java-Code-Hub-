package LemdaExpresstion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public interface Lemda1 {
    public void name(St nam);
}
class St {
    private int roll;
    private String name;

    public St(int roll, String name) {
        this.roll = roll;
        this.name = name;
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
}
class main1{
    public static void main(String[] args) {

        List<St> al = new ArrayList<>();
        al.add(new St(1,"brajesh"));
        al.add(new St(1,"brajesh lovashi"));
        al.add(new St(2,"Nidhi"));
        al.add(new St (3,"vicky"));

//        for( St i : al ){
//            System.out.println(i.getRoll());
//        }

//        Stream<St > i = al.stream();
//        i.filter(a -> (a.getRoll()>1)).forEach(a -> System.out.println(a.getName()));

//      Map ans = al.stream().collect(Collectors.toMap());
//        System.out.println(ans);

    }
}
