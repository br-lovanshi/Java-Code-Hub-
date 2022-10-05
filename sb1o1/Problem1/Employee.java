package sb1o1.Problem1;

import LemdaExpresstion.Inter;
import java.lang.String;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Employee implements Comparable<Employee>{
    private int employId;
    private String name,address;

    public Employee(int employId, String name, String address) {
        this.employId = employId;
        this.name = name;
        this.address = address;
    }

    public int getEmployId() {
        return employId;
    }

    public void setEmployId(int employId) {
        this.employId = employId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employId=" + employId +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
      return name.compareTo(o.name);
//    String a = this.getName();
//    if(a > o.getName()){
//        return +1;
//    } else if (a < o.getName()) {
//        return -1;
//    }
//    else {
//        return  0;
//    }

    }
    }
//class ShortByAlphaCom implements Comparable<Employee> {
//
//
//
//    @Override
//    public int compareTo(Employee o) {
//
//
//        return 0;
//    }
//}
class Main1 {
    public static void main(String[] args) {

        Map<Employee,Integer> tm = new TreeMap<>();
        tm.put(new Employee(1,"brajesh","INdore"),200000);
        tm.put(new Employee(2,"thor","USA"),200000000);
        tm.put(new Employee(3,"tony","new york"),20202345);
        tm.put(new Employee(4,"Caption America" , "Whasigton DC"),20020111);


        Set<Map.Entry<Employee, Integer>> set= tm.entrySet();

        for(Map.Entry<Employee, Integer> me : set){
//            System.out.println(me);

            Employee employee = me.getKey();
            System.out.println("Id " + employee.getEmployId());
            System.out.println("name  " + employee.getName());
            System.out.println("address  "  + employee.getAddress());

        }

    }
}