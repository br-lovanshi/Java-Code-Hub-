package sb1o1.com.StremApi.Problem3;

public class Employee {
    private String name;
    private int empid,salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpid() {
        return empid;
    }

    public void setEmpid(int empid) {
        this.empid = empid;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String name, int empid, int salary) {
        this.name = name;
        this.empid = empid;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empid=" + empid +
                ", salary=" + salary +
                '}';
    }
}
